package org.example;

public class VersionDemo {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println();
        System.out.println("This program is running version " +
                VersionDemo.class.getPackage().getImplementationVersion());
    }
}
