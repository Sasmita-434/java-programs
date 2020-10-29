package org.oops.inheritance;

public class CastingMultilevelInheritance {

    public static void main(String[] args) {

        BaseParent baseParent = new BaseParent();
        baseParent.m1();
        System.out.println("-------------------------------------");
        BaseParent baseParent1 = new Child();
        baseParent1.m1();
        System.out.println("-------------------------------------");
        Object objectRefVar =  baseParent1;
        System.out.println("objectRefVar : "+objectRefVar.hashCode());
        Parent parentRefVar = (Parent) baseParent1;
        System.out.println("parentRefVar : "+parentRefVar.hashCode());
        Child childRefVar = (Child) baseParent1;
        System.out.println("childRefVar : "+childRefVar.hashCode());
    }

    private static class BaseParent
    {
        public BaseParent() {
            System.out.println("BaseParent : "+this.getClass());
            System.out.println("BaseParent : "+this.hashCode());
        }
        protected void m1() {
            System.out.println("m1() method in BaseParent class");
        }
    }

    private static class Parent extends BaseParent
    {
        public Parent() {
            System.out.println("Parent : "+this.getClass());
            System.out.println("Parent : "+this.hashCode());
        }
        protected void m2() {
            System.out.println("m2() method in BaseParent class");
        }
    }

    private static class Child extends Parent
    {
        public Child() {
            System.out.println("Child : "+this.getClass());
            System.out.println("Child : "+this.hashCode());
        }

        @Override
        protected void m1() {
            System.out.println("m1() Override in child class");
        }
    }
}
