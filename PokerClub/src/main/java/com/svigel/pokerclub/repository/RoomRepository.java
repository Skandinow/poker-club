package com.svigel.pokerclub.repository;

import com.svigel.pokerclub.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByName(String name);
}
