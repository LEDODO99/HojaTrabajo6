/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class FactoryCardsTest {
    
    public FactoryCardsTest() {
    }

    /**
     * Test que verifica la funcionalidad de HashMap en Factory
     */
    @Test
    public void testFactoryCardsHashMap() {
        System.out.println("FactoryCardsHashMap");
        String tipoSet = "HM";
        FactoryCards instance = new FactoryCards();
        HashMap expResult = new HashMap();
        Map result = instance.FactoryCards(tipoSet);
        assertEquals(expResult, result);
    }

    /**
     * Test que verifica la funcionalidad de TreeMap en Factory
     */
    @Test
    public void testFactoryCardsTreeMap() {
        System.out.println("FactoryCardsTreeMap");
        String tipoSet = "TM";
        FactoryCards instance = new FactoryCards();
        Map expResult = new TreeMap();
        Map result = instance.FactoryCards(tipoSet);
        assertEquals(expResult, result);
    }
    
    /**
     * Test que comprueba la funcionalidad del Linked Hash Map en Factory
     */
    @Test
    public void testFactoryCardsHashLinkedHashMap() {
        System.out.println("FactoryCardsHashLinkedHashMap");
        String tipoSet = "LHM";
        FactoryCards instance = new FactoryCards();
        Map expResult = new LinkedHashMap();
        Map result = instance.FactoryCards(tipoSet);
        assertEquals(expResult, result);
    }
}
