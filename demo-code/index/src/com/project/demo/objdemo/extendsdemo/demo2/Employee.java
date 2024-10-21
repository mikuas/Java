package com.project.demo.objdemo.extendsdemo.demo2;

public class Employee {
    private String id;
    private String name;
    private String work;

    public Employee() {
    }

    public Employee(String id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }

    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getWork() {
        return work;
    }

    public Employee setWork(String work) {
        this.work = work;
        return this;
    }

    public void work() {
        System.out.println("工作");
    }
}
