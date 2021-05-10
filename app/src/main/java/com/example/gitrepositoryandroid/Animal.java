package com.example.gitrepositoryandroid;

public class Animal {
    String name;
    String age;
    String race;
    String weight;

    public Animal(String name, String age, String race, String weight) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.weight = weight;
    }

    public String[] return_details(){
        return new String[]{name, age, race,weight};
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public String getWeight() {
        return weight;
    }


}
