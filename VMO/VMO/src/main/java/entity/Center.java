package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
@Getter
@Setter
@Table(name = "center")
public class Center {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long centerid;

    @Column(name = "center_name")
    private String centerName;


}
