import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 600);
        
    }

    public void setup() {
        background(46, 121, 242);
        frameRate(10);
        
    }
    
    public void draw() {
    //drawStar();
    draw50Stars();
    drawCulturalElements();


    System.out.println(mouseX + " " + mouseY); //for x & y 
    }

    // some methods you may want to include:


    public void draw50Stars() {
      noStroke();
      fill(255);
      for(int row = 1; row<=4; row++){
        for(int col = 1; col<= 10; col++){
            drawStar(0 + col * 50, 5 + row * 40, 10);
        }
      }//end of for loop
      drawStar(25, 382, 10);
      drawStar(52, 397, 10);
      drawStar(99, 426, 10);
      drawStar(124, 439, 10);
      drawStar(172, 439, 10);
      drawStar(181, 447, 10);
      drawStar(257, 462, 10);
      drawStar(271, 472, 10);
      drawStar(305, 462, 10);
      drawStar(352, 435, 10);


    }//draw50Star

    public void drawCulturalElements() {

 //rocket
    //clouds for racket
    fill(250, 250, 200);
    ellipse(197, 272, 200, 200);
    ellipse(344, 574, 100, 100);
    ellipse(197, 572, 200, 200);
    ellipse(0, 566, 300, 300);

    //moon
    fill(226, 214, 211);
    circle(217,287, 30);
    fill(250, 250, 250);
    ellipse(531, 577, 400, 400);



    //body
        fill(0);
        rect(0, 200, 600, 10);
        fill(0);
        rect(0, 400, 600, 10);
        fill(200, 200,20);
    //fire gase
        fill(random(255), random(255), random(255));
        triangle(440, 530, 495, 435, 540, 530);
        fill(0);
        triangle(455, 530, 486, 563, 515, 530);
        rect(440, 280, 100, 210);
        fill(250);
        triangle(440, 280, 495, 175, 540, 280);
        fill(200, 200, 200);
        triangle(407, 368, 414, 380, 421, 368);
        triangle(566, 368, 573, 380, 580, 368);

    //mini windows
        fill(random(255), random(255), random(255));
        circle(490, 248, 50);
        fill(250);
        circle(516, 316, 20);
        circle(516, 358, 20);
    //fire arms
        rect(563, 317, 20, 50);
        rect(403, 319, 20, 50);
        rect(424, 326, 20, 10);
        rect(542, 326, 20, 10);     

    }

    public void drawStar(int x, int y, int size) {
        pushMatrix();
        translate(x, y);
                
        for (int i = 0; i < 5; i++) {
            fill(random(255), random(255), random(255));
            rotate(radians(72));
            triangle(0, -size, (float)(-size * 0.25), (float)(-size * 0.25), (float)(size * 0.25), (float)(-size * 0.25));
        }

        ellipse(0, 0, (float)(size * 0.6), (float)(size * 0.6));
        popMatrix();
    }
   // ellipse(0, 0, (float)(size * o.6), (float)(size * 0.6));
}
