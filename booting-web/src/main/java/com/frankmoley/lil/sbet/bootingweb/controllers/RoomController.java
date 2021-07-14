package com.frankmoley.lil.sbet.bootingweb.controllers;

import com.frankmoley.lil.sbet.bootingweb.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static final List<Room> rooms = new ArrayList<>();
    static {
        for(int i = 0; i < 10 ; i++){
//            rooms.add(i, "Room"+i,"RoomX-"+i, "Q-Details 10"+i );
            rooms.add(new Room(i, "Room"+i,"RoomX-"+i, "Q-Details 10"+i));
        }

    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms",rooms);
        return "rooms";
    }
}
