package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     *create a mock list for my city list
     *@return
     */
    public CustomList MockCityList() {
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /** 
     *this adds a city object to the list 
     *the second phase,you can add the city
     *@paramcity 
     */ 
    public void addCity(Citycity){ 
        cities.add(city); 
    }

}
