package lk.bookcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SignupDTO {
    private  String email;
    private  String password;
}
