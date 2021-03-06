package com.hkllyx.demo.basic.generic.tuple;

/**
 * 包含2个对象的元组
 *
 * @author HKLLY
 * @date 2019/4/2
 */
public class TwoTuple<A, B> {
    public final A a;
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}
