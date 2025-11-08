package in.sujal.entity;

import java.util.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_dtls")
@Data
public class Order_DetailsEntity {

    @Id
    @Column(name = "order_id")
    @GenericGenerator(name = "order_id_gen", strategy = "in.sujal.generator.OrderIdGenerator")
    @GeneratedValue(generator = "order_id_gen")
    private String orderId;

    @Column(name = "order_by")
    private String orderBy;

    @Column(name = "order_placed_dt")
    @Temporal(TemporalType.DATE)
    private Date orderPlacedDate;
}
