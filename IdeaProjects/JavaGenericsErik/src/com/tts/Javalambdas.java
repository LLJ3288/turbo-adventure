package com.tts;

import com.tts.lambdasInterface.IntMath;

import java.util.ArrayList;

public class Javalambdas implements IntMath {

    public void arrayStuff() {
        ArrayList<String> students = new ArrayList<>();
        students.add("Bob");
        students.add("Jessica");
        students.add("Dave");

        students.forEach(student -> {               //System.out.println(student));
            if (student.substring(0, 1).equals("J")) {
                System.out.println(student);
            }

        });
    }

    @Override
    public int operations(int a, int b) {
        return 0;
    }
}
