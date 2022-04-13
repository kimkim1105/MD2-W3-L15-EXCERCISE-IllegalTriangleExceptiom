package com.codegym;

public class TriangleCheck {
    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || b + c <= a || a + c <= b || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le");
        }else {
            System.out.println("Tam giac hop le");
        }
    }
}
