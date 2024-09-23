package org.example;

//org.example paketi Player isimli bir sınıf oluşturunuz.
public class Player {

//Sınıfın 3 tane değişkeni olmalı String name int healthPercentage Weapon weapon
//Tüm değişkenlere sadece bu sınıf içerisinden ulaşılabilinmeli.
//Değişkenler için getter ve setter metodları kesinlikle TANIMLANMAMALI.

    private String name;
    private int healthPercentage;
    private Weapon weapon;

//Sınıfın tek bir constructor metodu olmalı ve bu 3 değeri set edebilmeli.
//player objesi oluşturulduğu anda eğer healthPercentage 100'den büyük verildiyse, 100 değerine set edilmeli. Eğer healthPercentage 0'dan küçük verildiyse 0'a set edilmeli.

    public Player (String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage>100 ? 100 : healthPercentage<0 ? 0 :healthPercentage;
        this.weapon = weapon;

    }

//Player sınıfı için 3 adet metod tanımlamalıyız.

//healthRemaining metodu healthPercentage değerini dönmeli.

    public int healthRemaining() {
        return healthPercentage;
    }

//loseHealth(int damage) metodu damage değeri kadar healthPercentage değerinden düşmeli. Oyuncunun canı bir şekilde 0'değerinin altına düşerse, System.out.println(name + " player has been knocked out of game"); değerini ekrana basmalı.

    public void loseHealth(int damage) {
        healthPercentage= healthPercentage - damage;
        if (healthPercentage<0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

//restoreHealth(int healthPotion) metodu healthPotion miktarı kadar healthPercentage değerine ekleme yapmalı. Oyunucunun canı 100 değerinden yüksek bir değere çıkarsa tekrar geri 100 değerine eşitlenmeli.

    public void restoreHealth (int healthPotion) {
        healthPercentage = healthPercentage + healthPotion;
        if (healthPercentage>100) {
            healthPercentage = 100;
        }
    }

}
