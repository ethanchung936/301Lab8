package com.example.lab8;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }


    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCities() {
        CustomList cityList = MockCityList();
        City city = new City("Calgary", "Alberta");
        assertFalse(cityList.hasCity(city));
        cityList.addCity(city);
        assertTrue(cityList.hasCity(city));
    }

    @Test
    void testDeleteCity() {
        CustomList cityList = MockCityList();
        City city = new City("Calgary", "Alberta");
        cityList.addCity(city);
        assertTrue(cityList.hasCity(city));
        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(city));
    }
}
