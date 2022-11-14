package com.example.javaroad;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService{


    @Override
    public void sendMsg(String msg) {
        System.out.println("Twitter service "+msg);
    }
}
