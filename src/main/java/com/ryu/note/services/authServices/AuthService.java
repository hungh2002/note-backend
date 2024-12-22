package com.ryu.note.services.authServices;

import com.ryu.note.dto.authDTO.SignInDTO;
import com.ryu.note.dto.authDTO.SignUpDTO;
import com.ryu.note.entity.User;

public interface AuthService {
    public User signIn(SignInDTO signInDTO);

    public void signUp(SignUpDTO signUpDTO);

}
