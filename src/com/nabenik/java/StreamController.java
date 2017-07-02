package com.nabenik.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamController {
	public List<Integer> generateRandomList(){
        List<Integer> numbersList = new ArrayList<>();
        Random rGenerator = new Random();
        for (int i = 0; i < 10; i++) {
            numbersList.add(rGenerator.nextInt(255));
        }
        System.out.println("Original list " + numbersList);
        return numbersList;
    }
    
	//Java 7
    public void oldSort(){
        List<Integer> unsortedList = generateRandomList();
        System.out.println("Ordenando de la forma clasica");
        Collections.sort(unsortedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(unsortedList);
    }
    
    //Java 8
    public void lambdaSort(){
        List<Integer> theList = generateRandomList();
        theList.sort((x,y) -> x.compareTo(y));
        System.out.println(theList);
    }
    
    public void oldFilter(){
        List<Integer> unfilteredList = generateRandomList();
        System.out.println("Old way filtering");
        List<Integer> filteredList = new ArrayList<>();
        for (Integer number : unfilteredList) {
            if(number > 70){//Criterio
                filteredList.add(number);
            }
        }
        System.out.println(filteredList);
    }
    
    public void lambdaFilter(){
        System.out.println("Lambda way filtering");
        List<Integer> unfilteredList = generateRandomList();
        List<Integer> filteredList = unfilteredList.stream()
        		.filter(x -> x > 70) //Filtrar los datos
        		.map(x -> x*2) // Mutar
                .collect(Collectors.toList()); // Reduce 
        System.out.println(filteredList);
    }

    public void doDemo(){
        //Sorting demo
//        this.oldSort();
//        this.lambdaSort();
        //Filtering demo
        this.oldFilter();
        this.lambdaFilter();
    }
}
