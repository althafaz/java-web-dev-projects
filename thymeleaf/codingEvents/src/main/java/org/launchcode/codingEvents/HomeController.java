package org.launchcode.codingEvents;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("")
    public String getIndexPage() {
        return "index";
    }
}
