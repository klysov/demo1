package com.example.demo1.repository;

import com.example.demo1.model.Billionaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillionairesRepository extends JpaRepository<Billionaire, Long> {
}
