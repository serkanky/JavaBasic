package com.company;

import com.company.OOP.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String str = "string";
        int integer = 0;
        boolean bool = false;
        Character character = 'f';
        List<String> stringList = new ArrayList<>();
        stringList.add("element1");
        stringList.add("element2");
        stringList.add("element3");

        if(integer == 1){
            System.out.println("integer değeri " + integer);
            System.out.println(String.format("integer değeri %s",integer));
        }

        for (int i = 0;i<10;i++){
            System.out.println(i);
        }

        while(integer<10){
            System.out.println(integer);
            integer += 1;
        }

        for (String _char :
                stringList) {
            System.out.println(_char);
        }
        System.out.println("------ Arraylist -------");

        // ARRAY LIST
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("List-Element1");
        stringList1.add("List-Element2");
        stringList1.add("List-Element3");
        stringList1.add("List-Element4");
        /*stringList1.forEach((index) ->{
            System.out.println(index);
        });*/
        stringList1.forEach(System.out::println);
        System.out.println(stringList1.size());
        System.out.println(stringList1.get(2));
        System.out.println(stringList1.isEmpty());
        System.out.println(stringList1.remove(1));

        //Peek
        stringList1.get(stringList1.size()-1);

        //Pop
        stringList1.get(stringList1.size()-1);
        stringList1.remove(stringList.size()-1);


        System.out.println("------ Linkedlist -------");

        // LINKED LIST
        stringList1 = new LinkedList<>();
        stringList1.add("Linked List-Element2");
        stringList1.add("Linked List-Element3");
        stringList1.add("Linked List-Element4");
        /*stringList1.forEach((index) ->{
            System.out.println(index);
        });*/
        stringList1.forEach(System.out::println);
        System.out.println(stringList1.size());
        System.out.println(stringList1.get(2));
        System.out.println(stringList1.isEmpty());
        System.out.println(stringList1.remove(1));

        System.out.println("------ Stack -------");

        Stack<String> stack = new Stack<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        /*while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }*/

        System.out.println("Peek");
        System.out.println(stack.peek());
        stack.forEach(System.out::println);
        System.out.println("Pop");
        System.out.println(stack.pop());
        stack.forEach(System.out::println);

        System.out.println("------- HashSet -------");

        Set<String> hashSet = new LinkedHashSet<>();
        System.out.println(hashSet.add("Element1"));
        hashSet.add("Element2");
        hashSet.add("Element3");
        System.out.println(hashSet.size());
        System.out.println(hashSet.add("Element1"));
        hashSet.forEach(System.out::println);

        Map<String,Integer> integerMap = new HashMap<>();
        integerMap.put("Key1",1);
        integerMap.put("Key2",2);
        integerMap.put("Key3",3);
        integerMap.put("Key4",4);
        integerMap.remove("Key4");
        System.out.println(integerMap.values());
        System.out.println("---");
        System.out.println(integerMap.keySet());
        for (Map.Entry<String,Integer> entry:
             integerMap.entrySet()) {
            System.out.println(entry);
        }
        integerMap.values().forEach(System.out::println);
        integerMap.keySet().forEach(System.out::println);

        System.out.println("-------- Stream --------");
        List<Integer> streamExampleList = new ArrayList<>();
        streamExampleList.add(1);
        streamExampleList.add(12);
        streamExampleList.add(32);
        streamExampleList.add(99);
        streamExampleList.add(16);
        streamExampleList.add(32);
        List<Integer> streamList = null;
        streamList = streamExampleList.stream().filter((index)->index == 1).collect(Collectors.toList());
        System.out.println(streamList);

        streamList = streamExampleList.stream().filter((index)->index > 30).collect(Collectors.toList());
        System.out.println(streamList);

        streamList = streamExampleList.stream().filter((index)->index < 20).collect(Collectors.toList());
        System.out.println(streamList);

        int totalSumOfList = streamExampleList.stream().reduce(Integer::sum).get();
        System.out.println(totalSumOfList);

        int maxNumber = streamExampleList.stream().reduce(Integer::max).get();
        System.out.println(maxNumber);

        int minNumber = streamExampleList.stream().reduce(Integer::min).get();
        System.out.println(minNumber);

        streamList = streamExampleList.stream().map((index)->index+2).collect(Collectors.toList());
        System.out.println(streamList);
        System.out.println(streamExampleList);

        streamList = streamExampleList.stream().distinct().collect(Collectors.toList());
        System.out.println(streamExampleList);
        System.out.println(streamList);

        streamList = streamExampleList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(streamExampleList);
        System.out.println(streamList);

        streamList = streamExampleList.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : o1.equals(o2) ? 0 : -1;
            }
        }).collect(Collectors.toList());
        System.out.println(streamExampleList);
        System.out.println(streamList);


        // OOP
        UcamayanCanlı dogukan  = new Dogukan();
        UcamayanCanlı tarcın  = new Tarcın();
        dogukan.yuru();
        tarcın.yuru();
    }
}
