package designpatterns.creational.prototype.book

class ComicBook : Book() {
    public override fun clone() = super.clone() as ComicBook
}
