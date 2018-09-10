/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class Codingame_snake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        in.nextLine();
        String [] kodolni = new String [N];
        for (int i = 0; i < N; i++) {
            kodolni[i] = in.nextLine();
        }
        String snake = "";
        for(int i=0; i<N; i++)
            if(i % 2 == 0)
                for(int j=N-1; j>=0; j--)
                    snake += kodolni[j].charAt(i);
            else        
                for(int j=0; j< N; j++)
                    snake += kodolni[j].charAt(i);
        for(int i=0; i<X; i++)
            snake = shiftel(snake);
        System.out.println(snake);
        kiir(snake,N);
        
    }
    
    static String shiftel(String mit){
        String answer=mit.charAt(mit.length()-1)+"";
        answer +=mit.substring(0,mit.length() -1);
        return answer;
    }
    
    static void kiir(String mit, int darab){
        for(int i=darab-1; i>=0; i--){
            if(i%2 == 0)
                for(int j=0; j<darab; j++)
                    System.out.print(mit.charAt(j*darab+i));
            else
                for(int j=darab-1; j>=0; j--)
                    System.out.print(mit.charAt(j*darab+i));
            System.out.println("");
        }
            
    }
    
}
