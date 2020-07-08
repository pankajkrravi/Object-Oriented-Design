package com.goomo.document.repos;

import org.springframework.data.repository.CrudRepository;

import com.goomo.document.entities.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {
    
}
