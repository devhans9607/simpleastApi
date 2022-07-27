package com.jindule.jinduleapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class Controller {
    @PostMapping("/ap_adm/AP_Admin_SMS/insert_sms")
    public ResponseEntity<?> login(@RequestBody String message) {
        log.error("API REQUESTED: {}", message);
        return new ResponseEntity<> ("", HttpStatus.OK);
    }

    @PostMapping("/ap_adm/AP_Admin_SMS/bulk_sms")
    public ResponseEntity<?> bulk(@RequestBody String message) {
        log.error("API REQUESTED: {}", message);
        return new ResponseEntity<> ("", HttpStatus.OK);
    }

    @GetMapping("/ap_adm/Ap_Admin_Ping")
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok().build();
    }
}
