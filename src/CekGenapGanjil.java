public class CekGenapGanjil {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan untuk meminta input dari pengguna
        System.out.print("Masukkan angka: ");
        
        // Membaca input angka dari pengguna
        int angka = scanner.nextInt();
        
        // Mengecek apakah angka genap atau ganjil
        if (angka % 2 == 0) {
            // Jika angka habis dibagi 2, maka angka tersebut genap
            System.out.println("Angka yang kamu masukkan adalah genap");
        } else {
            // Jika angka tidak habis dibagi 2, maka angka tersebut ganjil
            System.out.println("Angka yang kamu masukkan adalah ganjil");
        }

        // Menutup Scanner setelah selesai digunakan
        scanner.close();
     }
 }