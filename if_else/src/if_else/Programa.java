package if_else;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
 
        
        String[] perguntas = new String[5];
            perguntas[0] = "Telefonou para a v�tima?";
            perguntas[1] = "Esteve no local do crime?";
            perguntas[2] = "Mora perto da v�tima?";
            perguntas[3] = "Devia para a v�tima?";
            perguntas[4] = "J� trabalhou com a v�tima?";
       
        
        int respostasPositivas = 0;
       
        
     
        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            String respostas = s.nextLine();
           
            
            
            if(respostas.toLowerCase().equals("sim")){ 
                respostasPositivas++;
            }
        }
 
      
        switch(respostasPositivas){
            case 1:
                System.out.println("Cheirinho de suspeito em!");
                break;
  
            case 2:
                System.out.println("T� esquisito pro teu lado v�i");
                break;
 
            case 3:
                System.out.println("Tu t� escondendo alguma coisa assassino");
                break;
 
            default:
                System.out.println("Tu t� puro, some daqui meu filho");
                break;
        }
    }
}