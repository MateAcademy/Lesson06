package com.itvdn.javaEssential.static_members.ex005_constructors;

public class Main {
    public static void main(String[] args) {
        // 1 Вариант. (Вызывается только Статический конструктор.)
        NotStaticClass.staticMethod();

        // 2 Вариант. (Вызываются оба Конструктора.)
        // new NotStaticClass().notStaticMethod();
    }
}
