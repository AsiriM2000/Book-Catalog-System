package lk.bookcatalog.repo;

import lk.bookcatalog.dto.SignupDTO;
import lk.bookcatalog.entity.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
public interface SignupRepo extends JpaRepository<Signup, String> {
    Signup findByEmailAndPassword(String email,String password);
}
