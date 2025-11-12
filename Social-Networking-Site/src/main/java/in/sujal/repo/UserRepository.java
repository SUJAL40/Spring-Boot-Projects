package in.sujal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sujal.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
