 PImage face;
int Pr1 = 370;
int Pr2 = 127;
int Pl1 = 257;
int Pl2 = 117;
void setup() {
  size(500,920);
   face = loadImage("face.jpg");
  face.resize(500,920);
  
}

void draw() {
  background(face);
  if (mousePressed == true) {
  println(mouseX + " " + mouseY);
}
fill(#FFFFFF);
ellipse(257,117,75,75);
ellipse(370,127,75,75);
if (mouseX <= 395 && mouseX >= 346 && mouseY <= 152 && mouseY >= 103) {
Pr1 = mouseX;
Pr2 = mouseY;
Pl1 = mouseX - 127;
Pl2 = mouseY - 10;
}
fill(#000000);
ellipse(Pr1,Pr2,25,25);
ellipse(Pl1,Pl2,25,25);
}
