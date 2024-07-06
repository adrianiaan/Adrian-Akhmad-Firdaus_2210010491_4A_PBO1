## Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data wilayah menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama provinsi dan kode pos, dan memberikan output berupa informasi detail dari kode pos tersebut seperti nama provinsi, kota/kabupaten, dan kecamatan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.
```markdown

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Wilayah`, `WilayahLengkap`, dan `WilayahBeraksi` adalah contoh dari class.

```java
public class Wilayah {
    ...
}

public class WilayahLengkap extends Wilayah {
    ...
}

public class WilayahBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `wilayah[i] = new WilayahLengkap(provinsi, kode);` adalah contoh pembuatan object.

```java
wilayah[i] = new WilayahLengkap(provinsi, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `provinsi` dan `kode` adalah contoh atribut.

```java
private String provinsi;
private String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Wilayah` dan `WilayahLengkap`.

```java
public Wilayah(String provinsi, String kode) {
    this.provinsi = provinsi;
    this.kode = kode;
}

public WilayahLengkap(String provinsi, String kode) {
    super(provinsi, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setProvinsi` dan `setKode` adalah contoh method mutator.

```java
public void setProvinsi(String provinsi) {
    this.provinsi = provinsi;
}

public void setKode(String kode) {
    this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getProvinsi` dan `getKode` adalah contoh method accessor.

```java
public String getProvinsi() {
    return provinsi;
}

public String getKode() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `provinsi` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
private String provinsi;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `WilayahLengkap` mewarisi `Wilayah` dengan sintaks `extends`.

```java
public class WilayahLengkap extends Wilayah {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini, method `tampilkanInfo` di `WilayahLengkap` merupakan override dari method `tampilkanInfo` di `Wilayah`.

```java
@Override
public String tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getProvinsi` dan seleksi `switch` dalam method `getKota` dan `getKec`.

```java
public String getProvinsi() {
    if(getKode().substring(0, 1).equals("7")){
        return "Kalimantan Selatan";
    } else {
        return "Provinsi Lain";
    }
}

public String getKota() {
    switch(getKode().substring(1, 3)) {
        case "07":
            return "Kota Banjarbaru";
        case "11":
            return "Kabupaten Tapin";
        default:
            return "Kota/Kabupaten Lain";
    }
}

public String getKec() {
    switch(getKode().substring(3, 5)) {
        case "24":
            return "Kecamatan Landasan Ulin";
        case "81":
            return "Kecamatan Tapin Selatan";
        default:
            return "Kecamatan Lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```java
for (int i = 0; i < wilayah.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Provinsi ke-" + (i + 1) + ": ");
String provinsi = scanner.nextLine();

System.out.println("\nData Wilayah:");
System.out.println(wilayah[i].tampilkanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Wilayah[] wilayah = new WilayahLengkap[2];` adalah contoh penggunaan array.

```java
Wilayah[] wilayah = new WilayahLengkap[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```java
try {
    // code that might throw an exception
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan format kode: " + e.getMessage());
} catch (NumberFormatException e) {
    System.out.println("Kesalahan Format Number: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Adrian Akhmad Firdaus

NPM: 2210010491
```
