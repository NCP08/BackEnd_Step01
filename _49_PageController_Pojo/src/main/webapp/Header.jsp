<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!-- 
<jsp:useBean id="member"
			scope="session"
			class="spms.vo.Member" />
 -->
<div style="background-color:#00008b;color:white;height:20px;padding:5px;">
	SPMS(Simple Project Management System)
	
	<c:if test="${!empty sessionScope.member and !empty sessionScope.member.email }">
	
		<span style="float:right">${sessionScope.member.name }
			<a style="color:white;" href="<%=request.getContextPath() %>/auth/logout.do">로그아웃</a>
		</span>
	
	</c:if>
</div>