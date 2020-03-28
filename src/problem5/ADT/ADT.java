package problem5.ADT;

public interface ADT<E> {
    public void enqueue(E data);

    public E dequeue();

    public E peek();

    public boolean isEmpty();

    public int getSize();
}
