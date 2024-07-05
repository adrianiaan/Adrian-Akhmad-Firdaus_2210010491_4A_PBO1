package pbo;

// Pewarisan atau inheritance: WilayahLengkap mewarisi dari Wilayah
public class WilayahLengkap extends Wilayah {
    
    // Konstruktor
    public WilayahLengkap(String provinsi, String kode) {
        // Memanggil konstruktor dari kelas induk (Wilayah)
        super(provinsi, kode);
    }
    
    // Polimorfisme: Meng-override metode getProvinsi dari kelas induk (Wilayah)
    @Override
    public String getProvinsi() {
        String namaProvinsi = getKode().substring(0, 1);
        
        if (namaProvinsi.equals("7")) {
            return "Kalimantan Selatan";
        } else {
            return "Provinsi Lain";
        }
    }
    
    // Metode untuk mendapatkan nama kota berdasarkan kode
    public String getKota() {
        String Kota = getKode().substring(1, 3); // ambil dua karakter
        
        switch (Kota) {
            case "07":
                return "Kota Banjarbaru";
            case "11":
                return "Kabupaten Tapin";
            default:
                return "Kota/Kabupaten Lain";
        }
    }

    // Metode untuk mendapatkan nama kecamatan berdasarkan kode
    public String getKec() {
        String Kec = getKode().substring(3, 5); // ambil dua karakter
        
        switch (Kec) {
            case "24":
                return "Kecamatan Landasan Ulin";
            case "81":
                return "Kecamatan Tapin Selatan";
            default:
                return "Kecamatan Lain";
        }
    }
    
    // Polimorfisme: Meng-override metode tampilkanInfo dari kelas induk (Wilayah)
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + // Memanggil metode tampilkanInfo dari kelas induk
                "\nNama Provinsi: " + getProvinsi() +
                "\nNama Kota/Kabupaten: " + getKota() +
                "\nNama Kecamatan: " + getKec();
    }
}

