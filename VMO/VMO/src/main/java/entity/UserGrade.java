package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_grade")
public class UserGrade {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "user_grade_id")
        private Long userGradeId;

        @Column(name = "exercise1")
        private Long exercise1;

        @Column(name = "exercise2")
        private Long exercise2;

        @Column(name = "exercise3")
        private Long exercise3;
}
