public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);
        square();
        triangle();
        plane.teleport(500,300);
        hexagon();
        plane.teleport(800,500);
        plane.setColor(200,0,255);
        shape(plane.random(1,20));
    }

    public void triangle() {
        plane.isTrail = true;
        plane.startingAngle(0);
        plane.setColor(50,170,30);
        plane.move(111);
        plane.turn(120);
        plane.move(111);
        plane.turn(120);
        plane.move(111);


    }

    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        for (int x=1;x<=4;x++) {
            plane.move(111);
            plane.turn(90);
        }

    }
    public void hexagon(){
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
    }
    public void shape(int n){
        for(int a=1;a<=n;a++){
            plane.move(100);
            plane.turn(360/n);
        }
    }

}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/