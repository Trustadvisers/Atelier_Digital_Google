package _3DesignPatterns.visitor;

public interface Visitor {

    void visit(Book book);

    void visit (Film film);

    void visit (Album album);
}