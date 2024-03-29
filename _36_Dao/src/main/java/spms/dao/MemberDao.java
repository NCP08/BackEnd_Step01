package spms.dao;

import java.sql.Connection;
import java.util.List;

import spms.vo.Member;

/* Dao (Data Access Object)
 * 데이터베이스는 연결하여 데이터를 입출력을 담당하는 클래스
 * 이 클래스로 만들어진 오브젝트를 Dao라고 부른다.
 * */
public class MemberDao {
	Connection connection;
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public List<Member> selectList() throws Exception{
		return null;
	}
	
	public int insert(Member member) throws Exception{
		return 0;
	}
	
	public int delete(int no) throws Exception{
		return 0;
	}
	
	public Member selectOne(int no) throws Exception{
		return null;
	}
	
	public int update(Member member) throws Exception{
		return 0;
	}
	
	public Member exist(String email, String password) throws Exception{
		return null;
	}
}















