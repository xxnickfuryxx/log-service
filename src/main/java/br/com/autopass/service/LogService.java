package br.com.autopass.service;

import br.com.autopass.model.Log;
import br.com.autopass.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService  {

    @Autowired
    private LogRepository repository;

    public void insertLog(Log log){
        repository.save(log);
    }

}
