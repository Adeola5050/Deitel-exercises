package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.repositories.UserRepository;
import dtos.requests.RegisterUserRequest;
import dtos.responses.FindUserResponse;
import dtos.responses.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse register(RegisterUserRequest requestForm);

    UserRepository getRepository();

    FindUserResponse findUserByEmail(String email);

}

