package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY )
    private long roleid;

    @Column(name = "roll_name")
    private ERole rollName;

}
