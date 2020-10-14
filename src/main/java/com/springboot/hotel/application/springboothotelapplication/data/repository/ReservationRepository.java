package com.springboot.hotel.application.springboothotelapplication.data.repository;

import com.springboot.hotel.application.springboothotelapplication.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
