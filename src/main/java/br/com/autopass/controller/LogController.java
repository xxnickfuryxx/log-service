package br.com.autopass.controller;

import br.com.autopass.model.Log;
import br.com.autopass.service.LogService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    private LogService service;

    @PostMapping(value = "/api/logService/insertLog",
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertLog(@RequestBody Log log){
        service.insertLog(log);

        return ResponseEntity.ok("{\"msg\":\"ok\"}");

    }

    @GetMapping(value = "/api/teste")
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok(new Gson().toJson("{\"msg\":\"ok\"}"));
    }
}
