package com.springboot.learning.demoapp.data;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long>{
    
    Iterable<Reservation> findReservationbyDate(Date date);
     //2022-01-01
}
