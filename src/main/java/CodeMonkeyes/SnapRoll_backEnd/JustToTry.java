package CodeMonkeyes.SnapRoll_backEnd;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustToTry {
    @RequestMapping("/")
    public String helloWorld(){
        return  "Hello world";
    }
}
