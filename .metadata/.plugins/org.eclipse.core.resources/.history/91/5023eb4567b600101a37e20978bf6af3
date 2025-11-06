package in.sujal;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean,DisposableBean{
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method.....");
		
	}
	
	public void destroy() {
		System.out.println("Closing DB Donnection.....(destroy)");
	}

	
	public void getData() {
		System.out.println("Getting data from DB.....");
	}
	
	
}
