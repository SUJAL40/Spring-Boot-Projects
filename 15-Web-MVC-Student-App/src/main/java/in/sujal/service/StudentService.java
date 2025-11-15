package in.sujal.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<String> getCouses(){
		return Arrays.asList("Java","Python","AWS","Devops");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Morning","Afternoon","Evening");
	}
	
}
