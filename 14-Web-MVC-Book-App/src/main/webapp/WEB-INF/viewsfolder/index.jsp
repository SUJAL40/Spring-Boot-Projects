
<html>
<head>
</head>
<body>
    <form action="/book" method="GET">
        BookId:<input type="text" name="id"/>
        <input type="submit" value="search"/>
    </form>
    <hr>
    
    Book Id: ${book.bookId}<br>
    Book name: ${book.bookName}<br>
    Book Price: ${book.bookPrice}<br>
</body>
</html>
