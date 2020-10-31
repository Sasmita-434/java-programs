package org.datatypes;

public class PrimitiveDatatype {

    public static void main(String[] args) {

        byte b = 96;  // -128 to +127
        int i = b;  // assigning byte value to integer value
        System.out.println("i = "+b);
        System.out.println("In BinaryString : "+Integer.toBinaryString(i)); // converting integer value to string value
        int j = 270;
        System.out.println("j = "+j);
        System.out.println("In BinaryString : "+Integer.toBinaryString(j));
        System.out.println("In String : "+Integer.toString(j));
        System.out.println("In HexString : "+Integer.toHexString(j));
        System.out.println("In OctalString : "+Integer.toOctalString(j));
        byte k = (byte)j;  // casting integer to byte
        System.out.println("k = "+k);
        System.out.println(Integer.toBinaryString(k));
        System.out.println("-----------------------------------------");
        sizeOfDatatype();
        System.out.println("----------------------------------------");
        conversion();
    }

    private static void sizeOfDatatype(){
        System.out.println("Byte size = "+Byte.SIZE);  // 8
        System.out.println("Byte min-value = "+Byte.MIN_VALUE);
        System.out.println("Byte max-value = "+Byte.MAX_VALUE);
        System.out.println("-----------------------------------------");
        System.out.println("Short size = "+Short.SIZE);  // 16
        System.out.println("Short min-value = "+Short.MIN_VALUE);
        System.out.println("Short max-value = "+Short.MAX_VALUE);
        System.out.println("-----------------------------------------");
        System.out.println("Integer size = "+Integer.SIZE);  // 32
        System.out.println("Integer min-value = "+Integer.MIN_VALUE);
        System.out.println("Integer max-value = "+Integer.MAX_VALUE);
        System.out.println("-----------------------------------------");
        System.out.println("Float size = "+Float.SIZE);  // 32
        System.out.println("Float min-value = "+Float.MIN_VALUE);
        System.out.println("Float max-value = "+Float.MAX_VALUE);
        System.out.println("-----------------------------------------");
        System.out.println("Double size = "+Double.SIZE);  // 64
        System.out.println("Double min-value = "+Double.MIN_VALUE);
        System.out.println("Double max-value = "+Double.MAX_VALUE);
        System.out.println("-----------------------------------------");
        System.out.println("Character size = "+Character.SIZE);  // 16
        System.out.println("Character min-value = "+Character.MIN_VALUE);
        System.out.println("Character max-value = "+Character.MAX_VALUE);
        System.out.println("-----------------------------------------");
        System.out.println("Boolean true = "+Boolean.TRUE);  // true
        System.out.println("Boolean false = "+Boolean.FALSE);  // false
        System.out.println("-----------------------------------------");
        System.out.println("Long size = "+Long.SIZE);  // 64
        System.out.println("Long min-value = "+Long.MIN_VALUE);
        System.out.println("Long max-value = "+Long.MAX_VALUE);
    }

    private static void conversion() {
        char a = 'z';
        System.out.println("Integer value of 'z' = "+(int)a);
        int zz = 550;
        System.out.println("Character value of '"+zz+"' = "+(char)zz);

        int c = 0;
        while (c < 65535) {
            System.out.println("c= " + c + " " + (char) c);
            c = c + 1;
        }
    }
}
