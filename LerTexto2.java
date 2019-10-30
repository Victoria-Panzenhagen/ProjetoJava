/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lertexto2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Vivi-Panz
 */
public class LerTexto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
                    
            Path caminho = Paths.get("C:\\Users\\Vivi-Panz\\Documents\\NetBeansProjects\\LerTexto2\\src\\lertexto2\\LerJava.txt");
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            String linhaM = leitura.toUpperCase();
           
           /*InputStream is = new FileInputStream("C:\\Users\\Vivi-Panz\\Documents\\NetBeansProjects\\LerTexto2\\src\\lertexto2\\LerJava.txt");
            //InputStreamReader, ler char
            InputStreamReader isr = new InputStreamReader(is);
            //BufferedReader, transformar em String
            BufferedReader reader = new BufferedReader(isr);*/
            
            //String linha = reader.readLine();
            //String linhaM = linha.toUpperCase();
            
            
            boolean continuar = true; 
            Scanner teclado = new Scanner(System.in); 
            char letra;
            
            System.out.println("-----------------------------------");
            System.out.println("   Programa para contar letras");
            System.out.println("-----------------------------------");
            System.out.println(leitura);
            System.out.print("Informe a letra que deseja buscar: "); 
            
            while(continuar){
            int total = 0;         
            letra = teclado.next().charAt(0);
            letra = Character.toUpperCase(letra);
            if(letra == '0'){
                continuar = false;
                System.out.println("-----------------------------------");
                System.out.println("          FIM DO PROGRAMA!");
                System.out.println("-----------------------------------");
            }else{
                for(int i = 0; i < linhaM.length(); i++){
                    
                    if(linhaM.charAt(i) == letra){
                        total += 1; 
                }
            }}
            System.out.println("Total de letra " + letra + ": " + total);
            System.out.print("Informe uma letra ou digite 0 para sair: ");        
            }
        
            
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, " Arquivo não encontrado! ");
        }
    }
    
}
