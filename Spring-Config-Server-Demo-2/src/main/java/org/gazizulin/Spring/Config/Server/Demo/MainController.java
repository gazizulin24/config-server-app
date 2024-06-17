package org.gazizulin.Spring.Config.Server.Demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MainController {

    @Value("${cloud-config-2.test-int}")
    int intFromServer;

    @Value("${cloud-config-2.test-str}")
    String stringFromServer;

    @GetMapping("/int")
    public Integer getIntFromServer(){
        return intFromServer;
    }


    @GetMapping("/str")
    public String getStringFromServer(){
        return stringFromServer;
    }

}
