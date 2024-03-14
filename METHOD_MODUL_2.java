import java.util.Scanner;

public class METHOD_MODUL_2 {

    public static void Student() {
        Scanner input = new Scanner(System.in);

        System.out.println("===student menu===");
        System.out.println("1. buku terpinjam");
        System.out.println("2. pinjam buku");
        System.out.println("3. exit ");
        System.out.println("pilih 1 - 3 = ");
        int inputstudent = input.nextInt();

        switch (inputstudent) {
            case 1:
                System.out.println("======================================================================================================");
                System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s|%n", "Nomor Buku", "Judul Buku", "Pengarang Buku", "ID Buku", "Kategori Buku", "Stok Buku");
                System.out.println("======================================================================================================");

                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "0", "Buku Indonesia", "Diponegoro", "0001", "Fantasi", "10");
                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "1", "Buku Jepang", "Makoto Shinkai", "0002", "Isekai", "5");
                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "2", "Buku Inggris", "Albert Einstein", "0003", "Petualangan", "20");
                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "3", "Buku Rusia", "Vladimir Putin", "0004", "Martial", "15");
                System.out.println("=======================================================================================================");
                System.out.println("klik 99 jika ingin keluar = ");
                int exit = input.next().charAt(0);
                if (exit== 99 ){
                    System.out.println("keluar ");
                }
                break;

            case 2:
                System.out.println("======================================================================================================");
                System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s|%n", "Nomor Buku", "Judul Buku", "Pengarang Buku", "ID Buku", "Kategori Buku", "Stok Buku");
                System.out.println("======================================================================================================");

                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "0", "Buku Indonesia", "Diponegoro", "0001", "Fantasi", "10");
                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "1", "Buku Jepang", "Makoto Shinkai", "0002", "Isekai", "5");
                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "2", "Buku Inggris", "Albert Einstein", "0003", "Petualangan", "20");
                System.out.printf("| %-10s | %-20s | %-20s | %-10s | %-15s | %-10s |%n", "3", "Buku Rusia", "Vladimir Putin", "0004", "Martial", "15");
                System.out.println("=======================================================================================================");
                System.out.println("Pilih NOMOR buku yang dipinjam = ");
                int inputbuku = input.nextInt();
                if (inputbuku == 0) {
                    System.out.println("buku = bahasa indonesia berhasil dipinjam ");
                }
                if (inputbuku == 1) {
                    System.out.println("buku = bahasa jepang berhasil dipinjam ");
                }
                if (inputbuku == 2) {
                    System.out.println("buku = bahasa inggris berhasil dipinjam ");
                }
                if (inputbuku == 3) {
                    System.out.println("buku = bahasa rusia berhasil dipinjam ");
                }
                if (inputbuku > 4) {
                    System.out.println("pilihan tidak falid");
                }
                break;

            case 3:
                System.out.println("keluar");
        }
    }


    public class nilaiadmin {
        static String addstudent = null;
        static String addnim = null;
        static String jurusan = null;

        public static void Admin() {
            Scanner input = new Scanner(System.in);

            System.out.println("===admin menu===");
            System.out.println("1. add student");
            System.out.println("2. display student");
            System.out.println("3. exit ");
            System.out.println("pilih 1 - 3 = ");
            int inputAdmin = input.nextInt();
            switch (inputAdmin) {
                case 1:
                    System.out.println("Masukkan Nama Mahasiswa: ");
                    addstudent = input.next();

                    do {
                        System.out.println("Masukkan NIM Mahasiswa (15 digit): ");
                        addnim = input.next();
                        if (addnim.length() != 15) {
                            System.out.println("NIM Harus 15 Digit!");
                        }
                    } while (addnim.length() != 15);

                    input.nextLine(); // Membersihkan baris kosong

                    System.out.println("Masukkan Jurusan Mahasiswa: ");
                    jurusan = input.nextLine();

                    System.out.println("Data Mahasiswa Berhasil Ditambahkan!");
                    break;

                case 2:
                    if (addstudent == null || addnim == null || jurusan == null) {
                        System.out.println("Data Mahasiswa Belum Ditambahkan!");
                    } else {
                        System.out.println("Data Mahasiswa: ");
                        System.out.println("Nama Siswa: " + addstudent);
                        System.out.println("NIM Siswa: " + addnim);
                        System.out.println("Fakultas Siswa: " + jurusan);
                    }
                    break;
                case 3 :

                        System.out.println("keluar ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===library sistem===");
            System.out.println("1. login as student");
            System.out.println("2. login as admin");
            System.out.println("3. exit");
            System.out.println("pilih 1-3 = ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.println("enter your nimm= ");
                    String inputnim = input.next();

                    if (inputnim.equals("1234567890")){
                        System.out.println("Successful login as student");
                    }
                    else {
                        System.out.println("User not found");
                        break;
                    }
                    Student();
                    break;

                case 2:
                    nilaiadmin.Admin();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1-5.");
            }
        }
    }
}