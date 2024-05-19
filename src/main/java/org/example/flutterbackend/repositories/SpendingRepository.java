package org.example.flutterbackend.repositories;

import org.example.flutterbackend.models.Spending;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface SpendingRepository extends JpaRepository<Spending, Integer> {
    List<Spending> findAllByDate(Date date);
}
