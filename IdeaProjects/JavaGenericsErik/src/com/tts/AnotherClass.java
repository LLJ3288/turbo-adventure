package com.tts;

public class AnotherClass<typeOne, typeTwo> {
    typeOne thingOne;
    typeTwo thingTwo;

    // constructor
    public AnotherClass(typeOne thingOne, typeTwo thingTwo) {
        this.thingOne = thingOne;
        this.thingTwo = thingTwo;
    }

    // getters and setters
    public typeOne getThingOne() {
        return thingOne;
    }

    public void setThingOne(typeOne thingOne) {
        this.thingOne = thingOne;
    }

    public typeTwo getThingTwo() {
        return thingTwo;
    }

    public void setThingTwo(typeTwo thingTwo) {
        this.thingTwo = thingTwo;
    }
}

