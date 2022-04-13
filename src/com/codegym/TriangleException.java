package com.codegym;

import java.util.Scanner;

public class TriangleException{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh tam giac a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        try {
            checkTriangle(a,b,c);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || b + c <= a || a + c <= b || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le");
        }else {
            System.out.println("Tam giac hop le");
        }
    }
}
