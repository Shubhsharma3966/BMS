document.addEventListener('DOMContentLoaded', function () {
    fetchBooks();

    const form = document.getElementById('book-form');
    form.addEventListener('submit', function (event) {
        event.preventDefault();
        
        const formData = new FormData(form);
        const book = {
            title: formData.get('title'),
            author: formData.get('author')
        };

        saveOrUpdateBook(book);
    });
});

function fetchBooks() {
    fetch('/api/books')
        .then(response => response.json())
        .then(books => {
            const booksList = document.getElementById('books-list');
            booksList.innerHTML = '';
            books.forEach(book => {
                const bookElement = document.createElement('div');
                bookElement.innerHTML = `<strong>${book.title}</strong> by ${book.author}`;
                booksList.appendChild(bookElement);
            });
        });
}

function saveOrUpdateBook(book) {
    let url = '/api/books';
    let method = 'POST';

    if (book.id) {
        url += `/${book.id}`;
        method = 'PUT';
    }

    fetch(url, {
        method: method,
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(book)
    })
    .then(response => response.json())
    .then(savedBook => {
        fetchBooks();
        clearForm();
    });
}

function clearForm() {
    document.getElementById('book-form').reset();
}
