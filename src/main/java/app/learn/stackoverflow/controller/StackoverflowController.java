package app.learn.stackoverflow.controller;

import app.learn.stackoverflow.model.StackoverflowWebsite;
import app.learn.stackoverflow.service.StackoverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackoverflowController {
    @Autowired
    private StackoverflowService stackoverflowService;

    @GetMapping
    public List<StackoverflowWebsite> getListOfProviders() throws URISyntaxException {
        return stackoverflowService.findAll();
    }
}
