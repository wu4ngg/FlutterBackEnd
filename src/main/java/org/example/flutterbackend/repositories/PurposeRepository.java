package org.example.flutterbackend.repositories;

import org.example.flutterbackend.models.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurposeRepository extends JpaRepository<Purpose, Integer> {
}
