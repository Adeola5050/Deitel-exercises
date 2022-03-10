//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.exceptions.RegisterFailureException;
import africa.semicolon.sendAm.exceptions.SendAmAppException;
import africa.semicolon.sendAm.exceptions.UserNotFoundException;
import dtos.requests.RegisterUserRequest;
import dtos.responses.FindUserResponse;
import dtos.responses.RegisterUserResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceImplTest {
    private UserService userService;

    UserServiceImplTest() {
    }

    @BeforeEach
    void testSetup() {
        this.userService = new UserServiceImpl();
    }

    @Test
    void afterRegister_repositoryContainsOneElement() {
        RegisterUserRequest newForm = this.createRegisterForm();
        this.userService.register(newForm);
        Assertions.assertEquals(1, this.userService.getRepository().count());
    }

    private RegisterUserRequest createRegisterForm() {
        RegisterUserRequest registerForm = new RegisterUserRequest();
        registerForm.setFirstName("Increase");
        registerForm.setLastName("Uwadiale");
        registerForm.setEmailAddress("sugarlove@email.com");
        registerForm.setAddress("home sweet home");
        registerForm.setPhoneNumber("69");
        return registerForm;
    }

    @Test
    public void duplicateEmail_throwExceptionTest() {
        RegisterUserRequest newForm = this.createRegisterForm();
        this.userService.register(newForm);
        Assertions.assertThrows(SendAmAppException.class, () -> {
            this.userService.register(newForm);
        });
        Assertions.assertThrows(RegisterFailureException.class, () -> {
            this.userService.register(newForm);
        });
    }

    @Test
    public void duplicateEmailWithDifferentCase_throwExceptionTest() {
        RegisterUserRequest newForm = this.createRegisterForm();
        this.userService.register(newForm);
        newForm.setEmailAddress("sugarLove@email.com");
        Assertions.assertThrows(SendAmAppException.class, () -> {
            this.userService.register(newForm);
        });
        Assertions.assertThrows(RegisterFailureException.class, () -> {
            this.userService.register(newForm);
        });
    }

    @Test
    public void registrationReturnsCorrectResponseTest() {
        RegisterUserRequest newForm = this.createRegisterForm();
        RegisterUserResponse response = this.userService.register(newForm);
        Assertions.assertEquals("Increase Uwadiale", response.getFullName());
        Assertions.assertEquals("sugarlove@email.com", response.getEmail());
    }

    @Test
    public void findRegisteredUserByEmailTest() {
        RegisterUserRequest newForm = this.createRegisterForm();
        this.userService.register(newForm);
        FindUserResponse response = this.userService.findUserByEmail(newForm.getEmailAddress().toLowerCase());
        Assertions.assertEquals("Increase Uwadiale", response.getFullName());
        Assertions.assertEquals("sugarlove@email.com", response.getUserEmail());
    }

    @Test
    public void findUnRegisteredUserByEmail_throwsExceptionTest() {
        RegisterUserRequest newForm = this.createRegisterForm();
        this.userService.register(newForm);
        Assertions.assertThrows(UserNotFoundException.class, () -> {
            this.userService.findUserByEmail("miju@email.com");
        });
    }

    @Test
    public void findUserByEmailIsNotCaseSensitiveTest() {
        RegisterUserRequest newForm = this.createRegisterForm();
        this.userService.register(newForm);
        FindUserResponse response = this.userService.findUserByEmail("sugarLOVE@email.com");
        Assertions.assertEquals("Increase Uwadiale", response.getFullName());
        Assertions.assertEquals("sugarlove@email.com", response.getUserEmail());
    }
}
