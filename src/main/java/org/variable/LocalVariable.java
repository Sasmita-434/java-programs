package org.variable;

public class LocalVariable {

    static {
        String name1 = "Sita";
        System.out.println(name1);
    }

    {
        String name2 = "Gita";
        System.out.println(name2);
    }

    public static void main(String[] args) {

        // System.out.println(name1);
        // System.out.println(name2);
        new LocalVariable();
    }

}
