package com.application.Interview;

import org.springframework.web.bind.annotation.*;

import com.application.Interview.Interview;
import com.application.Interview.InterviewService;

@RestController
@RequestMapping("/interviews")
public class InterviewController {

    private final InterviewService service;

    public InterviewController(InterviewService service) {
        this.service = service;
    }

    @PostMapping
    public Interview create(@RequestBody Interview interview) {
        return service.save(interview);
    }

    @GetMapping("/{id}")
    public Interview getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
