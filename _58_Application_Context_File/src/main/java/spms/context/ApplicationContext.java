package spms.context;

import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

// application-context.properties 파일을 읽어서 필요한 객체를 준비/저장
public class ApplicationContext {

	// properties파일이 key=value 구조로 되어 있기때문에 Map을 사용한다.
	Map<String, Object> objTable = new Hashtable<>();
	
	public Object getBean(String key) {
		return objTable.get(key);
	}
	
	public ApplicationContext(String propertiesPath) throws Exception{
		Properties props = new Properties();
		props.load(new FileReader(propertiesPath));
		
		prepareObjects(props);
		injectDependency();
	}
}













