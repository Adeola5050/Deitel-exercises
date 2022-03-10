package africa.semicolon.sendAm.data.repositories;

import africa.semicolon.sendAm.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    UserRepositoryImpl userRepository;
    @BeforeEach
    public void setUp(){
        userRepository=new UserRepositoryImpl();
    }

    @Test
    public void userCanBeCreated() {
        User aUser=new User();
        User savedUser= userRepository.save(aUser, "sugarlove@gmail.com");
        assertNotNull(savedUser);
    }

    @Test
    public void userCanBeFoundByEmail() {
        //given
        User aUser= new User();
        //when
        User savedUser = userRepository.save(aUser,"sugarlove@gmail.com");
        String savedEmail= savedUser.getEmail();
        //assert
        assertNotNull(savedUser.getEmail());
        assertEquals(savedEmail,savedUser.getEmail());
    }

    @Test
public void threeUsersCanNeSaved(){
    //Given
        User xUser = new User();
        User aEmail = new User();
        User bUser= new User();
        User bEmail = new User();
        User cUser= new User();
        User cEmail= new User();

        //when
        User savedUser= userRepository.save(xUser);
        User savedUser2= userRepository.save(bUser);
        User savedUser3 = userRepository.save(cUser);
        assertEquals(3, userRepository.count());



    }
    public void userDetails(){
        User xUser= new User();
        String aEmail="sugarlove@gmail.com";
        User bUser= new User();
        String bEmail="sugarlove@gmail.com";
        User cUser= new User();
        String cEmail="sugarlove@gmail.com";

        User savedUser= userRepository.save(xUser, aEmail);
        User savedUser2= userRepository.save(bUser, bEmail);
        User savedUser3= userRepository.save(cUser, cEmail);
    }
    @Test
    void deleteUserByEmail(){
        //Given
        userDetails();
        //when
        userRepository.delete("sugarlove@gmail.com");
        //Assert
        assertEquals(2, userRepository.count());
    }
    @Test
    void userCanBeGottenByEmailAfterDelete(){
        userDetails();
        userRepository.delete("sugarlove@gmail.com");
        assertNull(userRepository.findById("sugarlove@gmail.com"));
    }
    @Test
    void userCanBeAddedAfterDelete(){

    }
}
