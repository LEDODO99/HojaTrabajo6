/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author David 
 * @author Luis
 */
public class HojaTrabajo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String opcion;
        int seleccionado=0;
        
        
        FactoryCards fm = new FactoryCards();
        Scanner s=new Scanner(System.in);
        
        System.out.println("Ingrese la abreviacion de la opcion que desea elegir: ");
        System.out.println("1. HashMap(HM). ");
        System.out.println("2. TreeMap(TM)");
        System.out.println("3. LinkedHashMap(LHM).");
        opcion = s.nextLine();
        if (opcion.equals("HM") || opcion.equals("TM") || opcion.equals("LHM")){
            seleccionado=1;
        }
        while ((seleccionado == 0)){
            System.out.println("ERROR Ingreso no valido. Por favor ingrese la abreviacion de la opcion que desea elegir: ");
            System.out.println("1. HashMap(HM). ");
            System.out.println("2. TreeMap(TM)");
            System.out.println("3. LinkedHashMap(LHM).");
            opcion = s.nextLine();
            if (opcion.equals("HM") || opcion.equals("TM") || opcion.equals("LHM")){
                seleccionado=1;
            };
        }
        Map<Integer, Card> map = fm.FactoryCards(opcion);
        File file = new File ("cards_desc.txt");
        
        FileReader fr = new FileReader (file);
        BufferedReader br = new BufferedReader(fr);
        
        Scanner loader=new Scanner(br);
        int posicion=0;
        
        while (loader.hasNextLine()){
            posicion++;
            String linea=loader.nextLine();
            int a=linea.indexOf("|");
            String nom = linea.substring(0,a);
            String tipo = linea.substring(a+1, linea.length());
            map.put(posicion, new Card(nom, tipo));
        }
        int respuesta=1;
        while (respuesta!=0){
            System.out.println("Ingrese el numero de la instruccion que deseas realizar");
            System.out.println("0. Salir.");
            System.out.println("1. Mostrar todas las cartas.");
            System.out.println("2. Guardar una carta a mi coleccion.");
            System.out.println("3. Contar y mostrar las cartas de mi mazo.");
            System.out.println("4. Ordenar por tipo mi mazo.");
            System.out.println("5. Ordenar coleccion por tipo.");
            System.out.println("6. Mostrar tipo de carta ingresada.");
            System.out.println("");
        }
        
        
    }
    
}
