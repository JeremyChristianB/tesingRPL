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
        assertEquals(1,CheckJadwalBentrokKELRAFAEL.hari("senin"));
        assertEquals(2,CheckJadwalBentrokKELRAFAEL.hari("selasa"));
        assertEquals(3,CheckJadwalBentrokKELRAFAEL.hari("rabu"));
        assertEquals(4,CheckJadwalBentrokKELRAFAEL.hari("kamis"));
        assertEquals(5,CheckJadwalBentrokKELRAFAEL.hari("jumat"));
//        assertEquals(2,CheckJadwalBentrokKELRAFAEL.hari("senin"));
        
        boolean arr[][] = new boolean {[true, false], [false, false]};

assertEquals(false, 1,CheckJadwalBentrokKELRAFAEL.cekJadwal(new boolean[][] {"true", "false"} , {"false", "true"}));
        
        
        
 assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
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

       

