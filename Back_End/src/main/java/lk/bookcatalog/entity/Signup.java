package lk.bookcatalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String email;
    private  String password;
}
