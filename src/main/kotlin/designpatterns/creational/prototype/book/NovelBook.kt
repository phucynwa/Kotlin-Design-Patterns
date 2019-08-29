package designpatterns.creational.prototype.book

class NovelBook : Book() {
    public override fun clone() = super.clone() as NovelBook
}
