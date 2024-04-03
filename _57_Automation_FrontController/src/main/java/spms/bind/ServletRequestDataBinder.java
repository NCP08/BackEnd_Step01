package spms.bind;

import java.sql.Date;

import javax.servlet.ServletRequest;

public class ServletRequestDataBinder {

	// request로부터 Parameter를 추출해서
	// dataType 클래스 정보를 바탕으로 
	// dataName으로 객체를 생성한다.
	public static Object bind(
			ServletRequest request, 
			Class<?> dataType,
			String dataName) throws Exception{
		
		return null;
	}
	
	// 클래스 타입이 기본 타입인지, 아니면 사용자 정의 타입인지
	private static boolean isPrimitiveType(Class<?> type) {
		if(type.getName().equals("int") || type == Integer.class ||
		   type.getName().equals("long") || type == Long.class ||
		   type.getName().equals("float") || type == Float.class ||
		   type.getName().equals("double") || type == Double.class ||
		   type.getName().equals("boolean") || type == Boolean.class ||
		   type == Date.class || type == String.class
		   )
			return true;
		
		return false;			
	}
	
	// 클래스 타입에 따라 객체를 생성하는 메서드
	private static Object createValueObject(Class<?> type, String value) {
		return null;
	}
}








