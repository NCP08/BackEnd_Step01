package spms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import spms.vo.Member;

/* Dao (Data Access Object)
 * 데이터베이스는 연결하여 데이터를 입출력을 담당하는 클래스
 * 이 클래스로 만들어진 오브젝트를 Dao라고 부른다.
 * */
public class MemberDao {
	Connection connection;
	
	private String strSelectList = 
			"SELECT mno,mname,email,cre_date FROM members ORDER BY mno ASC";
	private String strInsert = 
			"INSERT INTO members(email,pwd,mname,cre_date,mod_date) VALUES(?,?,?,NOW(),NOW())";
	private String strDelete = 
			"DELETE FROM members WHERE mno=?";
	private String strSelectOne = 
			"SELECT mno,email,mname,cre_date FROM members WHERE mno=?";
	private String strUpdate =
			"UPDATE members SET email=?, mname=?, mod_date=NOW() WHERE mno=?";
	private String strExist = 
			"SELECT mname, email FROM members WHERE email=? AND pwd=?";
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	// MemberListServlet에서 필요
	public List<Member> selectList() throws Exception{
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(strSelectList);
		}catch(Exception e) {
			
		}finally {
			
		}
		
		return null;
	}
	
	// MemberAddServlet에서 필요
	public int insert(Member member) throws Exception{
		return 0;
	}
	
	// MemberDeleteServlet에서 필요
	public int delete(int no) throws Exception{
		return 0;
	}
	
	// MemberUpdateServlet에서 get요청시 필요
	public Member selectOne(int no) throws Exception{
		return null;
	}
	
	// MemberUpdateServlet에서 post요청시 필요
	public int update(Member member) throws Exception{
		return 0;
	}
	
	// LogInServlet에서 필요
	public Member exist(String email, String password) throws Exception{
		return null;
	}
}















