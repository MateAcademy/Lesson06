package com.itvdn.javaEssential.static_members.ex002_static;

public class NotStaticClass {
    private int id;

    // Конструктор.
    public NotStaticClass(int id) {
        this.id = id;
    }

    public static void Method() {
        //System.out.println("Instance.Id = {0}", Id);

        System.out.println("В статических методах нельзя обращаться к нестатическим полям.");
    }
}
