package az.developia.spring_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/books")
    public String showBooks(Model model) {
         
        model.addAttribute("books", new String[] { "Kitab 1", "Kitab 2", "Kitab 3" });
        return "books"; 
    }
}
