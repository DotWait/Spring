package com.dotwait.dependencyinjection;

import java.beans.ConstructorProperties;

public class ExampleBean {
    // Number of years to calculate the Ultimate Answer
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    private AnotherBean anotherBean;
    private YetAnotherBean yetAnotherBean;
    private int i;

//    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public void show(){
        System.out.println("years="+years+",ultimateAnswer="+ultimateAnswer);
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public void setYetAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void printThreeProperties(){
        System.out.println("anotherBean="+anotherBean+",yetAnotherBean="+yetAnotherBean+",i="+i);
    }
}
