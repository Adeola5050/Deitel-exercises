package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryTest {
    @DataMongoTest
    public class ContactRepositoryTest {
        @Autowired
        private ContactRepository repository;

        @Test
        public void saveContactTest() {
            Contact contact = new Contact();
            contact.setFirstName("vin");
            contact.setMiddleName("ven");
            contact.setLastName("van");
            contact.setMobile("12345");
            contact.setOffice("uba");
            Contact saveContact = repository.save(contact);

            assertNotNull(saveContact.getId());
//        assertEquals(1,repository.count());
            assertThat(saveContact.getId(), is(notNullValue()));
            assertThat(repository.count(), is(1L));
        }


    }
