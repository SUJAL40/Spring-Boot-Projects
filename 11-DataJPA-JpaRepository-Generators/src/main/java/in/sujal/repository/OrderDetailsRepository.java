package in.sujal.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import in.sujal.entity.Order_DetailsEntity;

public interface OrderDetailsRepository extends JpaRepository<Order_DetailsEntity, Serializable> {
}
