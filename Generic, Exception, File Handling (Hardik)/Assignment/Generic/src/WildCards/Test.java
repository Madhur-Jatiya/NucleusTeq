package WildCards;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Shape shape = null;
        Polygon polygon = null;

        shape = polygon;
        polygon = (Polygon) shape;

        ArrayList<Shape> shapelist = new ArrayList<>();
        ArrayList<Polygon> polygonList = new ArrayList<>();
        ArrayList<Hexagon> hexagonList = new ArrayList<>();

//        shapelist = polygonList;
//        polygonList = hexagonList;

//        Unbounded Wildcards
        ArrayList<?> polygonList2 = new ArrayList<>();
        shapelist = (ArrayList<Shape>) polygonList2;
        polygonList2 = hexagonList;

//        Bounded Wildcards
//        Upper bounded Wildcards
        ArrayList<? extends Polygon> polygonList3 = new ArrayList<>();
//        shapelist = (ArrayList<Shape>) polygonList3;
        polygonList3 = hexagonList;

//
//        Lower bounded wildcards
        ArrayList<? super Polygon> polygonList4 = new ArrayList<>();
        shapelist = (ArrayList<Shape>) polygonList4;
//        polygonList4 = hexagonList;
    }
}
