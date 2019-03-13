package com.dotwait.dependencyinjection;

public class ThingOne {
    private ThingTwo thingTwo;
    private ThingThree thingThree;
    public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
        this.thingTwo = thingTwo;
        this.thingThree = thingThree;
    }
    public void showTwoAndThree(){
        thingTwo.show();
        thingThree.show();
    }
}
