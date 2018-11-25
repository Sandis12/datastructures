package com.grigulis.data;

public class FirstClass {
    private String field;

    int x = 100;
    String y = "Hello!";
    public FirstClass(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;

        String bbb = "Testeejam";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
