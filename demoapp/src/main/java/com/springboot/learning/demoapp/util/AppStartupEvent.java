package com.springboot.learning.demoapp.util;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.springboot.learning.demoapp.data.Room;
import com.springboot.learning.demoapp.data.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{

    private final RoomRepository roomrepo;
    
    public AppStartupEvent(RoomRepository roomrepo) {
        this.roomrepo = roomrepo;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
       Iterable<Room> rooms=this.roomrepo.findAll();
       rooms.forEach(System.out::println);
    }
    
}
