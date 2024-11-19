/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.univ.univer2;
import com.univ.univer2.model;
/**
 *
 * @author sadjang
 */
public class Univer2 {

    public static void main(String[] args) {
       // Création des instances
        Animal dog = new Dog("Rex");
        Animal bird = new Bird("Tweety");
        Animal bat = new Bat("Bruce");

        // Interaction avec les objets
        dog.makeSound();
        bird.makeSound();
        ((CanFly) bird).fly(); // Cast pour utiliser l'interface
        bat.makeSound();
        ((CanFly) bat).fly(); // Cast pour utiliser l'interface
    
    }
}
