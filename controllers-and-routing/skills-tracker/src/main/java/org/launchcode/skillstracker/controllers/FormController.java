package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class FormController {
    @GetMapping("form")
    public String htmlForm() {
        return "<html>" +
                "<head>" +
                "<body>" +
                "<form method='POST' action='/form/result'>" +
                "<label for='name'>Name:</label><br><br>"+
                "<input type='text' name='name' />" +
                "<br><label for='favOne'>My favorite Language:</label><br><br>"+
                "<select name='favOne'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript' >Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br><label for='favTwo'>My second favorite Language:</label><br><br>"+
                "<select name='favTwo'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br><label for='favThree'>My second favorite Language:</label><br><br>"+
                "<select name='favThree'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br><br><button type='submit'>Submit</button>" +
                "</form>" +
                "</body></head></html>";
    }

    @PostMapping("form/result")
    public String getForm(@RequestParam String name, @RequestParam String favOne, @RequestParam String favTwo, @RequestParam String favThree) {
        return "<h1>"+name+"</h1>" +
                "<br><br><ol>" +
                "<li>"+favOne+"</li>" +
                "<li>"+favTwo+"</li>" +
                "<li>"+favThree+"</li>" +
                "</ol>";
    }





}
