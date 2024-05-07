package com.homepage.likelion.test;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignupDto {

    @NotEmpty(message = "userId는 필수값입니다.")
    private String userId;
    private String email;
    private String password;
}
