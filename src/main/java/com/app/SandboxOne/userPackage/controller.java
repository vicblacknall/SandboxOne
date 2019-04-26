package com.app.SandboxOne.userPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2

@RestController
public class controller{
    @Autowired
   UserRepo userRepo;

    @Autowired
    ObjectMapper objectMapper;


    @GetMapping("/users")
    public String geterrbody(){
        log.info( userRepo.findAll());
        return "Good";
    }

    @SneakyThrows
    @GetMapping("/setup")
    public void setUp(){
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        User masterUser = objectMapper.readValue(classLoader.getResource("users.json"), User.class);
userRepo.save(masterUser);
    }
}
