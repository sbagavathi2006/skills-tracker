package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("form")
    @ResponseBody
    public String controllerStudio(){
        String Initial = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1><br>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2><br>" +
                "<ol>"+
                "<li>JavaScript</li><br>" +
                "<li>Java</li><br>" +
                "<li>SpringBoot</li><br>" +
                "</ol>"+
                "</body>" +
                "</html>";

        String html = "<html>" +
                "<body>" +
                "<form action ='submit' method ='post'>" +
                "<label for='name'>Name: </label><br>" +
                "<input type = 'text' id = 'name' name = 'name' /><br><br>" +

                "<label for='skill1'>My Favorite Language: </label><br>" +
                "<select name=skill1>"+
                "<option value='Java'>Java</option>"+
                "<option value='Java Script'>JavaScript</option>"+
                "<option value='Spring Boot'>SpringBoot</option>"+
                "</select><br><br>"+

                "<label for='skill2'>My Second Favorite Language: </label><br>" +
                "<select name=skill2>"+
                "<option value='Java'>Java</option>"+
                "<option value='Java Script'>JavaScript</option>"+
                "<option value='Spring Boot'>SpringBoot</option>"+
                "</select><br><br>"+

                "<label for='skill3'>My Third Favorite Language: </label><br>" +
                "<select name=skill3>"+
                "<option value='Java'>Java</option>"+
                "<option value='Java Script'>JavaScript</option>"+
                "<option value='Spring Boot'>SpringBoot</option>"+
                "</select><br><br>"+

                "<input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return Initial+"\n\n"+html;
    }
    @RequestMapping("submit")
    @ResponseBody
    public String submission(@RequestParam String name, @RequestParam String skill1, @RequestParam String skill2, @RequestParam String skill3){
        String html = "<h1>"+name+"</h1><br>"+
                "<h3>1. "+skill1+"</h3>"+
                "<h3>2. "+skill2+"</h3>"+
                "<h3>3. "+skill3+"</h3>";
        return html;
    }
}
