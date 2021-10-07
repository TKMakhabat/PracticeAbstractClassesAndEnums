package com.makhabatusen;

public enum Color {

    RED ("#FF00000", 1),
    BLUE("#0000FF", 2),
    GREEN("#00FF00", 3);

    private  String code;
    private  int order;

    public String getCode() {
        return code;
    }

    public int getOrder() {
        return order;
    }

    Color(String color, int order) {
        this.code = color;
        this.order = order;
    }
}
