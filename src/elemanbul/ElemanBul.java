
package elemanbul;

import java.util.Scanner;


public class ElemanBul {
    
    public static void sirala(int [] dizi){
        int d;
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi.length-(i+1);j++){
                if(dizi[j]>dizi[j+1]){
                    d=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=d;
                    
                }
            }
        }
    }
        
    
    static void kucukelemanibul(int dizi[],int k){
        
        sirala(dizi);
        int t= dizi.length;
        System.out.println("Dizinin"+k+".En Küçük Elemani:"+dizi[k-1]);
        System.out.println("Dizinin"+k+".En Büyük Elemani:"+dizi[t-k]);
        /*int t=dizi.length-1;
        for(int i=0;i<k;i++){
            System.out.println("Dizinin En Kucuk"+(i+1)+". Elemani : "+ dizi[i]);
        }
        for(int j=t;j>=k;j--){
            System.out.println("Dizinin En Buyuk Elemanlari: "+ dizi[j]);
        }
        */
    }
    
    

    
    public static void main(String[] args) {
        
        int dizi1[] = {8,3,6,1,9,7};
        Scanner scan  = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int k = scan.nextInt();
        
        kucukelemanibul(dizi1, k);
        
        
        
        
        
        
    }
    
}
