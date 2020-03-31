package problem3.adt;

public interface ADT<E> {
    void add(E data);
    E remove();
    E peek();
}
