/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeradores;

/**
 *
 * @author João Victor
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Aula de PC - ENUMERADORES \r\n");        
        
        usandoConstantes();
        System.out.println();
        usandoEnum();
        
    }
     private static void usandoConstantes(){
        
        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;
        
        System.out.println("Teste utilizando constantes no Java");
        imprimeDiaSemanaConstantes(segunda);
        imprimeDiaSemanaConstantes(terca);
        imprimeDiaSemanaConstantes(quarta);
        imprimeDiaSemanaConstantes(quinta);
        imprimeDiaSemanaConstantes(sexta);
        imprimeDiaSemanaConstantes(sabado);
        imprimeDiaSemanaConstantes(domingo);
        
    }
    
    private static void imprimeDiaSemanaConstantes(int dia){
        switch (dia){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;     
        }
    }
    
    private static void usandoEnum(){
        
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        
        System.out.println("Teste utilizando Enum no Java");
        imprimeDiaSemanaEnum(segunda);
        imprimeDiaSemanaEnum(terca);
        imprimeDiaSemanaEnum(quarta);
        imprimeDiaSemanaEnum(quinta);
        imprimeDiaSemanaEnum(sexta);
        imprimeDiaSemanaEnum(sabado);
        imprimeDiaSemanaEnum(domingo);
    }
        private static void imprimeDiaSemanaEnum(DiaSemana dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;     
            }
        }
    }
