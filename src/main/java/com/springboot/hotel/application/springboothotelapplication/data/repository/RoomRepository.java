package com.springboot.hotel.application.springboothotelapplication.data.repository;

import org.springframework.stereotype.Repository;
import com.springboot.hotel.application.springboothotelapplication.data.entity.Room;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    
}
