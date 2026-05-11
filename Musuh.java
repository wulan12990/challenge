public abstract class Musuh {

    protected String namaMusuh;
    protected int hp;

    // Constructor
    public Musuh(String namaMusuh, int hp) {
        this.namaMusuh = namaMusuh;
        this.hp = hp;
    }

    // Abstract method
    public abstract void serangPemain();

    public abstract void suaraKhas();

    // Method biasa
    public void tampilkanInfo() {
        System.out.println("Nama Musuh : " + namaMusuh);
        System.out.println("HP Musuh   : " + hp);
    }
}