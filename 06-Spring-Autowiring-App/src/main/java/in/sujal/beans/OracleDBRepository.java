package in.sujal.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
//@Primary
public class OracleDBRepository implements ReportDAO {

	@Override
	public void getData() {
		System.out.println("Getting data form Oracle DB.....");

	}

}
