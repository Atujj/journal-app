package com.learn.journalApp.repository;

import com.learn.journalApp.entity.JournalEntry;
import com.learn.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
}
