package Book.BMS.BMS;
// package Book.BMS;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/api/books")
// public class BookController {

//     @Autowired
//     private BookService bookService;

//     @GetMapping
//     public List<Book> getAllBooks() {
//         return bookService.getAllBooks();
//     }

//     @GetMapping("/{id}")
//     public Optional<Book> getBookById(@PathVariable Long id) {
//         return bookService.getBookById(id);
//     }

//     @PostMapping
//     public Book saveBook(@RequestBody Book book) {
//         return bookService.saveOrUpdateBook(book);
//     }

//     @PutMapping("/{id}")
//     public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
//         book.setId(id);
//         return bookService.saveOrUpdateBook(book);
//     }

//     @DeleteMapping("/{id}")
//     public void deleteBook(@PathVariable Long id) {
//         bookService.deleteBook(id);
//     }
// }
