package ua.vadym.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.vadym.jokeapp.services.JokeService;

@Controller
public class JokeController {

    private final JokeService service;

    @Autowired
    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", service.getJoke());

        return "chucknorris";
    }
}
