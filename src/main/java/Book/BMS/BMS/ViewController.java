package Book.BMS.BMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String root() {
        return "index";  // Redirect to index page
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/add-book")
    public String showAddBookPage() {
        return "add-book"; // This corresponds to add-book.html in src/main/resources/static/
    }
}

