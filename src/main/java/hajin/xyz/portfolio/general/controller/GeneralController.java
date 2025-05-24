package hajin.xyz.portfolio.general.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GeneralController {
    @RequestMapping("")
    public ResponseEntity<?> mainPage() {
        return ResponseEntity.ok("Hello World");
    }
}
