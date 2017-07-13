package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(final String[] args) {
        Human grandFather1 = new Human("Боря", true, 80);
        Human grandFather2 = new Human("Василий", true, 80);
        Human grandMother1 = new Human("Маша", false, 75);
        Human grandMother2 = new Human("Маруся", false, 75);
        Human father = new Human("Александр", true, 55, grandFather1, grandMother1);
        Human mother = new Human("Ирина", false, 50, grandFather2, grandMother2);
        Human child1 = new Human("Вася", true, 30, father, mother);
        Human child2 = new Human("Петр", true, 25, father, mother);
        Human child3 = new Human("Маруся", false, 18, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















