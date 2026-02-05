package bai07;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.lang.Math;

public class bai07 {

    public static void main(String[] args) {
        address home = new address("chua boc", "HA NOI", "con hoc", 112);
        address school = new address("chua boc", "HA NOI", "Nghi tet", 111);
        student st1 = new student("trung", "nguyen", home, school);
        System.out.println(st1);
    }
}
