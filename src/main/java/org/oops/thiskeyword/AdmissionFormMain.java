package org.oops.thiskeyword;

public class AdmissionFormMain {

    public static void main(String[] args) {

        AdmissionFormWithThis();
    }

    public static void AdmissionFormWithThis()
    {
        AdmissionForm student = new AdmissionForm("Sasmita","Pradhan");
        System.out.println(student.getfullname());
        student.modifyfullname("Astha","Mohanty");
        System.out.println(student.getfullname());
    }
}
