package com.cg.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hms.Entity.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

}
