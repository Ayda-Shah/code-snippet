/*
This challenge involves points in two and three dimensional space. The classes and methods to implement will store values for coordinates as well as calculate
* distances between points. The 2D and 3D distances between two points are calculated using the following formulae:
*
*
* √[(x₂ - x₁)² + (y₂ - y₁)²]
* √[(x₂ - x₁)² + (y₂ - y₁)²+ (z₂ - z₁)²]
*
* Implement the classes and methods defined below:
*
* 1. A superclass named Point2D.
*     Instance Variables
*         x -> Stores the value of the x- coordinate.
*         y -> Stores the value of the y coordinate.
*
*     Constructor
*         Point2D(..) -> A parameterized constructor that initializes the instance variables.
*
*     Methods
*         double dist2D(Point2D p) -> Calculates and returns the 20 distance between two points (the current Point2D object and Point2D parameter p).
*         void printDistance(doubled) -> Prints the 2D distance between twO points as 2D distance = k, where k is distance das a ceiline-rounded
*
*
* 2. A derived class named Point3D that extends Point2D:
*     Instance Variable
*         Z -> Stores the value of the z coordinate.
*
*     Constructor
*         Point3D(...) -> A parameterized constructor that initializes the instance variables.
*
*     Methods
*         double dist3D(Point3D p) -> Calculates and returns the 30 distance between two points (the current Point3D object and Point3D parameter p).
*         void printDistance(double d) -> Prints the 3D distance between two points as 3D distance = &, where & is distance d as a ceiling-rounded integer, on a new line.
*
* A main method is provided in the locked portion of the editor, It parses six
* values representing point coordinates and calls the implemented constructors
* and methods. Here, ×[1], yt1], and a[1] represent the coordinates of the first
* point, and x2], y[2], and z[2] represent the coordinates of the second point,
* Note that printed output must exactly match the above for the test cases to
* pass.


* Constraints
*     -128 <= x,y,2 <= 127

* Input Format for Custom Testing
*     Input from stdin will be processed as follows and passed to the function.
*     1. x[1]: integer
*     2. y[1} integer
*     3. 2[1]:. integer
*     4. x[2): integer
*     5. y[2]. integer
*     6. 2[2]. integer
*/



class DistanceBetweenTwoPoints {

    fun main() {}
}

open class Point2D {
    private var x = 0
    private var y = 0

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun dist2D(point:Point2D):Int{
        //TODO calculate distance
        return 0
    }


}

