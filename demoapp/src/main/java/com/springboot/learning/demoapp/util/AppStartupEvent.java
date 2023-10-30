package com.springboot.learning.demoapp.util;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.springboot.learning.demoapp.data.Guest;
import com.springboot.learning.demoapp.data.GuestRepository;
import com.springboot.learning.demoapp.data.Reservation;
import com.springboot.learning.demoapp.data.ReservationRepository;
import com.springboot.learning.demoapp.data.Room;
import com.springboot.learning.demoapp.data.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{


    private final RoomRepository roomrepo;
    private final GuestRepository guestrepo;
    private final ReservationRepository reservrepo;
    
    public AppStartupEvent(RoomRepository roomrepo, GuestRepository guestrepo, ReservationRepository reservrepo) {
        this.roomrepo = roomrepo;
        this.guestrepo = guestrepo;
        this.reservrepo = reservrepo;
    }

    
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
       Iterable<Room> rooms=this.roomrepo.findAll();
       Iterable<Guest> guests=this.guestrepo.findAll();
       Iterable<Reservation> reservations=this.reservrepo.findAll();
       System.out.println("*********Rooms***********");
       rooms.forEach(System.out::println);
       System.out.println("*********Guests***********");
       guests.forEach(System.out::println);
       System.out.println("*********Reservations***********");
       reservations.forEach(System.out::println);
    }
    
}
