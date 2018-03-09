/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.*;

/**
 *
 * @author David Soto y Luis Delgado
 */
public class FactoryCards{
    /**
     * Metodo que devuelve un tipo de set segun lo indicado por el usuario
     * @param tipoSet Es el tipo de set que se desea
     * @return Devuelve el tipo de estructura Map a utilzar
     */
    public Map FactoryCards(String tipoSet) {

        if(tipoSet == "HM") {
            return new HashMap();

        } if(tipoSet == "TM") {
            return new TreeMap();

        } if(tipoSet == "LHM") {
            return new LinkedHashMap();
        }
        return null;
    }
}