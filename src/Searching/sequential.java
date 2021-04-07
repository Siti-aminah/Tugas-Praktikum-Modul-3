package Searching;

import java.util.Scanner;

public class sequential {
public static void main (String[] args){
    System.out.println("***** SEQUENTIAL SEARCH *****"+"\n" );
    String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", " Aljabar", "Siti Aminah Dauda", "Tesla"};
    String key;

    //fitu scanner
    Scanner scan = new Scanner (System.in);
    System.out.print("Masukan data yang di cari: ");
    key = scan.nextLine();
    
    //menampilkan data Array
    System.out.print("isi data adalah: ");
    for (int i = 0; i < data.length; i++){
        
        System.out.print(data[i] + " ");
    }
    System.out.println("");
    

    for (int i = 0; i <= data.length; i++){
        if (key.equalsIgnoreCase(data[i])){
            System.out.print("Data "+key+" berada pada index ke - " + i);
            break; //stop perulangan
        }
    }
    System.out.println("\n");
    System.out.println();
    System.out.println("***** Terima Kasih ***** ");
}
}
      
    
    



    
   

   

