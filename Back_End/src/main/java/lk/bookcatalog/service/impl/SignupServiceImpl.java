package lk.bookcatalog.service.impl;

import lk.bookcatalog.dto.SignupDTO;
import lk.bookcatalog.entity.Signup;
import lk.bookcatalog.repo.SignupRepo;
import lk.bookcatalog.service.SignupService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@Service
@Transactional
public class SignupServiceImpl implements SignupService {

    @Autowired
    SignupRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void signUp(SignupDTO signupDTO) {
        repo.save(mapper.map(signupDTO,Signup.class));
    }
}
