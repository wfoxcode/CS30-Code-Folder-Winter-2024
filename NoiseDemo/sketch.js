// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let newBall = {
  x: random(width),
  y: random(height),
  diameter: random(25, 100),
  dx: random(-5, 5),
  dy: random(-5, 5),
};

let x, y, w;
let timex = 0;
let timey = 0;

function setup() {
  createCanvas(windowWidth, windowHeight);
  //width and height are defined by canvas
  //puts x,y in the center
  x = width/2;
  y = height/2;
  w = 40;
}

function draw() {
  background(220);

  x = noise(timex) * width;
  y = noise(timey) * height;

  fill(255,0,0);
  circle(x,y,w);

  timex+=0.03;
  timey-=0.02;
}
