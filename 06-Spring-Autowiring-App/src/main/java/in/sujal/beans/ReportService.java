package in.sujal.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
//	@Autowired
//	@Qualifier("mysqlDao")
	private ReportDAO dao;
	
	//below code for constructor injection
	@Autowired
	public ReportService(ReportDAO dao) {
		System.out.println("ReportService::constructor");
		this.dao = dao;
	}
	
	//below code for setter injection
//	@Autowired
//	public void setDao(ReportDAO dao) {
//		System.out.println("setter injection");
//		this.dao = dao;
//	}
//
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated......");
	}
	
}
