import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TugasJavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menentukan Variable
        String username;
        String password;
        int pin;
        System.out.println("Silahkan Login Terlebih Dahulu");

        System.out.println("Username : ");
        username = sc.nextLine();
        System.out.println("Masukkan Password : ");
        password = sc.nextLine();
        System.out.println("Masukkan PIN : ");
        pin = sc.nextInt();

        // Kondisi
        if (username.equals("Administrator") && password.length() >= 5 && pin == 123456789) {
            System.out.println("Akses Diterima");

            int var = 1;

            int bola = 4 / 3;
            int pi = 22 / 7;
            int F, R, C;
            int panjang, lebar, sisi1, sisi2, sisi3, alas, tinggi, r;

            do {
                System.out.println(
                        "Silahkan Pilih Menu \n 1. Bangun Ruang/Datar \n 2. Konversi \n 3. Secret Menu \n 4. Exit");
                System.out.println("Masukkan Pilihanmu : ");
                var = sc.nextInt();

                switch (var) {
                    // Bangun Ruang
                    case 1:
                        do {
                            System.out.println("pilih \n 1. Luas \n 2. Volume \n 3. Exit");
                            var = sc.nextInt();
                            switch (var) {
                                // Luas
                                case 1:
                                    int Luas;
                                    do {
                                        System.out.println(
                                                "Pilih : \n 1. Persegi Panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5. Exit ");
                                        Luas = sc.nextInt();

                                        switch (Luas) {
                                            // Persegi Panjang
                                            case 1:
                                                System.out.println("Persegi Panjang");
                                                System.out.println("Rumus = p * l");
                                                System.out.println("Masukkan Panjang");
                                                panjang = sc.nextInt();
                                                System.out.println("Masukkan Lebar");
                                                lebar = sc.nextInt();
                                                System.out.println("Hasilnya : " + (panjang * lebar) + " m²");
                                                break;

                                            // Persegi
                                            case 2:
                                                System.out.println("Persegi");
                                                System.out.println("Rumus = sisi * sisi");
                                                System.out.println("Masukkan Sisi ke-1");
                                                sisi1 = sc.nextInt();
                                                System.out.println("Masukkan Sisi ke-2");
                                                sisi2 = sc.nextInt();
                                                System.out.println("Hasilnya : " + (sisi1 * sisi2) + " m²");
                                                break;
                                            // Segitiga
                                            case 3:
                                                System.out.println("Segitiga");
                                                System.out.println("Rumus = 1/2 * alas * tinggi ");
                                                System.out.println("1/2");
                                                System.out.println("Masukkan Alas");
                                                alas = sc.nextInt();
                                                System.out.println("Masukkan Tinggi");
                                                tinggi = sc.nextInt();
                                                System.out.println("Hasilnya : " + (1 * alas * tinggi / 2) + " m²");
                                                break;
                                            // Lingkaran
                                            case 4:
                                                System.out.println("Lingkaran");
                                                System.out.println("Rumus = 22/7 * r*r");
                                                System.out.print("Masukkan Radius ke-1 ");
                                                r = sc.nextInt();
                                                System.out.print("Masukkan radius ke-2 ");
                                                r = sc.nextInt();
                                                System.out.println("Hasilnya : " + (22 * r * r / 7) + " m²");
                                                break;
                                            // Exit
                                            case 5:
                                                System.out.println("Mencapai Batas Akhir Luas");
                                                break;

                                            default:
                                                break;

                                        }
                                    } while (Luas < 5);
                                    break;

                                // Volume
                                case 2:
                                    System.out.println("Pilih Volume");
                                    int volume;
                                    do {
                                        System.out.println(" 1. Balok \n 2. Kubus \n 3. Bola \n 4. Exit");
                                        volume = sc.nextInt();

                                        switch (volume) {
                                            // Balok
                                            case 1:
                                                System.out.println("Balok ");
                                                System.out.println("Rumus = panjang x lebar x tinggi");
                                                System.out.println("Masukkan Panjang");
                                                panjang = sc.nextInt();
                                                System.out.println("Masukkan Lebar");
                                                lebar = sc.nextInt();
                                                System.out.println("Masukkan Tinggi");
                                                tinggi = sc.nextInt();
                                                System.out
                                                        .println("Hasilnya : " + (panjang * lebar * tinggi) + " Liter");
                                                break;
                                            // Kubus
                                            case 2:
                                                System.out.println("Rumus Volume Kubus : sisi3 ");
                                                System.out.println("Masukkan Sisi ke-1 : ");
                                                sisi1 = sc.nextInt();
                                                System.out.println("Masukkan Sisi ke-2   : ");
                                                sisi2 = sc.nextInt();
                                                System.out.println("Masukkan Sisi ke-3 : ");
                                                sisi3 = sc.nextInt();
                                                System.out.println("Hasilnya : " + (sisi1 * sisi2 * sisi3) + " Liter");
                                                break;
                                            // Bola
                                            case 3:
                                                System.out.println("Rumus Volume Bola :  4/3  22/7  r³ ");
                                                System.out.println("4/3");
                                                System.out.println("22/7");
                                                System.out.println("Masukkan r³ ");
                                                r = sc.nextInt();
                                                System.out.println("Hasilnya : " + (bola * pi * r * r * r) + "Liter");
                                                break;
                                            // Exit Volume
                                            case 4:
                                                System.out.println("Mencapai Batas Akhir Volume");
                                                break;
                                            default:
                                                break;
                                        }

                                    } while (volume < 4);
                                    break;
                                // Exit Bangun Ruang
                                case 3:
                                    System.out.println("Mencapai Batas Akhir Bangun Ruang");

                                default:
                                    break;
                            }
                        } while (var < 3);
                        break;

                    // Konversi
                    case 2:
                        int konversi;
                        do {
                            System.out.println("Pilih \n 1. Derajat \n 2. Panjang \n 3. Gram \n 4. Exit");
                            konversi = sc.nextInt();
                            switch (konversi) {
                                // Derajat
                                case 1:
                                    int derajat;
                                    do {
                                        System.out.println(" 1. Celcius \n 2. Reamur \n 3. Fahrenheit \n 4. Exit");
                                        derajat = sc.nextInt();
                                        switch (derajat) {
                                            case 1:
                                                int celcius;
                                                do {
                                                    System.out.println(
                                                            "Anda Harus Memilih \n 1. Celcius ke Reamur \n 2. Celcius ke Fahrenheit \n 3. Exit");
                                                    celcius = sc.nextInt();
                                                    switch (celcius) {
                                                        case 1:
                                                            System.out.println("Celcius ke Reamur");
                                                            System.out.println("Masukkan ");
                                                            C = sc.nextInt();
                                                            System.out.println("Hasilnya : " + (4 * C / 5) + "°R");
                                                            break;
                                                        case 2:
                                                            System.out.println("Celcius ke Fahrenheit");
                                                            System.out.println("Masukkan");
                                                            C = sc.nextInt();
                                                            System.out.println(
                                                                    "Hasilnya : " + ((C * 9 / 5) + 32) + "°F");
                                                            break;
                                                        case 3:
                                                            System.out.println(" Exit ");
                                                            break;

                                                        default:
                                                            break;
                                                    }
                                                } while (celcius < 3);
                                                break;

                                            case 2:
                                                int reamur;
                                                do {
                                                    System.out.println(
                                                            "Anda Harus Memilih \n 1. Reamur ke Celcius \n 2. Reamur ke Fahrenheit \n 3. Exit");
                                                    reamur = sc.nextInt();
                                                    switch (reamur) {
                                                        case 1:
                                                            System.out.println("Reamur ke Celcius ");
                                                            System.out.println("Masukkan ");
                                                            R = sc.nextInt();
                                                            System.out.println("Hasilnya : " + (R * 5 / 4) + "°C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Reamur ke Fahrenheit");
                                                            System.out.println("Masukkan");
                                                            R = sc.nextInt();
                                                            System.out.println("Hasilnya : " + (5 * R / 4) + "°F");
                                                            break;
                                                        case 3:
                                                            System.out.println(" Exit ");
                                                            break;

                                                        default:
                                                            break;
                                                    }
                                                } while (reamur < 3);
                                                break;

                                            case 3:
                                                int fahrenheit;
                                                do {
                                                    System.out.println(
                                                            "Anda Harus Memilih \n 1. Fahrenheit ke Celcius \n 2. Fahrenheit ke Reamur \n 3. Exit");
                                                    fahrenheit = sc.nextInt();
                                                    switch (fahrenheit) {
                                                        case 1:
                                                            System.out.println("Fahrenheit ke Celcius ");
                                                            System.out.println("Masukkan ");
                                                            F = sc.nextInt();
                                                            System.out.println("Hasilnya : " + (5 * F - 32 / 9) + "°C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Fahrenheit ke Reamur  ");
                                                            System.out.println("Masukkan");
                                                            F = sc.nextInt();
                                                            System.out.println("Hasilnya : " + (F - 32 * 4 / 9) + "°R");
                                                            break;
                                                        case 3:
                                                            System.out.println(" Exit ");
                                                            break;

                                                        default:
                                                            break;
                                                    }

                                                } while (fahrenheit < 3);
                                                break;
                                            case 4:
                                                System.out.println("Exit");
                                                break;

                                            default:
                                                break;
                                        }

                                    } while (derajat < 4);
                                    break;

                                // Panjang
                                case 2:
                                    int meter;
                                    float Meter;
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih \n 1. Km (Kilo meter) \n 2. Hm (Hekto meter) \n 3. Dam (Deka meter) \n 4. Dm (Desi meter) \n 5. Cm (Centi meter) \n 6. mm (Mili meter)\n 7. Exit ");
                                        meter = sc.nextInt();

                                        switch (meter) {
                                            case 1:
                                                // Kilometer;
                                                System.out.println("Silahkan Masukkan : " + "meter");
                                                Meter = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Meter / 1000) + "km");
                                                break;
                                            case 2:
                                                // Hektometer
                                                System.out.println("Silahkan Masukkan : " + "meter");
                                                Meter = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Meter / 100) + "hm");
                                                break;
                                            case 3:
                                                // Dekameter
                                                System.out.println("Silahkan Masukkan : " + "meter");
                                                Meter = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Meter / 10) + "dam");
                                                break;
                                            case 4:
                                                // Desimeter
                                                System.out.println("Silahkan Masukkan : " + "meter");
                                                Meter = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Meter * 10) + "dm");
                                                break;
                                            case 5:
                                                // Centimeter
                                                System.out.println("Silahkan Masukkan : " + "meter");
                                                Meter = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Meter * 100) + "cm");
                                                break;
                                            case 6:
                                                // Milimeter
                                                System.out.println("Silahkan Masukkan : " + "meter");
                                                Meter = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Meter * 1000) + "mm");
                                                break;
                                            case 7:
                                                System.out.println("Exit");
                                                break;

                                            default:
                                                break;
                                        }

                                    } while (meter < 7);
                                    break;

                                // Berat
                                case 3:
                                    int gram;
                                    float Gram;
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih \n 1. Kg (Kilogram) \n 2. Hg (Hektogram) \n 3. Dag (Dekagram) \n 4. Dg (Desigram) \n 5. Cg (Centigram) \n 6. Mg (Milligram) \n 7. Exit");
                                        gram = sc.nextInt();

                                        switch (gram) {
                                            case 1:
                                                // Kilogram;
                                                System.out.println("Silahkan Masukkan : " + "gram");
                                                Gram = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Gram / 1000) + "Kg");
                                                break;
                                            case 2:
                                                // Hektogram
                                                System.out.println("Silahkan Masukkan : " + "gram");
                                                Gram = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Gram / 100) + "Hg");
                                                break;
                                            case 3:
                                                // Dekagram
                                                System.out.println("Silahkan Masukkan : " + "gram");
                                                Gram = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Gram / 10) + "Dag");
                                                break;
                                            case 4:
                                                // Desigram
                                                System.out.println("Silahkan Masukkan : " + "gram");
                                                Gram = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Gram * 10) + "Dg");
                                                break;
                                            case 5:
                                                // Centigram
                                                System.out.println("Silahkan Masukkan : " + "gram");
                                                Gram = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Gram * 100) + "Cg");
                                                break;
                                            case 6:
                                                // Miligram
                                                System.out.println("Silahkan Masukkan : " + "gram");
                                                Gram = sc.nextFloat();
                                                System.out.println("Hasilnya : " + (Gram * 1000) + "Mg");
                                                break;
                                            case 7:
                                                System.out.println("Exit");
                                                break;

                                            default:
                                                break;
                                        }

                                    } while (gram < 7);
                                    break;

                                // Exit Konversi
                                case 4:
                                    System.out.println("Mencapai Batas Akhir Konversi");
                                    break;

                                default:
                                    break;
                            }

                        } while (konversi < 4);
                        break;

                    case 3:
                        String Angka;
                        int angka;
                        System.out.println("Masukkan Kode Rahasia : ");
                        Angka = sc.next();

                        if (Angka.length() >= 7 && Angka.length() <= 10) {
                            System.out.println("Selamat Datang VIP!!");

                            do {
                                System.out.println(
                                        "Pilih Menu Rahasia \n 1. Uppercase \n 2. Lowercase \n 3. Reverse \n 4. Exit ");
                                angka = sc.nextInt();
                                switch (angka) {
                                    case 1:
                                        sc.nextLine();
                                        System.out.println("Masukkan Text untuk Uppercase ");
                                        Angka = sc.next();
                                        System.out.println(Angka.toUpperCase());

                                        break;
                                    case 2:
                                        System.out.println("Lowercase");
                                        sc.nextLine();
                                        System.out.println("Masukkan Text untuk Lowercase ");
                                        Angka = sc.next();
                                        System.out.println(Angka.toLowerCase());
                                        break;
                                    case 3:
                                        sc.nextLine();
                                        System.out.println("Masukkan Text untuk Reverse ");
                                        Angka = sc.nextLine();
                                        List<String> list = Arrays.asList(Angka.split(""));
                                        Collections.reverse(list);
                                        System.out.println(String.join("", list));

                                        break;
                                    case 4:
                                        System.out.println("Exit");
                                        break;

                                    default:
                                        break;
                                }

                            } while (angka < 4);
                        } else {
                            System.out.println(" Kembali Ke Menu Awal ");
                        }

                        break;

                    case 4:
                        break;

                    default:
                        break;
                }
            } while (var < 4);
            {
                System.out.println("Silahkan Kembali");
            }
        } else {
            System.out.println("Akses Ditolak, Silahkan Run Ulang");
        }
        sc.close();
    }
}
