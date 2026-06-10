package com.atuj.journalapp.repository;

import com.atuj.journalapp.entity.JournalEntry;
import com.atuj.journalapp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);
}
