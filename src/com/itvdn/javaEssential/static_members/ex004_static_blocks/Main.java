package com.itvdn.javaEssential.static_members.ex004_static_blocks;

/**
 * Статические блоки.
 * В основном, статические блоки используют, чтобы установить значение по-умолчанию для членов класса.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);

        NotStaticClass instance = new NotStaticClass(1111);
        System.out.println(instance.X);

        System.out.println(NotStaticClass.X);
    }
}
