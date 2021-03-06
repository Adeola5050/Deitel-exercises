package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponse;
import africa.semicolon.phoneBook.dtos.responses.FindUserResponse;

import java.util.List;

public interface AddContactService {

    AddContactResponse save(AddContactRequest requests);

    ContactRepository getRepository();


    List<FindUserResponse> findUserByName(String name);

    void delete(AddContactRequest requests);

    FindUserResponse findUserByMobile(String mobile);
}
