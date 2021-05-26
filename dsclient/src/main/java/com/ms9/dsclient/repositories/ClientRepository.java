package com.ms9.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms9.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
