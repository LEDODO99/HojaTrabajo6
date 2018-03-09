
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Card {
    private String nombre;
    private String tipo;
    
    
    /**
     * Constructor con parametros de una carta
     * @param name Es el nombre de la carta
     * @param type Es l tipo de carta
     */
    public Card(String name, String type){
        nombre = name;
        tipo = type;
    }
    
    /**
     * Constructor vacio
     */
    public Card(){
        
    }
    /**
     * Devuelve el nombre de la carta
     * @return nombre de la carta
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve el tipo de la carta
     * @return tipo de la carta
     */
    public String getTipo(){
        return tipo;
    }
    /**
     * Une la clave con el valor
     * @return nombre y valor en un String
     */
    public String toString(){
        return nombre + " -- " + tipo;
    }
    /**
     * Agrega una carta a la coleccion del mapeo.
     * @param map El listado del mapeo
     * @param opcion La carta que elije el usuario a ingresar
     * @param coleccion Colleccion de cartas
     * @return ArrayList de las cartas de la persona.
     */
    public ArrayList<Card> agregarAColeccion(Map<Integer, Card> map, String opcion, ArrayList<Card> coleccion){
        for (Entry<Integer, Card> carta : map.entrySet()){
            Card existe = carta.getValue();
            if(existe.getNombre().equals(opcion)){
                coleccion.add(new Card(existe.getNombre(), existe.getTipo()));
                return coleccion;
            }
        }
        
        return null;
    }
    /**
     * Nos ayuda a saber si una carta existe o no en un Map
     * @param map El listado del mapeo
     * @param opcion Carta que quiere busca el usuario
     * @return Si existe o no existe
     */
    public boolean buscar(Map<Integer, Card> map, String opcion){
        for(Entry<Integer, Card> carta : map.entrySet()){
            Card existe = carta.getValue();
            if(existe.getNombre().equals(opcion)){
                return true;
            }
        }
        return false;
    }
        
    /**
     * Muestra todas las cartas del mapa
     * @param map Listado de todas las cartas del mapa
     */
    public void mostrarCartas(Map<Integer, Card> map){
        map.entrySet().forEach((carta) -> {
            Integer key = carta.getKey();
            Card valor = carta.getValue();
            System.out.println(key + ". " + valor.toString());
        });
    }
    
    /**
     * Muestra el tipo de una carta.
     * @param opcion Lo que elije el usuario
     * @param map La coleccion de mapeos
     * @return tipo de la carta
     */
    public String mostrarTipo(String opcion, Map<Integer, Card> map){
        String tipo = "";
        for (Entry<Integer, Card> carta : map.entrySet()){
            Card valor = carta.getValue();
            if(valor.getNombre().equals(opcion)){
                String nom = valor.getNombre();
                String tip = valor.getTipo();
                tipo = nom + " es de tipo: " + tip;
            }
        }
        return tipo;
    }
    /**
     * Metodo que permite enlistar todas las cartas.
     * @param collecion Array de cartas. c
     * @return Informacion total de las cartasy su conteo.
     */
    public String MostrarArray(ArrayList<Card> coleccion){
        String cartas = "";
        int contador = 0; 
        int monstruo = 0, hechizo = 0, trampa = 0; 
        for(Card carta: coleccion){
            contador++;
            cartas += contador + ". " + carta.toString() + "\n";
            if(carta.getTipo().equals("Monstruo")) {
                monstruo++;
            }if(carta.getTipo().equals("Hechizo")) { 
                hechizo++;
            }if(carta.getTipo().equals("Trampa")) {
                trampa++;
            }
            else{
                
            }   
        }
        if(cartas.isEmpty()){
            return "No hay cartas";
        }else{
            cartas += "\nHay: \n" + "Monstruos: " + monstruo + "\n" + "Hechizos: " + hechizo + "\n" + "Trampas: " + trampa + "\n";
        }
        return cartas;
    }
    /**
     * Ordena el mazo de cartas
     * @param mazo mazo de la persona
     * @return String de la lista de cartas
     */
    public String ordenarMazo(ArrayList<Card> mazo){
        Collections.sort(mazo, (Card c1, Card c2) -> c1.getTipo().compareTo(c2.getTipo()));
        String a = "";
        
        
        return MostrarArray(mazo);
    }
    /**
     * Ordena la coleccion de cartas
     * @param map Mapa de cartas en la coleccion.
     * @return Informacion de las cartas ordenadas.
     */
    public String ordenarColeccion(Map<Integer, Card> map){
        Card[] cartas = new Card[map.size()];
        ArrayList<Card> arreglo = new ArrayList<>();
        for (Entry<Integer, Card> nueva : map.entrySet()){
            Card valor = nueva.getValue();
            Card nueva1 = new Card(valor.getNombre(), valor.getTipo());
            arreglo.add(nueva1);
        }        
        Collections.sort(arreglo, (Card c1, Card c2) -> c1.getTipo().compareTo(c2.getTipo()));
        for(int i = 0; i < arreglo.size(); i++){
            cartas[i] = arreglo.get(i);
        }
        return ordenarMazo(arreglo);
    }
    /**
     * Cuenta cuantas cartas de cada tipo existen
     * @param coleccion Coleccion de cartas 
     * @return el conteo de las cartas
     */
    public String contar(ArrayList<Card> coleccion){
        String cartas = ""; 
        int contador = 0;
        int monstruo = 0, hechizo = 0, trampa = 0; 
        for(Card carta: coleccion){
            contador++;
            cartas += contador + ". " + carta.toString() + "\n";
            
            if(carta.getTipo().equals("Monstruo")){
                monstruo++;
            }else if(carta.getTipo().equals("Hechizo")){
                hechizo++;
            }else if(carta.getTipo().equals("Trampa")){
                trampa++;
            }
        }
        
        if(cartas.isEmpty()){
            return "No hay cartas existentes";
        }else{
            cartas += "\nExisten: \n"+ "Monstruos: " + monstruo + "\n" + "Hechizos: " + hechizo + "\n"+ "Trampas: " + trampa + "\n";
        }                
        
        return cartas;
    }        
}

