package org.example.oops.inheritance;

public class BoxWeight extends Box{
    double weight;



    public BoxWeight() {
        this.weight = -1;
        this.l=-3;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight=other.weight;

    }
}
