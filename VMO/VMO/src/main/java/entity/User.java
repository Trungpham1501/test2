package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "userid")
    private int userid;

    @Column(name="center_id" )
    private int centerid;

    @Column(name = " user_grade_id" )
    private int userGradeid;

    @Column(name="user_name")
    private String userName;

    @Column(name="full_name" )
    private String fullName;

    @Size(max = 120)
    @Column(name="password" )
    private String password;

    @Column(name="coding_language" )
    private String codingLanguage;

    @Column(name="email",unique = true )
    private String email;

}
