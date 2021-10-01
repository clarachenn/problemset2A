class Calculator {
    //quadratic formula variables:
    double a = 1; //value for the coefficient of x^2
    double b = 5; //value for the coefficient of x
    double c = 6; // value for the constant

    //slope and midpoint formula variables:
    double x1 = 0; //first x value
    double x2 = 2; //second x value
    double y1 = 0; //first y value
    double y2 = 3; //second y value

    //arithmetic series formula variables:
    double a1 = 1.0; //first term of the series
    double k = 5; //number of terms in the series
    double difference = 1; //the difference between each number
    double ak = a1 + (k - 1) * difference; //last term of the series

    //geometric series formula variables:
    double g1 = 3.0; //first term of the series
    double kTerms = 3; //number of terms in the series
    double rate = 2.0; //rate of increase between terms

    public Calculator() {
    }

    public void display() { //what is executed when display is called
        quadraticFormula1(a, b, c); //calls the quadratic formula for the subtraction discriminant 
        quadraticFormula2(a, b, c); //calls the quadratic formula for the addition discriminant 
        System.out.println("QUADRATIC FORMULA"); //prints "QUADRATIC FORMULA"
        System.out.println("The Solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + quadraticFormula1(a, b, c)  + " and " + quadraticFormula2(a, b, c) + "."); //prints the solutions for the quadratic formula question
        System.out.println(); //skips a line

        slopeFormula(x1, x2, y1, y2); //calls the slope formula 
        System.out.println("SLOPE FORMULA"); //prints "SLOPE FORMULA"
        System.out.println("A line connecting the points (" + (int)x1 + ", " + (int)y1 + ") " + "and (" + (int)x2 + ", " + (int)y2 + ") has a slope of " +  slopeFormula(x1, x2, y1, y2)) ; //prints the answer for the slope question
        System.out.println(); //skips a line

        midpointFormulaX(x1, x2); //calls the midpoint formula for the x midpoint
        midpointFormulaY(y1, y2); //calls the midpoint formula for the y midpoint
        System.out.println("MIDPOINT FORMULA"); //prints "MIDPOINT FORMULA"
        System.out.println("The midpoint between (" + (int)x1 + ", " + (int)y1 + ") " + "and (" + (int)x2 + ", " + (int)y2 + ") is (" + midpointFormulaX(x1, x2) + ", " + midpointFormulaY(y1, y2) + ")"); //prints the answer for the midpoint question
        System.out.println(); //skips a line

        arithmeticSeries(a1, k, difference, ak); //calls the arithmetic series formula 
        System.out.println("SUM OF AN ARITHMETIC SERIES"); //prints "SUM OF AN ARITHMETIC SERIES"
        System.out.println("The sum of the first " + (int)k + " terms of an arithmetic series that starts with " + a1); //prints the answer to the arithmetic series question
        System.out.println("and increases by " + difference + " is " + arithmeticSeries(a1, k, difference, ak));
        System.out.println(); //skips a line

        geometricSeries(g1, kTerms, rate); //calls the geometric series formula 
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES"); //prints "SUM OF A FINITE GEOMETRIC SERIES"
        System.out.println("The sum of the first " + (int)kTerms + " terms of a finite geometric series that starts with " + g1); //prints the answer to the geometric series question
        System.out.println("and increases by a rate of " + rate + " is " + geometricSeries(g1, kTerms, rate));
    }

    public double quadraticFormula1(double a, double b, double c) { //what is executed when the quadratic formula for the subtraction discriminant is called
        double firstX = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/2*a; //finds the subtraction discriminant
        return firstX; //returns the answer for the subtraction discriminant
    }

    public double quadraticFormula2(double a, double b, double c) { //what is executed when the quadratic formula for the addition discriminant is called
        double secondX = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/2*a; //finds the addition discriminant
        return secondX; //returns the answer for the addition discriminant 
    }

    public double slopeFormula(double x1, double x2, double y1, double y2) { //what is executed when the slope formula is called
        double m = (y2 - y1)/(x2 - x1); //finds the slope for the x and y values
        return m; //returns the answer for the slope for the x and y values
    }

    public double midpointFormulaX(double x1, double x2) { //what is executed when the midpoint formula for the x midpoint is called
        double M1 = (x1 + x2)/2; //finds the x midpoint
        return M1; //returns the answer for the x midpoint
    }

    public double midpointFormulaY(double y1, double y2) { //what is executed when the midpoint formula for the y midpoint is called
        double M2 = (y1 + y2)/2; //finds the y midpoint
        return M2; //returns the answer for the y midpoint
    }

    public double arithmeticSeries(double a1, double k, double difference, double ak) { //what is executed when the arithmetic series formula is called
        double sum = k/2 * (a1 + ak); //finds the sum of the arithmetic series
        return sum; //returns the answer for the sum of the arithmetic series
    }

    public double geometricSeries(double g1, double kTerms, double rate) { //what is executed when the geometric series formula is called
        double geoSum = g1 * ((1 - Math.pow(rate, kTerms)) / (1 - rate)); //finds the sum of the geometric series
        return geoSum; //returns the answer for the sum of the geometric series
    }
}

