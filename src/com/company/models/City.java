package com.company.models;
import java.util.*;

public class City {

    Set<String> cities = new LinkedHashSet<>();
    Scanner scan = new Scanner(System.in);

    public void addCity(){
        do {
            System.out.print("Введите город: ");
            String city = scan.next();
            cities.add(city);
        }while (cities.size()!=10);
    }

    public void show(){
        System.out.println(cities);
        List<String> listCity = new LinkedList<>(cities);
        int k =( int )(Math.random()*(listCity.size()));
        System.out.println(listCity.get(k));
    }
}
