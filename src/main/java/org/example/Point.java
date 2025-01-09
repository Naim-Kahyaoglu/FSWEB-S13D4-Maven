package org.example;

public class Point {
    // x ve y değişkenleri sadece sınıf içerisinden erişilebilir
    private int x;
    private int y;

    // Constructor ile x ve y değişkenlerinin değerlerini set ediyoruz
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x değişkeni için getter ve setter metodları
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // y değişkeni için getter ve setter metodları
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // distance() metodu (0,0) noktasına göre uzaklık hesaplar
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    // distance(Point p) metodu verilen Point objesine göre uzaklık hesaplar
    public double distance(Point p) {
        int deltaX = this.x - p.getX();
        int deltaY = this.y - p.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // distance(int a, int b) metodu (a, b) noktasına göre uzaklık hesaplar
    public double distance(int a, int b) {
        int deltaX = this.x - a;
        int deltaY = this.y - b;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
