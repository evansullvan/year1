import javax.swing.*;
import java.lang.Object;

int red;
int blue;
int green;

int back;

int amount;


int brushsize;

void setup() {
  size(1000, 800);
  background(255);
  //instructions
  JOptionPane.showMessageDialog(null, " '1' = line | 'r' = rectangle | 'o' = oval | 't' = triangle | 'c' = Christmas tree | 's' = Snowman", "Help", JOptionPane.PLAIN_MESSAGE);
  JOptionPane.showMessageDialog(null, "press 'h' for help");
  //set colour
  red = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a color for red between 0 and 255", "50"));
  blue = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a color for blue between 0 and 255", "50"));
  green = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a color for green between 0 and 255", "50"));
  brushsize = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a size for brush between 0 and 255", "10"));
  //set brush size

  //this will create an array with user set size
  JOptionPane.showMessageDialog(null, "Today you will also create an Array");
  amount = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a size for the array", "10"));
  //set size of array
  int[] array = new int[amount];
  int sum =0;
  int amount = 0;


  while (amount < array.length)
  {
    array [amount] = Integer.parseInt(JOptionPane.showInputDialog(null, "Select what numbers you want in your array", "10"));
    sum = sum+array[amount];
    amount ++;
    //set elements for array
  }
  println("here are your numbers  added together: "+ sum);
  
  //string methods to return the hashcode and length
   JOptionPane.showMessageDialog(null, "now you can find the hashcode and length of a word");
  String str =JOptionPane.showInputDialog(null, "what word do you want to find the hashcode and length for? ", "Hello");
  //what ever word user inputs, it is stored in str
println("the hash code is " +str.hashCode());
println("the length of "+ str +" is "+ str.length());

}

void draw() {
  //calling methods
  keyPressed();
  mouseWheel();
  mousePressed();


  if (key == 's') {
    snowman();
    //if s is clicked a snowman will apear
  }

  if (key == 'c') {
    christmastree();
    //if C is clicked a tree will appear
  }
}




void mousePressed() {

  if (mouseButton == RIGHT) {
    strokeWeight(brushsize+ 10);
    stroke(255);
    line(mouseX, mouseY, pmouseX, pmouseY);
    //if right button is clicked user can erase
  }
}



void keyPressed() {
  //if left button is clcicked check for the following
  if (mouseButton == LEFT) {

    //if left is clciked and button is r then do this
    if (mousePressed && key == 'r') {
      stroke(red, green, blue);
      strokeWeight(brushsize);
      rect(mouseX, mouseY, 40, 40);
      println("shape set to rectangle");
      //if 2 is clicked set the brush to a 40x40 rectangle
    } 

    if (key == 'o') {
      if ( mousePressed ) { 
        stroke(red, green, blue);
        strokeWeight(brushsize);
        ellipse(mouseX, mouseY, 30, 40);
        println("shape set to oval");
        //if 3 is clicked set the brush to a 30x40 oval
        //embeddded if as i dont need to have o pressed aswell as the mouse
      }
    }


    if (key == 't') {
      if (mousePressed) {
        stroke(red, green, blue);
        strokeWeight(brushsize);
        triangle(mouseX, mouseY, mouseX+12, mouseY-25, mouseX+25, mouseY);
        println("shape set to triangle");
        //embeddded if as i dont need to have o pressed aswell as the mouse
      }
    }

    if (key == 'l') {
      if (mousePressed ) {
        stroke(red, green, blue);
        strokeWeight(brushsize);
        line(mouseX, mouseY, pmouseX, pmouseY);
        println("brush set to line");
      }
    }
    //if S or C is clicked then user has to click l to get back to drawing
  } else {
  }
}



void snowman() {
  fill(255);
  stroke(0);
  strokeWeight(5);
  circle(500, 150, 100);
  circle(500, 275, 150);
  circle(500, 500, 300);

  for (int x = 240; x<=627; x=x+30) {
    fill(0);
    strokeWeight(5);
    circle(500, x, 10);
  }
}
void christmastree() {
  fill(138, 61, 0);
  rect(450, 600, 100, 100);
  fill(0, 86, 0);
  triangle(200, 600, 500, 350, 800, 600);
  triangle(220, 500, 500, 250, 780, 500);
  triangle(250, 400, 500, 150, 730, 400);
  triangle(300, 300, 500, 50, 700, 300);
  triangle(340, 200, 500, 10, 670, 200);
}
