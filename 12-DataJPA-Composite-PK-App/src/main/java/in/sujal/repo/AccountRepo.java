package in.sujal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sujal.entity.Account;
import in.sujal.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK> {

}
