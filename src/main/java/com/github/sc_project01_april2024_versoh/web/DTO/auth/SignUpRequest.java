package com.github.sc_project01_april2024_versoh.web.DTO.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
}