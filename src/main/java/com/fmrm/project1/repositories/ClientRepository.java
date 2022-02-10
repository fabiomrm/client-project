package com.fmrm.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fmrm.project1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
