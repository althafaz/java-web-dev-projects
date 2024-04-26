package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("hello")
    @ResponseBody
    public String mainMenu(){
        return "<html>" +
                "<head>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<ul>" +
                "<li>01. Java</li>" +
                "<li>02. Javascript</li>" +
                "<li>03. Python</li>" +
                "</ul>" +
                "</body></head></html>";
    }
}
