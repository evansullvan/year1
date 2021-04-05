int thick;


void setup(){
  size (500,500);
  background(255);
  println(" type '1' to use line");
  println(" type 'r' to use rectangle");
  println(" type 'o' to use oval");
  println(" type 't' to use triangle");
  println("scroll wheel to change thickness");
  println(" left click is gray");
  println(" right click is green");
  //this will print at start as the rules
}

void draw(){
  
   keyPressed(); { 
     
  if (key == 'r') {
rect(mouseX,mouseY,40,40);
println("shape set to rectangle");
//if 2 is clicked set the brush to a 40x40 rectangle
  } 
  
  if (key == 'o') { 
   ellipse(mouseX,mouseY,30%width,40%height);
   println("shape set to oval");
   //if 3 is clicked set the brush to a 30x40 oval
  }
  if(key == 't'){
    triangle(mouseX,mouseY,mouseX+12,mouseY-25,mouseX+25,mouseY);
    println("shape set to triangle");
  }
  //creates triangle following the cursor, each point has numbers added to hold the shape
  
  
  if(mouseButton == LEFT){
    println("colour set to grey ");
   stroke(135);
   strokeWeight(thick);
   //if left button is clicked set color to gray and thickness to 3
  
}
  else if(mousePressed &&(mouseButton == RIGHT)){
    println("color set to green");
    stroke(0, 255, 38);
    strokeWeight(thick);
   
     //if left button is clicked set color to green and thickness to 3
}
  else{
  strokeWeight(thick);
  stroke(255);
  //if nothing is pressed set color to white(same as the background) and thickness to 50 
}

 
  

 
     line(mouseX,mouseY,pmouseX,pmouseY);
     //pressing 1 will revert all brush types back to line
    
  }
 
    
  
}
 void mouseWheel(MouseEvent event){
    thick = thick +1;
println("width of brush is: " + thick + " pixels");
if(thick == 50){
  thick = thick -50;
 
}

    
 }
