/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
/**
 *
 * @author hp
 */

import static org.junit.Assert.*;   
import org.junit.Test;  

import java.util.Scanner;
public class CheckJadwalBentrokKELRAFAEL {   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan jumlah kelas anda:");
//        int kelas = sc.nextInt();
//        System.out.println("Selanjutnya masukkan nama hari diikuti oleh jam mulai dan jam selesai (ex. senin 10 12)");
//        boolean[][] jadwal = new boolean[5][20];
//        jadwalKosong(jadwal);
//        for(int i =0;i<kelas;i++){
//            int hari= hari(sc.next());
//            int start=sc.nextInt();
//            int end = sc.nextInt();
//            while(start<end){
//                jadwal[hari-1][start]=true;
//                start++;
//            }
//        }
//        System.out.println("Silahkan pilih mata kuliah:");
//        System.out.println("1. Dasar-dasar Pemograman (selasa, 08.00-10.00)");
//        System.out.println("2. Analisis Struktur Data (rabu, 13.00-15.00)");
//        System.out.println("3. Pemograman Berbasis Web (kamis, 13.00-15.00)");
//        System.out.println("4. Pemograman Pada Perangkat Lunak (jumat, 11.00-13.00)");
//        System.out.println("5. Rekayasa Perangkat Lunak (kamis, 15.00-17.00)");
//        int matkul = sc.nextInt();
//        if(cekJadwal(jadwal,matkul)){
//            System.out.println("Jadwal tidak bentrok");
//        }
//        else{
//            System.out.println("Jadwal bentrok");
//        }
//test1
//berhasil
        assertEquals(1,CheckJadwalBentrokKELRAFAEL.hari("senin"));
        assertEquals(2,CheckJadwalBentrokKELRAFAEL.hari("selasa"));
        assertEquals(3,CheckJadwalBentrokKELRAFAEL.hari("rabu"));
        assertEquals(4,CheckJadwalBentrokKELRAFAEL.hari("kamis"));
        assertEquals(5,CheckJadwalBentrokKELRAFAEL.hari("jumat"));
 
//test2        
//kalo mau gagal
//        assertEquals(2,CheckJadwalBentrokKELRAFAEL.hari("senin"));
        
        int[][] nama = new int[5][5];
        
        boolean[][] arr = new boolean [5][18];

        assertEquals(true,CheckJadwalBentrokKELRAFAEL.cekJadwal(arr, 1));
        assertEquals(true,CheckJadwalBentrokKELRAFAEL.cekJadwal(arr, 2));
        assertEquals(true,CheckJadwalBentrokKELRAFAEL.cekJadwal(arr, 3));
        assertEquals(true,CheckJadwalBentrokKELRAFAEL.cekJadwal(arr, 4));
        assertEquals(true,CheckJadwalBentrokKELRAFAEL.cekJadwal(arr, 5));
//kalo mau gagal
//      assertEquals(false,CheckJadwalBentrokKELRAFAEL.cekJadwal(arr, 1));
      

//tidak dapat dilakukan testing untuk method jadwalKosong dikarenakan bertipe void
//telah dicoba dilakukan perubahan pada source code asli namun gagal sehingga tidak dapat dilakukan testing
//        boolean[][] arr2 = new boolean [5][20];
//        assertEquals(false,CheckJadwalBentrokKELRAFAEL.jadwalKosong(arr));

    }
    public static boolean cekJadwal(boolean jadwal[][],int matkul){
        boolean res = true;
        if(matkul==1){
            if(jadwal[1][8]==true){
               return false;
            }
            if(jadwal[1][9]==true){
               return false;
            }
        }
        else if(matkul==2){
            if(jadwal[2][13]==true){
               return false;
            }
            if(jadwal[2][15]==true){
               return false;
            }
        }
        else if(matkul==3){
            if(jadwal[3][13]==true){
               return false;
            }
            if(jadwal[3][15]==true){
               return false;
            }
        }
        else if(matkul==4){
            if(jadwal[4][11]==true){
               return false;
            }
            if(jadwal[4][13]==true){
               return false;
            }
        }
        else if(matkul==5){
            if(jadwal[3][15]==true){
               return false;
            }
            if(jadwal[3][17]==true){
               return false;
            }
        }
        return res;
    }
    
//source code asli  
        public static void jadwalKosong(boolean jadwal[][]){
        for(int i=0;i<5;i++){
            for(int j=0;j<20;j++){
                jadwal[i][j]=false;
            }
        }
    }
        
//source code yang kelompok saya edit
//    public static boolean[][] jadwalKosong(boolean jadwal[][]){
//        for(int i=0;i<jadwal.length();i++){
//            for(int j=0;j<jadwal.length();j++){
//                jadwal[i][j]=false;
//                
//            }
//        }
//        return jadwal;
//    }
        
        
    public static int hari(String namaHari){
        if(namaHari.equals("senin")){
            return 1;
        }
        else if(namaHari.equals("selasa")){
            return 2;
        }
        else if(namaHari.equals("rabu")){
            return 3;
        }
        else if(namaHari.equals("kamis")){
            return 4;
        }
        else {
            return 5;
        }
    }
  
}
