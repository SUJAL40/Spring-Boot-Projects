package in.sujal.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
@Primary
public class MYSQLDBRepository implements ReportDAO {

	@Override
	public void getData() {
		System.out.println("Getting data form MYSQL DB.....");

	}

}
