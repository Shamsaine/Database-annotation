package com.example.database.repository;

import com.example.database.DatabaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks this as a repository component
public interface DatabaseRepository extends JpaRepository<DatabaseModel, Long> {
    // JpaRepository provides built-in CRUD methods
}
