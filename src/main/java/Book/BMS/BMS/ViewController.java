package Book.BMS.BMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home() {
        return "index"; // Assuming "index.html" is your homepage
    }
    
    @GetMapping("/add-book")
    public String showAddBookPage() {
        return "add-book"; // This corresponds to add-book.html in src/main/resources/static/
    }
}

