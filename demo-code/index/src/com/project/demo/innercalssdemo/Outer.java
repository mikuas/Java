package com.project.demo.innercalssdemo;

public class Outer {

    class Inner {
        private String name;
        private int age;
        String gender = "MAN";

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Inner setName(String name) {
            this.name = name;
            return this;
        }

        public Inner setAge(int age) {
            this.age = age;
            return this;
        }
    }
}
