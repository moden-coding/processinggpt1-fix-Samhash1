import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup() {
        background(144, 238, 144); // Light green background

        // Set the border (stroke) color and thickness
        stroke(0, 0, 0); // Black border
        strokeWeight(3); // Border thickness of 3 pixels

        // Set the fill color
        fill(255, 0, 0); // Red fill for the rectangle

        // Draw the rectangle at (50, 50) with width 200 and height 100
        rect(50, 50, 200, 100);

       
        
        stroke(255, 0, 0); // Red stroke color
        strokeWeight(5);   // Stroke thickness of 5 pixels
        fill(0, 0, 255);   // Blue fill for the circle
        ellipse(400, 300, 100, 100); // Draw a circle at (400, 300) with a diameter of 100

        
        stroke(0, 255, 0); // Green stroke color
        strokeWeight(3);   // Stroke thickness of 3 pixels
        line(100, 300, 600, 300); // Draw a line from (100, 300) to (600, 300)
        fill (1,1,60);

        triangle(600, 100, 700, 200, 500, 200);

    }

    public void settings() {
        size(800, 600); // Set window size to 800x600
    }

}
