/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package turtle;



public class TurtleSoup {

 
    public static void drawSquare(Turtle turtle, int sideLength) {
        for (int i=0; i<=4; i++){
            turtle.turn(90);
            turtle.forward(sideLength);
        }
        
    }

  
    public static double calculateRegularPolygonAngle(int sides) {
        double angle= ((sides-2)*180)/sides;
        return angle;

    }

   
    public static int calculatePolygonSidesFromAngle(double angle) {
        double result= ( 360 / ( 180 - angle ) );
        int result2=(int)result;
        return result2;
    }

   
    public static void drawRegularPolygon(Turtle turtle, int sides, int sideLength) {
        for (int i=0; i<=6; i++){
            turtle.turn(120);
            turtle.forward(sideLength);
        }
    }

    
    public static double calculateHeadingToPoint(double currentHeading, int currentX, int currentY,
                                                 int targetX, int targetY) {
        throw new RuntimeException("implement me!");
    }
    
    public static void drawPersonalArt(Turtle turtle) {
        for (int i=0; i<=4; i++){
            turtle.color(PenColor.PINK);
            drawSquare(turtle,200);
            
    }
    }

    public static void main(String args[]) {
        DrawableTurtle turtle = new DrawableTurtle();

        drawSquare(turtle, 40);
        drawPersonalArt(turtle);
        drawRegularPolygon(turtle,6,100);
        calculateRegularPolygonAngle(6);
        calculatePolygonSidesFromAngle(65.5);
        turtle.draw();
    }

}
