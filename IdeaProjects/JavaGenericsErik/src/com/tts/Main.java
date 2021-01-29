package com.tts;
import com.tts.lambdasInterface.IntMath;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        IntMath addMethod = (a, b) -> a - b;
        System.out.println(addMethod.operations(4, 5));

        Javalambdas stuffArr = new Javalambdas();
        stuffArr.arrayStuff();


        AnotherClass<Integer, String> myClass = new AnotherClass<>(12, "Hello");
        int numVal = myClass.getThingOne();
        String strVal = myClass.getThingTwo();

        AnotherClass<String, String> myClass2 = new AnotherClass<>("12", "45");
        String numVal2 = myClass2.getThingOne();
        String numVal3 = myClass2.getThingTwo();


        //System.out.println("Printing everything");
        //System.out.println("numVal: " + numVal);
        //System.out.println("strVal: " + strVal);


        Set<String> newSet = new HashSet<>();
        newSet.add("one");
        newSet.add("two");
        newSet.add("three");

        Set<String> newSet2 = new HashSet<>();
        newSet2.add("four");
        newSet2.add("five");
        newSet2.add("six");

        Set<String> setResult = printStuff(newSet, newSet2);
        //    Iterator<String> myItr = setResult.iterator();
        //  while(myItr.hashNext()) {
        //    System.out.println(myItr.next());

        for (String s : setResult) {
            System.out.println(s);
        }
    }



    public static <E>Set<E> printStuff(Set<E> setOne, Set<E> setTwo) {
        //
        Set<E> result = new HashSet<>(setOne);
        result.addAll(setTwo);

        System.out.println("result" + result);

        return  result;
    }
}
