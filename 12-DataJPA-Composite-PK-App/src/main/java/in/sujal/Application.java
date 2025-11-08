package in.sujal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sujal.entity.Account;
import in.sujal.entity.AccountPK;
import in.sujal.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountRepo bean = context.getBean(AccountRepo.class);
		//Setting Composite Key Value
		AccountPK pk = new AccountPK();
		pk.setAccNum(15428L);
		pk.setAccType("Saving");
		//Setting entity data
		Account acc = new Account();
		acc.setHolderName("Khot");
		acc.setBranch("Ichalkaranji-1");
		acc.setAccountPK(pk);
		bean.save(acc);
		System.out.println("Record Saved.....");
	}

}
