package com.makhabatusen;

public enum Operation {

    SUM {
        public int action(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        public int action(int a , int b ) {
            return a -b;
        }
    },
    MULTIPLY {
        public int action (int a , int b) {
            return a * b ;
        }
    },
    DIVIDE {
        public int action (int a, int b) {
            return  a / b;
        }
    };

    public abstract int action (int a, int b);
}
