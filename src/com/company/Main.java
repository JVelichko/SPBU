package com.company;



public class Main {

    public static void main(String[] args) {
        class Squared implements Function<Integer>  {
            @Override
            public Integer calculate(Integer e) {
                return e*e;
            }
        }
        MyLinkedList<Integer> List = new MyLinkedList<>();
        if (List.isEmpty()) {
            System.out.println("Empty");
        }
        List.add(10);
        List.show();
        List.add(15);
        List.add(0,3);
        List.show();
        List.remove(1);
        List.show();
        System.out.println(List.size());
        List.show();
        List.set(1,1);
        List.show();
        System.out.println(List.get(0));
        Squared squared = new Squared();
        List.map(squared);
        List.show();
        List.clear();
        List.show();



    }





}
