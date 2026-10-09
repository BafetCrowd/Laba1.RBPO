package рбпо.гришин.лаба1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Контроллер {
    @GetMapping("/привет")
    public String приветствие() {
        return "Привет! Я Гришин Никита, группа БКС2402.";
    }

    @GetMapping("/числа")
    public int[] числа() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
