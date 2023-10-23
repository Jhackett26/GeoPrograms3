public class A7_practiceMethods extends World {

    public int r = (int)(Math.random()*255);
    public int g = (int)(Math.random()*255);
    public int b = (int)(Math.random()*255);

    public void go(){
        plane.isTrail = true;
        plane.pausetime = 0;
        background();
        plane.teleport(200,400);
        plane.setColor(r,g,b);
        J();
        plane.teleport(450,400);
        plane.startingAngle(90);
        C();
        plane.teleport(650,400);
        H();
    }

    public void background(){
        plane.setColor(255,255,255);
        plane.teleport(0,0);
        plane.trailWidth = 1000;
        plane.move(0);
        plane.trailWidth = 5;
    }

    public void J(){
        plane.circle(50);
        plane.startingAngle(240);
        plane.isTrail = false;
        plane.move(115);
        plane.startingAngle(0);
        plane.setColor(255,255,255);
        plane.isTrail=true;
        plane.trailWidth = 100;
        plane.move(192);
        plane.setColor(r,g,b);
        plane.trailWidth = 5;
        plane.startingAngle(90);
        plane.move(115);
        plane.startingAngle(270);
        plane.move(230);
    }
    public void C(){
        plane.setColor(r,g,b);
        plane.circle(50);
        plane.startingAngle(270);
        plane.isTrail = false;
        plane.teleport(425,380);
        plane.move(60);
        plane.startingAngle(0);
        plane.setColor(255,255,255);
        plane.trailWidth = 300;
        plane.move(110);
        plane.isTrail=true;
        plane.move(0);
        plane.setColor(r,g,b);
        plane.trailWidth = 5;

    }
    public void H(){
        plane.startingAngle(90);
        plane.move(75);
        plane.teleport(650,400);
        plane.turn(180);
        plane.move(75);
        plane.teleport(650,400);
        plane.startingAngle(0);
        plane.move(70);
        plane.startingAngle(270);
        plane.move(75);
        plane.startingAngle(90);
        plane.move(150);

    }
}