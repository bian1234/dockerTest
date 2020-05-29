package top.byk.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: ykbian
 * @date 2020/5/28 16:31
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "success";
    }
}
