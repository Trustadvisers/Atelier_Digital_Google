package _3DesignPatterns.visitor;

public interface Element {
    void accept(Visitor v);
}