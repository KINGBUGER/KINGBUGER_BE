package org.example.project_back.domain.auth.signup.dto;

import lombok.Data;

@Data
public class ReqSignupDto {
    private String username;
    private String email;
    private String password;
    private String name;
    private String role;
}
