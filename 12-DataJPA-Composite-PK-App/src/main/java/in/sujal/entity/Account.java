package in.sujal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="account_tbl")
public class Account {
	
	@EmbeddedId
    private AccountPK accountPK;

    @Column(name = "holder_name")
    private String holderName;

    @Column(name = "branch")
    private String branch;
}
