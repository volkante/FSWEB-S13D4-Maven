package org.example;

//org.example paketi altında Point isimli bir sınıf tanımlayınız.
public class Point {

//Sınıfın 2 tane değişkeni olmalı x ve y ikisinin de değeri int olmalı.
//Bu iki değişkene sadece bu sınıf içerisinden erişilebilinmeli.
    private int x;
    private int y;

//Point sınıfı için bir adet constructor tanımlayınız. İki değeri de set edebilmeli.
    public Point ( int x,  int y) {
        this.x = x;
        this.y = y;
    }

//İlgili iki değişken için getter ve setter metodlarını tanımlayınız.
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x =x;
    }

    public void setY(int y) {
        this.y=y;
    }

    /*
    Point sınıfı içerisinde bir tane distance isminde metod tanımlayınız.
    distance metodu iki nokta arasındaki uzaklığı bulmaya yarar.
    Bu işlemin matematiksel olarak yapımı: √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) şeklindedir.
     √ işlemi karekök işlemini tanımlar. Math.sqrt bu işlem için kullanılmalıdır.

    distance metodu için 3 farklı overloading istenmektedir
    distance() hiçbir değer almazsa (0,0) noktasına göre uzaklık hesaplanmalı.
    distance(Point p) şeklinde başka bir Point objesi alırsa verilen noktaya göre uzaklık hesaplanmalı.
    distance(int a, int b) şeklinde 2 farklı int parametresi alınırsa (a,b) ye göre uzaklık bulunmalı.*/


    public double distance () {
        int a = 0;
        int b = 0;
        return Math.sqrt((a-x) * (a-x) + (b-y) * (b-y));
    }

    public double distance (double a, double b) {
        return Math.sqrt((a-x) * (a-x) + (b-y) * (b-y));
    }

    ///

    public double distance (Point p) {
        double pX = p.getX();
        double pY = p.getY();
        return Math.sqrt((pX-x)*(pX-x) + (pY-y) * (pY-y));
    }

}
