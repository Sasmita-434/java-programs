package org.objects;

public class ResultMain {

    public static void main(String[] args) {

        Result object1 = new Result();
        object1.StudentName = "Ridhima Ray";
        object1.mark1 = 49;
        object1.mark2 = 51;
        object1.percentage = ((object1.mark1 + object1.mark2)/200)*100;

        System.out.println("Student Name : "+object1.StudentName);
        System.out.println("Mark-1 : "+object1.mark1);
        System.out.println("Mark-2 : "+object1.mark2);
        System.out.println("Percentage : "+object1.percentage);

        System.out.println(object1.getResult());
        System.out.println("----------------------------------");

        Result object2 = new Result();
        object2.StudentName = "Astha Mohanty";
        object2.mark1 = 91;
        object2.mark2 = 82;
        object2.percentage = ((object2.mark1 + object2.mark2)/200)*100;

        System.out.println("Student Name : "+object2.StudentName);
        System.out.println("Mark-1 : "+object2.mark1);
        System.out.println("Mark-2 : "+object2.mark2);
        System.out.println("Percentage : "+object2.percentage);

        System.out.println(object2.getResult());
        System.out.println("----------------------------------");

        System.out.println(object1 == object2);
        System.out.println("object1 class: "+object1.getClass());
        System.out.println("object2 class: "+object2.getClass());

        System.out.println("-----------------------------------");
        Result var1 = object1;
        System.out.println(var1 == object1);
        System.out.println("object1 : "+object1);
        System.out.println("Variable2 : "+var1);
        System.out.println("object1 hashcode: "+object1.hashCode());
        System.out.println("Variable1 hashcode : "+var1.hashCode());

        System.out.println("-----------------------------------");
        Result var2 = object2;
        System.out.println(var2 == object2);
        System.out.println("object2 : "+object2);
        System.out.println("Variable2 : "+var2);
        System.out.println("object2 hashcode: "+object2.hashCode());
        System.out.println("Variable2 hashcode : "+var2.hashCode());

        System.out.println("-----------------------------------");
        Result var3 = var1;
        System.out.println(var3 == var1);
        System.out.println("object1 : "+object1);
        System.out.println("Variable1 : "+var1);
        System.out.println("Variable3 : "+var3);
        System.out.println("object1 hashcode: "+object1.hashCode());
        System.out.println("Variable1 hashcode : "+var1.hashCode());
        System.out.println("Variable3 hashcode : "+var3.hashCode());



    }
}
