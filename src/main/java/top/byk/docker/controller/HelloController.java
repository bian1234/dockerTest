package top.byk.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: ykbian
 * @date 2020/5/28 16:28
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String toHello(){
        return "hello";
    }
}
