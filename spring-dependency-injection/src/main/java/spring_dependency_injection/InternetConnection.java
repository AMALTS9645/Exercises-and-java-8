package spring_dependency_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //@Repository or @Service
public class InternetConnection {
	
	@Value("${connection-type}")
	private String connectionType;
	
	public InternetConnection() {
		System.out.println("Internet Connection object created");
		
	}

	
	
	
	public String getConnectionType() {
		return connectionType;
	}




	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}




	public void browse() {
		System.out.println("Browsing internet...");
		System.out.println("connectiontype: "+connectionType);
		
	}

}
