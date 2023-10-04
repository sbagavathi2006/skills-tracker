package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    @GetMapping
    public String displayAllEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple WMC");
        events.add("Spring One Platform");
        model.addAttribute("events",events);
        return "events/index";
    }

   // live at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){

        return "events/create";
    }
}
