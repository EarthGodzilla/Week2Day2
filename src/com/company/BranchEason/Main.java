package com.company.BranchEason;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i += 2;
            System.out.println(i);
        }

        for (i = 0; i < 10; i += 2) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i < 12);

        int[] intigers = {1, 2, 3, 4, -1, -2, 10};
        //find negativeas
        // use continue
        for (i = 0; i <intigers.length; i++) {
            if (intigers[i] < 0) {
                System.out.println(intigers[i]);
            }
        for(int j=1; j<=10;j++){
            System.out.println(j);
        }

        String name= "Simeon";
        System.out.println(name);
        name=name.substring(1,name.length()-1);
        System.out.println(name);
        

        }
    }
}