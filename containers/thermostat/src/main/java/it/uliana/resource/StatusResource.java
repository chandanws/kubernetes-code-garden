package it.uliana.resource;


import it.uliana.dto.Status;
import it.uliana.repository.StatusRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/thermostat")
public class StatusResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(StatusResource.class);

    @Autowired
    private StatusRepository statusRepository;

    @PostConstruct
    public void post() {
        if (statusRepository.last().size() == 0) {
            Status status = new Status();
            status.setValue(22);
            statusRepository.save(status);
        }
    }

    @PostMapping
    public ResponseEntity<Status> insert(@RequestBody Status status) {
        Status p = statusRepository.save(status);
        return ResponseEntity.ok(p);
    }

    @GetMapping
    public ResponseEntity<Status> status() {
        Status status = statusRepository.last().get(0);
        return ResponseEntity.ok(status);
    }


}
