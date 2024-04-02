package spms.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* DispatchServlet은 Spring에서 사용하는 DesignPattern을 사용한 클래스 명칭이다.
 * 이 역할은 *.do로 들어오는 모든 주소를 일단 받아서 분기시켜주는 역할이다.
 * 이 서블릿을 설계상에서 FrontController라고 부른다.
 * */

@SuppressWarnings("serial")
@WebServlet("*.do")
public class DispatchServlet extends HttpServlet{

	// get요청/post요청을 모두 받기 위해 구현하는 메서드
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=UTF-8");
		
		// 요청 주소를 얻는다. 이 주소에 따라 Page Controller를 찾아서 분기처리한다.
		String servletPath = req.getServletPath();
		System.out.println("DispatchServlet::service() - servletPath=" + servletPath);
		
		try {
			String pageControllerPath = null;
			
			/* 1. 주소에 따라 처리할 pagetControllerPath를 지정한다.
			 * 2. 주소에 따라 약속된 Parameter를 꺼내서 request공유공간에 저장한다.*/
			if("/member/list.do".equals(servletPath)) {
				pageControllerPath = "/member/list";
			}else if("/member/add.do".equals(servletPath)) {
				pageControllerPath = "/member/add";
			}else if("/member/update.do".equals(servletPath)) {
				pageControllerPath = "/member/update";
			}else if("/member/delete.do".equals(servletPath)) {
				pageControllerPath = "/member/delete";
			}else if("/auth/login.do".equals(servletPath)) {
				pageControllerPath = "/auth/login";
			}else if("/auth/logout.do".equals(servletPath)) {
				pageControllerPath = "/auth/logout";
			}
			
			// pageController에 처리를 넘긴다.
			// include방식이므로 pageController가 처리한 후에 제어권이 다시 넘어온다.
			RequestDispatcher rd = req.getRequestDispatcher(pageControllerPath);
			rd.include(req, resp);
			
			// pageControllerPath가 지정해준 viewUrl값을 꺼내서 화면 생성을 맡긴다.
			String viewUrl = (String)req.getAttribute("viewUrl");
			// viewUrl이 'redirect:'로 시작되는 문자열이면 redirect 요청이라고 판단하고 처리한다. 
			if(viewUrl.startsWith("redirect:")) {
				// viewUrl에서 'redirect:' 글자를 제외한 나머지 url를 추출해서 
				// 브라우저에 redirect 요청을 보낸다.
				// 브라우저는 redirect 요청을 받으면 해당 url로 새롭게 다시 접속한다.
				resp.sendRedirect(viewUrl.substring("redirect:".length()));
				return;
			}
			// 만약 'redirect:'로 시작되는 viewUrl이 아니면 내부 jsp이동으로 판단한다.
			else {
				rd = req.getRequestDispatcher(viewUrl);
				rd.include(req, resp);
			}
		}catch(Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e);
			RequestDispatcher rd = req.getRequestDispatcher("/Error.jsp");
			rd.forward(req, resp);
		}
	}
}










