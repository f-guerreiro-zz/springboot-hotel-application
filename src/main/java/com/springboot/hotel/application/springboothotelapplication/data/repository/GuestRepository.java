package com.springboot.hotel.application.springboothotelapplication.data.repository;

import com.springboot.hotel.application.springboothotelapplication.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
