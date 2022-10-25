package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetService {
	public String say(){
        return "Good day to you";
    }
}
