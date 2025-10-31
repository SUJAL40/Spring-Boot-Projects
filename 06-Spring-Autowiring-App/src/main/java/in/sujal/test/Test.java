package in.sujal.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sujal.AppConfig;
import in.sujal.beans.ReportService;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = context.getBean(ReportService.class);
		service.generateReport();
	}
}
