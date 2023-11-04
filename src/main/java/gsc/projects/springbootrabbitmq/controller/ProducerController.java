package gsc.projects.springbootrabbitmq.controller;


import gsc.projects.springbootrabbitmq.service.ProducerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ProducerController {


    private final ProducerService producerService;


    @GetMapping("/publish")
    public ResponseEntity<?> send(@RequestParam("message") String message){
            producerService.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully");
    }

}
