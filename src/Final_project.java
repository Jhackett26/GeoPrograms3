public class Final_project extends World{
    public int red;
    public int green;
    public int blue;
    public int random1;

    public void go() {
        plane.loadBackGround("IMG_1459.JPG");
        plane.showBackGround();
        random1 = plane.random(0,150);
        for (int row = 0; row <= 500; row++)    //*** this is using new getBackground
        {
            for (int col = 0; col <= 488; col++)    //*** this is using new getBackground
            {
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(row,col);

                plane.setPixelColor(random1, green, blue);

            }
        }
        crown();
        blush(375,410);
        blush(210,350);

        }
    public void crown() {
        plane.pausetime = 0;
        plane.teleport(230,150);
        plane.startingAngle(0);
        plane.setColor(255,200,0);
        plane.isTrail = true;
        plane.trailWidth = 15;
        plane.move(260);
        plane.startingAngle(270);
        plane.move(125);
        for (int x = 1;x <= 4; x++) {
            plane.startingAngle(135);
            plane.move(45);
            plane.startingAngle(225);
            plane.move(45);
        }
        plane.startingAngle(90);
        plane.move(125);
    }
    public void blush(int xCoor, int yCoor){
        plane.teleport(xCoor,yCoor);
        plane.setColor(255,0,0);
        plane.trailWidth = 20;
        for(int x=0; x <= 45; x++) {
            plane.move(1);
            plane.turn(8);
        }
    }
    }


