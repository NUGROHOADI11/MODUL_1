package Latihan1;
public class Kota<E> {

    private E element;

    public Kota(E kota) {
        element = kota;
    }

    public E getElement() {

        return element;

    }

    public static void main(String[] args) {

        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur: " + jumlahkota.getElement() + "kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota " + namakota.getElement());
    }
}