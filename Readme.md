JAWABAN PERTANYAAN PERCOBAAN KE 1

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
jawaban : ga haruss, karna Class yang mau dijadikan array of object itu yang penting bisa dibuat object-nya dan punya atribut buat nyimpen data nya. Kaya di contoh class Mahasiswa11 cuma dipakai buat nyimpen data aja kan, kayak nim, nama, kelas, dan ipk, nggak ada method yang dipanggil, tapi tetap bisa jalan karena kita cuma akses atributnya aja.

2. Apa yang dilakukan oleh kode program berikut?
Mahasiswa11 [] arrayOfMahasiswa = new Mahasiswa11[3];
jawaban : membuat array 1 dimensi untuk menyimpan 3 data setiap mahasiswa yang akan dituliskan.

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
arrayOfMahasiswa[0] = new mahasiswa11 ();
jawaban : class mahasiswa tidak mempunyai konstruktor, namun tetap bisa melakukan pemanggilan di baris program tersebut karena jika di java, java akan otomatis membuatkan konstruktor default (tanpa parameter) secara otomatis, jadinya kita tetap bisa memanggil meskipun tanpa konstruktor.

4. Apa yang dilakukan oleh kode program berikut?
        arrayOfMahasiswa[0] = new Mahasiswa11();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB 1-E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
jawaban : kode program itu sedang mengisi nilai atribut object pada indeks 0

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
jawaban : karena agar dapat dibedakan dan lebih rapi, kalau yang class mahasiswa berisi atribut atau mungkin biasanya ada method yang berhubungan dengan class main, kalau yang mahahasiswaDemo itu berisi main yang digunakan untuk menjalankan program.

JAWABAN PERTANYAAN PERCOBAAN KE 2
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.
jawaban : sudah ditambahkan
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
        Mahasiswa11 [] arrayOfMahasiswa = new Mahasiswa11[3];
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB 1-E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
jawaban : Kode tersebut menyebabkan error karena objek Mahasiswa11 di dalam array belum diinstansiasi, tetapi langsung diakses atributnya. Jadinya program bingung, juga niai arraynya masi null.