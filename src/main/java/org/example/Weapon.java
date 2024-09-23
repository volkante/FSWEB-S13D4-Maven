package org.example;


//Weapon org.example paketi altında bir enum olmalı.

    public enum Weapon {
        //Weapon enumının değerlerinden bir tanesi SWORD olmalı. İsteğinize göre başka değerlerde ekleyebilirsiniz.
        SWORD(50, 1.2);

        /*Her weapon için bir adet int damage ve double attackSpeed değeri tanımlanmalı. Aynı zamana bu değişkenler için getter metodları da yazılmalı.*/
        private int damage;
        private double attackSpeed;

        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }

        public int getDamage(){
            return damage;
        }

        public double getAttackSpeed(){
            return attackSpeed;
        }




    }





