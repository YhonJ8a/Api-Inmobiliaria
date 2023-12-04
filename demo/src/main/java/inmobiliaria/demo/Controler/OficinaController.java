package inmobiliaria.demo.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oficina")
public class OficinaController {
    @GetMapping("/p")
    public String prueba() {
        return "prueba aver q es loq";
    }
}
