package org.variable;

public class ConstantVariable {

    static final String variable1;
    final String variable2 = "This is another constant non-static variable";
    static {
        variable1 = "This is a constant static variable";
        // variable1 = "This is another static variable";
    }

    public static void main(String[] args) {
        System.out.println(variable1);
        ConstantVariable obj1 = new ConstantVariable();
        System.out.println(obj1.variable2);
        String firstname = "SASMITA";
        final String lastname = "PRADHAN";
        System.out.println("First name : "+firstname);
        System.out.println("Last name : "+lastname);
        obj1.totalmarks(81,78);
    }
    public void totalmarks(final int core_java, final int adv_java) {
        final int result = core_java + adv_java;
        System.out.println("Total marks = "+result);
    }
}
