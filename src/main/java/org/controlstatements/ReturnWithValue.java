package org.controlstatements;

public class ReturnWithValue {

    public static void main(String[] args) {

        System.out.println("Length of the String : "+returnWithValue());
    }

    private static int returnWithValue(){

        String colours[] = {"yellow","blue","green","red","white","black"};
        for (String c : colours) {
            if (c.length() == 3){
                System.out.println(c);
                return c.length()+1;
            }
            System.out.println(c);
        }
        System.out.println("Done");
        return -1;
    }
}
