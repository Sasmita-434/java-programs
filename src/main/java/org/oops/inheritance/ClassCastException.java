package org.oops.inheritance;

public class ClassCastException {

    // casting the object of one class type to the pbject of another class type
    public static void main(String[] args) {

        // 'object1' of Object class type pointing to object of different class type 'Test'
        Object object1 = new Test();
        System.out.println("object1 : "+object1.getClass());

        // child class reference = parent class reference
        Test object2 = (Test) object1; // change the type 'object1' to type 'Test'
        System.out.println("object2 : "+object2.getClass());

        /* casting 'object1' of 'object' class to 'String' class
        String object3 = (String) object1;
        System.out.println("object3 : "+object3.getClass());
        Exception generated   */

        Object object4 = new Object();
        System.out.println("object4 : "+object4.getClass());

        // casting 'object2' of class 'Test' to same class 'Test'
        Test t1 = (Test) object2;
        System.out.println("t1 : "+t1.getClass());

        /*  casting 'object4' of 'object' class to 'Test' class
        Test t2 = (Test) object4;
        System.out.println("t2 : "+t2.getClass());
        Exception generated  */
    }


    private static class Test
    {

    }
}
