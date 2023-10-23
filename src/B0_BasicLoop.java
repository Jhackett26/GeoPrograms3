public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime=0;
        plane.isTrail=true;
        practiceLoops();
    }
    public void rowOfSquares() {
        for (int x = 0; x <= 2000; x += 4){
            System.out.println(x);
            plane.teleport(x, 200);
            plane.square(100);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));

        }
    }

     public void practiceLoops() {
         for (int x = 100; x >= -100; x-= 25) {
             System.out.println(x);
         }
     }
}
