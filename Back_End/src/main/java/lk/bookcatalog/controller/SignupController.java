package lk.bookcatalog.controller;

import lk.bookcatalog.dto.SignupDTO;
import lk.bookcatalog.service.SignupService;
import lk.bookcatalog.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/signup")
@CrossOrigin
public class SignupController {

    @Autowired
    SignupService service;

    @PostMapping
    public ResponseUtil signUp(@RequestBody SignupDTO signupDTO){
        service.signUp(signupDTO);
        return new ResponseUtil("200","Success",null);
    }

    @GetMapping(params = {"email","password"})
    public ResponseUtil getSignup(String email,String password){
        SignupDTO signupDTO = service.searchEmailAndPassword(email, password);
        return new ResponseUtil("200","Success",signupDTO);
    }
}
