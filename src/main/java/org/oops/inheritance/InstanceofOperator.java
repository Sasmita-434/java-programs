package org.oops.inheritance;

public class InstanceofOperator {

    public static void main(String[] args) {

        Object object1Ref = new Child();
        System.out.println(object1Ref instanceof Object);  //true
        object1Ref = new Parent();
        System.out.println("---------------------------------------");
        Object object2Ref = (Object)object1Ref;

        System.out.println(object1Ref instanceof BaseParent);  //true
        BaseParent baseParentRef = (BaseParent)object1Ref;

        System.out.println(object1Ref instanceof Parent);  //true
        Parent parentRef = (Parent)object1Ref;

        System.out.println(object1Ref instanceof Child);  //false
        Child childRef = (Child)object1Ref;
    }

    private static class BaseParent {
        public BaseParent() {
            System.out.println("BaseParent");
        }
    }

    private static class Parent extends BaseParent {
        public Parent() {
            System.out.println("Parent");
        }
    }

    private static class Child extends Parent {
        public Child() {
            System.out.println("Child");
        }
    }
}
