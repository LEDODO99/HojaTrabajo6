/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author David
 */
public class FactoryCards{
    /**
     * Metodo que devuelve un tipo de set segun lo indicado por el usuario
     * @param tipoSet Es el tipo de set que se desea
     * @return Devuelve un Set
     */
    public static <E> Set<E> getSet(String tipoSet) {

        if (tipoSet.equalsIgnoreCase("HS")) {
            return new HashSet<E>();

        } else if (tipoSet.equalsIgnoreCase("TS")) {
            return new TreeSet<E>();

        } else if (tipoSet.equalsIgnoreCase("LHS")) {
            return new LinkedHashSet<E>();
        }
        return null;
    }
}