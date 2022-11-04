package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paw = this.numberOfPaws > 1 ? " paws " : " paw ";
        String fur = this.hasFur ? " a fur." : " no fur.";
        return "This animal is mostly " + this.color
                + ". It has " + this.numberOfPaws + paw
                + "and" + fur;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }


}
