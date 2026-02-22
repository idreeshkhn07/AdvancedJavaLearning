package com.example.oppsconcept.EnumDemo.EnumExample;

public enum Operation {

    ADD {
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        public int apply(int a, int b){
            return  a - b;
        }
    };

    public abstract int apply(int a, int b);
}
