package org.oops.thiskeyword;

public class AdmissionForm {

    private String firstname;
    private String lastname;
    private String universityname;

    public AdmissionForm(String firstname,String lastname)
    {
        System.out.println("First name = "+this.firstname);
        System.out.println("Last name = "+lastname);
        System.out.println(firstname.hashCode());

        firstname = firstname;
        lastname = lastname;
        System.out.println("First name = "+firstname);
        System.out.println("Last name = "+this.lastname);
        System.out.println(firstname.hashCode());

        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("First name = "+this.firstname);
        System.out.println("Last name = "+this.lastname);
        includeuniversityname("Utkal University");
    }

    public String getfullname()
    {
        return (firstname+" "+lastname +" "+universityname);
    }

    public void includeuniversityname(String universityname)
    {
        this.universityname = universityname;
    }

    public void modifyfullname(String firstname, String lastname)
    {
        System.out.println("Modified value :--");
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
