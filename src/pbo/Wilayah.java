package pbo;

// Kelas dasar (superclass)
public class Wilayah {
    // Atribut dan enkapsulasi (private)
    private String provinsi;
    private String kode;

    // Konstruktor
    public Wilayah(String provinsi, String kode) {
        this.provinsi = provinsi;
        this.kode = kode;
    }

    // Metode Mutator (setter) untuk provinsi
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    // Metode Mutator (setter) untuk kode
    public void setKode(String kode) {
        this.kode = kode;
    }

    // Metode Accessor (getter)untuk provinsi
    public String getProvinsi() {
        return provinsi;
    }

    // Metode Accessor (getter) untuk kode
    public String getKode() {
        return kode;
    }

    // Metode untuk menampilkan informasi dasar wilayah
    public String tampilkanInfo() {
        return "Nama Provinsi : " + getProvinsi() + "\nKode POS : " + getKode();
    }

    // Metode Polymorphism overloading: Menampilkan informasi wilayah dengan nama kota
    public String tampilkanInfo(String kota) {
        return tampilkanInfo() + "\nNama Kota/Kabupaten : " + kota;
    }
}
