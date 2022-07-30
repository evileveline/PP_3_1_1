package web.model;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity(name = User.PERSISTANCE_NAME)
@Table(name = "users")

public class User {

    static final String PERSISTANCE_NAME = "User";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private byte age;

}