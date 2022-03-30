import processing.core.PApplet;
/** 
* A program that uses loops to draw different images in four quadrants. In quadrant 1, there is a 10 by 10 grid. In quadrant 2, there are 25 evenly spaced dots. In quadrant 3, there is a gradient. In quadrant 4, there is a flower.
* author: Ethan Rodrigues
*/ 
public class Sketch extends PApplet {
  
  public void settings() {
    size(400, 400);
  }

  
  public void setup() {
    background(255, 255, 255);
  }
   
  
  public void draw() {
    
    // quadrant 1 - Grid
    for (int lineX = 0; lineX < (width / 2); lineX += (width / 20)) {
     line(lineX, 0, lineX, (height / 2));
    }

    for (int lineY = 0; lineY <= (height / 2); lineY += (height / 20)) {
     line(0, lineY, (height / 2), lineY);
    }

    // quadrant 2 - Dots
    fill (221, 173, 240);
    for (int circleX = ((width / 2) + width / 20); circleX <= width; circleX += (width / 10)){
     ellipse(circleX, height / 20, width / 20 ,width / 20);
    }

    for (int circleX = ((width / 2) + width/ 20); circleX <= width; circleX += (width / 10)){
     ellipse(circleX, ((height / 20) + height / 10), width/20 ,width / 20);
    }
    
    for (int circleX = ((width / 2) + width / 20); circleX <= width; circleX += (width / 10)){
     ellipse(circleX, ((height / 20) + ((height / 10)*2)), width / 20 ,width / 20);
    }

    for (int circleX = ((width /2) + width/20); circleX <= width; circleX += (width / 10)){
     ellipse(circleX, ((height / 20) + ((height / 10)*3)), width / 20 ,width / 20);
    }

    for (int circleX = ((width / 2) + width / 20); circleX <= width; circleX += (width / 10)){
     ellipse(circleX, ((height / 20) + ((height / 10)*4)), width / 20 ,width / 20);
    }

    // quadrant 3 - Gradient
    for (int gradient = 0; gradient < (width / 2); gradient++){
     stroke(gradient, gradient, gradient);
     line(gradient, height / 2 ,gradient, height);
    }
    stroke(0);
    
    // quadrant 4 - Flower
    fill (240, 175, 122);
    translate((float)(width*0.75),(float)(height*0.75));
    for (int petal = 0; petal <8; petal++){
     rotate(PI / 4);
     ellipse(width / 16,height / 80, width / 5, height / 20);
    }
    fill(147, 237, 142);
    ellipse(0, 0, width / 10, height / 10);
    
  }
  
}