package com.example.test_Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestServer server ;

    @PostMapping()
    public TestEntity add (@RequestBody TestEntity entity){
        return server.addEntity(entity) ;
    }
    @GetMapping()
    public List<TestEntity> get (){
        return server.getAllEntity();
    }

}
