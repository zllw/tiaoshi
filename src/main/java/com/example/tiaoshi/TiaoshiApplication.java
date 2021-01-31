package com.example.tiaoshi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class TiaoshiApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TiaoshiApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity<String> aaa(@RequestParam String name){
        ResponseEntity<String> ok = ResponseEntity.ok(this.hello(name));
        return ok;
    }

    public String hello(String name){
        return String.format("你好%s",name);
    }


    @Override
    public void run(String... args) throws Exception {
        while (true){
            String s="a,b,c";
            if (s.startsWith("a")) {
                String x=hello(s.split(",")[1]);
            }
        }
    }
}
