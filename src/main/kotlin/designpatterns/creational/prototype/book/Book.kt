package designpatterns.creational.prototype.book

import designpatterns.creational.prototype.author.Author

abstract class Book : Cloneable {
    var author: Author? = null
}
