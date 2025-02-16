package com.example.test_Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServer {

    @Autowired
    private TestRepo repo ;

    public TestEntity addEntity(TestEntity entity){
        return  repo.save(entity) ;
    }

    public List<TestEntity>getAllEntity(){
        return repo.findAll() ;
    }
}
