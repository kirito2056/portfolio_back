package hajin.xyz.portfolio.sideproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/side")
public class SideProjectController {

    @RequestMapping("/numberclock")
    public String numberClock() {
        return "numberClock/numberClock.html";
    }
}
