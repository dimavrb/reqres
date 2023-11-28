package reqres.models.login;

import lombok.Data;

@Data
public class LoginRequestModel {
    String email, password;
}