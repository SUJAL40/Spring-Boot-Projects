package in.sujal.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable{
	  @Column(name = "acc_num")
	    private Long accNum;

	    @Column(name = "acc_type")
	    private String accType;
	    
}
