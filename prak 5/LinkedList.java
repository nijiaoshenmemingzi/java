/**
 * LinkedList.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat linked list dengan size = 0 dan head = tail = null
     */
    public LinkedList() {
        this.size = 0;
        head = tail = null;
    }
    
    /**
     * Cari elemen yang terletak pada posisi position
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
        if (position >= size){
            return null;
        }
        else{
            Node<T> a = head;
            int i;
            for(i=0;i<position ; i++){
                a = a.getNext();
            }
            return a;
        }
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * @param item
     */
    public void add(T item) {
        
        Node<T> a = new Node<T>(item);
        if (size ==0){
            head = a;
            tail = a;
        }
        else {
            a.setPrev(tail);
            tail.setNext(a);
            tail =a;
        }
        size++;
    }

    /**
     * Cari nilai elemen pada posisi position
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        if (position >= size){
            return null;
        }
        else{
            Node<T> a = head;
            int i;
            for(i=0;i<position ; i++){
                a = a.getNext();
            }
            return (a.getInfo());
        }
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        Node<T> a = getNode(position);
        if (a != null){
            a.setInfo(item);
        }

    }

    /**
     * Hapus elemen pada posisi position jika ada
     * @param position
     */
    public void remove(int position) {
        Node<T> cur = getNode(position) ;
        if (cur != null) {
            if (size == 1) {
                clear() ;
            }

            else {
                if (position == 0) {
                    head.getNext().setPrev(null) ;
                    head = head.getNext() ;
                }

                else if (position == size - 1) {
                    tail.getPrev().setNext(null) ;
                    tail = tail.getPrev() ;
                }

                else {
                    cur.getPrev().setNext(cur.getNext()) ;
                    cur.getNext().setPrev(cur.getPrev()) ;
                }

                size-- ;
            }
        }
    }

    /**
     * Hapus semua elemen dari Linked List
     */
    public void clear() {
        this.size = 0;
        head = tail = null;
    }

    /**
     * Getter size
     * @return size
     */
    public int getSize() {
        return size;
    }
}