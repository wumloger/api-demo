package top.wml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class ApiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class, args);
    }
    @GetMapping("/work")
    public List<String> work(){
        return List.of("吃饭","睡觉","打代码");
    }
}
