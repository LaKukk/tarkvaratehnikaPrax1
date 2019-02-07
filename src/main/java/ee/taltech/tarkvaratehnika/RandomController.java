package ee.taltech.tarkvaratehnika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
public class RandomController {

    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "Hello from the otter side";
    }

}
