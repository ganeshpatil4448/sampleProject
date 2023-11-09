package org.example2;

public class Sample {
    static
    {
        int a=10;
        System.out.println("Java"+a);    }
    static
    {
        System.out.println("Java");    }
    void awe()
    {
        System.out.println("awe");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Sample obj=new Sample();
        obj.awe();
    }
}
