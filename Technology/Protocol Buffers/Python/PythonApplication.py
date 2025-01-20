from Book_pb2 import Book
from Book_pb2 import Author

author = Author()
author.name = "Agatha Christie"

book = Book()
book.id = 123
book.title = "The Murder of Roger Ackroyd"
book.author.CopyFrom(author)

serialized_book = book.SerializeToString()

deseriailized_book = Book()
deseriailized_book.ParseFromString(serialized_book)
print(deseriailized_book)
