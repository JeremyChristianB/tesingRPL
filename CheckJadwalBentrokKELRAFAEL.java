/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testingbentrokjadwalkelraf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */


import static org.junit.Assert.*;   
import org.junit.Test;  

import java.util.Arrays;
import java.util.Scanner;
public class TestingJadwalKelRaf {   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        assertEquals(1,TestingJadwalKelRaf.hari("senin"));
        assertEquals(2,TestingJadwalKelRaf.hari("selasa"));
        assertEquals(3,TestingJadwalKelRaf.hari("rabu"));
        assertEquals(4,TestingJadwalKelRaf.hari("kamis"));
        assertEquals(5,TestingJadwalKelRaf.hari("jumat"));
        //assertEquals(2,CheckJadwalBentrokKELRAFAEL.hari("senin"));
        boolean [][]jadwal = new boolean [5][18];
        assertEquals(false,TestingJadwalKelRaf.cekJadwal(jadwal[1][8], 1));
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
    public static void jadwalKosong(boolean jadwal[][]){
        for(int i=0;i<5;i++){
            for(int j=0;j<20;j++){
                jadwal[i][j]=false;
            }
        }
    }
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