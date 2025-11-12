package in.sujal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import in.sujal.model.Post;


public interface PostRepo extends JpaRepository<Post, Long>{
	List<Post> findAllByOrderByCreatedAtDesc();
}
