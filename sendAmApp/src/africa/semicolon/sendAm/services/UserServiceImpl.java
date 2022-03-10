package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.models.User;
import africa.semicolon.sendAm.data.repositories.UserRepository;
import africa.semicolon.sendAm.data.repositories.UserRepositoryImpl;
import africa.semicolon.sendAm.exceptions.RegisterFailureException;
import dtos.requests.RegisterUserRequest;
import dtos.responses.FindUserResponse;
import dtos.responses.RegisterUserResponse;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public RegisterUserResponse register(RegisterUserRequest requestForm) {
        requestForm.setEmailAddress(requestForm.getEmailAddress().toLowerCase());
        if(emailExist(requestForm.getEmailAddress()))throw new RegisterFailureException("Duplicate email error");
        User owner = new User();
//        String fullName=requestForm.getFirstName()+ " " +requestForm.getLastName();
//        String email = requestForm.getEmailAddress();
        owner.setEmail(requestForm.getEmailAddress());
        owner.setAddress(requestForm.getAddress());
        owner.setFullName(requestForm.getFirstName()+ " "+requestForm.getLastName());
        owner.setPhoneNumber(requestForm.getPhoneNumber());

        User savedUser = userRepository.create(owner);
        RegisterUserResponse response= new RegisterUserResponse();
        response.setEmail(savedUser.getEmail());
        response.setFullName(savedUser.getFullName());
        return response;
    }
    private boolean emailExist(String emailAddress){
        User owner = userRepository.findByEmail(emailAddress);
        if(owner != null)return true;
        return false;
    }
    @Override
    public UserRepository getRepository(){
        return userRepository;
    }
    @Override
    public FindUserResponse findUserByEmail(String email){
        User user =userRepository.findByEmail(email);
        //create Response
        FindUserResponse response= new FindUserResponse();
        response.setEmail(user.getEmail());
        response.setFullName(user.getFullName());
        return response;
    }
}
