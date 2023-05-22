package exam.springboot.jpa.library.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "library")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lbno;

    private String lbname;

    private String sido;

    private String gugun;

    private String lbtype;

    private String clsday;

    private String addr;

    private String phone;

    private String homepage;

    private Double lat;

    private Double lon;

    @CreatedDate
    @Column(insertable = false, updatable = false)
    private LocalDateTime regdate;
}
