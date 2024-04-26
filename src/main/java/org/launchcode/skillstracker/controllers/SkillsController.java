package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping
public class SkillsController {
    @GetMapping //display view
    public String displayPage(){
     return "<html>" +
             "<head>" +
             "</head>" +
             "<h1>Skills Tracker</h1>"+
             "<h2>We have a few skills we would like to learn."+
             " Here is the list!</h2>"+
             "<body>" +
             "<ol>"+
             "<li>Java</li>"+
             "<li>Javascript</li>"+
             "<li>Python</li>"+
             "<li>C++</li>"+
             "<li>C#</li>"+
             "<li>Ruby</li>"+
             "<li>PHP</li>"+
             "<li>Kotlin</li>"+
             "</ol>"+
             "</body>" +
             "</html>";
 }


    @GetMapping("/form") //form view
    public String skillsForm() {
        return  "<form action='/form' method='POST'>" +
                "<label>" +
                "<h1>Name: </h1>" +
                "</label>"+
                "<input type='text' name='name'/><br/><br/>" +
                "<label>My first favorite language: </label><br/>"+
                "<select name='language1'><br/>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "<option value='C++'>C++</option>"+
                "<option value='C#'>C#</option>"+
                "<option value='Ruby'>Ruby</option>"+
                "<option value='Php'>PHP</option>"+
                "<option value='Kotlin'>Kotlin</option>"+
                "</select><br/><br/>"+
                "<label>My second favorite language: </label><br/>"+
                "<select name='language2'><br/>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "<option value='C++'>C++</option>"+
                "<option value='C#'>C#</option>"+
                "<option value='Ruby'>Ruby</option>"+
                "<option value='Php'>PHP</option>"+
                "<option value='Kotlin'>Kotlin</option>"+
                "</select><br/><br/>"+
                "<label>My third favorite language: </label><br/>"+
                "<select name='language3'><br/>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "<option value='C++'>C++</option>"+
                "<option value='C#'>C#</option>"+
                "<option value='Ruby'>Ruby</option>"+
                "<option value='Php'>PHP</option>"+
                "<option value='Kotlin'>Kotlin</option>"+
                "</select><br/><br/>"+
                "<input type='submit' value='Submit'/><br/>" +
                "</form>";
    }



//    @PostMapping("/form") //regular list
//    public String formPost(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
//        return "<h1>" +
//                name +
//                "</h1>" +
//                "<ol>" +
//                "<li>" +
//                language1 +
//                "</li>" +
//                "<li>" +
//                language2 +
//                "</li>" +
//                "<li>" +
//                language3 +
//                "</li>" +
//                "</ol>";
//    }

    @PostMapping("/form") //table list
    public String skillsOrderList (@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        if(name.isEmpty())
           name="Anonymous";
        return  "<html>+" +
                "<style>table, th, td{border:1px solid black; border-radius: 10px; " +
                "text-align: center;}" +
                "th, td {padding: 15px;}"+
                "h1 { font-size: 33px;}"+
                "th { font-size: 22px;}"+
                "td { font-size: 15px;}"+
                "table {border-spacing: 30px;}" +
                "</style>"+
                "<style>h1{text-align: center; }</style>"+
                "<body>"+
                "<h1>" +
                name +
                "</h1>" +
                "<table style='width:100%'>"+
                "<tr>" +
                "<th>" +
                "My first favorite language" +
                "</th>" +
                "<th>" +
                "My second favorite language" +
                "</th>" +
                "<th>" +
                "My third favorite language" +
                "</th>" +
                "</tr>" +"<tr>" +
                "<td>" + language1 + "</td>" +
                "<td>" + language2 + "</td>" +
                "<td>" + language3 + "</td>" +
                "</tr>"+
                "</table>"+
                "</body>"+
                "</html>";
    }
}
