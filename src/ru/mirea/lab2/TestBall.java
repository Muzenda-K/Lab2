package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(50,40);
        System.out.println(ball1);
        ball1.move(20,30);
        System.out.println(ball1);
    }
}
