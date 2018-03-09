
import java.util.ArrayList;
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
    public String unirString(){
        return nombre + " --- " + tipo;
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
    
}

