// used node script.js in terminal



// token -> expression -> statement -> block
// token is the smallest piece of code
// expression resolves to a value
// statement performs an action, in other words they do something
// block is simply a grouping of statements, they do not have to be related but should



class Rectangle { 

// height
// width

    constructor(paramHeight, paramWidth) {
            this.height = paramHeight;
            this.width = paramWidth;
    }
}

// <-- here we are making an instance of the class Rectangle
const myObject = new Rectangle(); 
// <-- the type of my arguments can be arbitrary
const otherObject = new Rectangle(4, "My name is Leonard");


console.log(myObject);
console.log(otherObject);

otherObject.width = 5;

console.log(otherObject);

//-------------------------------commented out
//varTest();

//function letTest() {
//    console.log("--inside letTest() function--")
//    let x =1;
//{
//    let x = 2;// this is locally scoped
//    console.log(x);
//}
//console.log(x);// this is still referencing the first x!
//}

//letTest();

// classes are syntatic sugar that immediately invoked functional expression (IIFE)
//-------------------------------------comment end

(function () {
        console.log('I am inside an IIFE');
})();

(function (height, width){
    height = 5;
    width = 4;
    console.log(height);
})();


// this is the superclass
class Parent {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}


// this is the subclass
class Child extends Parent {
    constructor(school, name, age) {
        super(name, age);
        this.school = school;     //refers to the Parent 
    }    
}

const myChild = new Child('/Weaver High', 'Timmy', '14');

console.log(myChild);

class Car {
    constructor(engine, make, model) {
        this.engine = engine;
        this.make = make;
        this.model = model;
    }
}

class Engine {
    constructor(name){
        this.name = name;
    }
}     

const myCar = new Car(new Engine('myEngine'), 'myMake', 'myModel');
console.log(myCar);

// declaritive-- what you see is what you get
// black box-- you don't know what happens inside of it--example would be an arrow function


// functional programming is a formal system

const myFunc = () => 4;
const otherFunction = () => {};

console.log(typeof otherFunction);

//arrow functions immediately returns a result


const addTwo = (x) => x + 2;

function otherAddTwo(x) {
        return x + 2;
}
console.log('call to arrow function')
console.log(addTwo(4))