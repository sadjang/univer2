/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ.univer2.model;

import com.univ.univer2.model.Animal;

/**
 *
 * @author sadjang
 */
class Bat extends Animal implements CanFly {
    public Bat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " émet des ultrasons : Screech !");
    }

    @Override
    public void fly() {
        System.out.println(name + " vole dans la nuit !");
    }
}