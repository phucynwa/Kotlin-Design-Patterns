package designpatterns.creational.prototype

import designpatterns.creational.prototype.author.Writter
import designpatterns.creational.prototype.book.ComicBook

fun main() {

    val firstBook = ComicBook().apply {
        author = Writter("Author Name", 0)
    }
    val secondBook = firstBook.clone()

    with(firstBook) {
        println("${hashCode()} - ${author?.name}")
    }
    with(secondBook) {
        println("${hashCode()} - ${author?.name}")
    }
}
