package com.itvdn.javaEssential.static_members.ex004_static_blocks;

/**
 * Статические блоки.
 * Статических блоков может быть сколько угодно и вызываться они будут в том же порядке, в котором написаны.
 */
public class NotStaticClass {
    static int X;

    static {
        X = 1;
        System.out.println("Static block  X = " + X);
    }

    static {
        X = 23;
        System.out.println("Static block  X = " + X);
    }

    static {
        X = -99;
        System.out.println("Static block  X = " + X);
    }

    public NotStaticClass(int x) {
        X = x;
        System.out.println("Constructor  X = " + X);
    }
}
