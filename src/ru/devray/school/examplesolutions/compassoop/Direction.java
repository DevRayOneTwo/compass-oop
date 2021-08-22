package ru.devray.school.examplesolutions.compassoop;

public enum Direction {

    N("North",0.0),
    NNE("North-East",22.5),
    NE("North-East",45),
    ENE("North-East",67.5),
    E("East",90),
    ESE("South-East",112.5),
    SE("South-East",135),
    SSE("South-East",157.5),
    S("South", 180),
    SSW("South-West", 202.5),
    SW("South-West", 225),
    WSW( "South-West", 247.5),
    W("West", 270),
    WNW("West-North-West", 292.5),
    NW("North-West", 315),
    NNW("North-North-West", 337.5);

    private final String longName;
    private final double degree;

    Direction(String longName, double degree) {
        this.longName = longName;
        this.degree = degree;
    }

    public double getDegree(){
        return this.degree;
    }

    @Override
    public String toString() {
        return  String.format("[%s] - %s -", this.name(), longName);
    }

}