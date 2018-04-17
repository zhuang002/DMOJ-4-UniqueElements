/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniqueelements;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class UniqueElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] data=new int[n];
        for (int i=0;i<n;i++) {
            data[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (data[j]==data[i]) {
                    data[j]=-1;
                }
            }
        }
        int count=0;
        for (int i=0;i<n;i++) {
            if (data[i]!=-1) count++;
        }
        System.out.println(count);
    }
    
}
