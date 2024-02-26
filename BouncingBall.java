
public class BouncingBall {
         public static void main(String[] args) {
                StdDraw.setXscale(-1.0, 1.0);
                StdDraw.setYscale(-1.0, 1.0);
                StdDraw.enableDoubleBuffering();
               
                double radius = 0.05;
                double x = 0.480, y = 0.860;
                double vx = 0.015, vy = 0.023;
        
        while (true)  {
        if (Math.abs(x + vx) > 1.0 - radius) vx = -vx;
        if (Math.abs(y + vy) > 1.0 - radius) vy = -vy;
                  x = x + vx;
                  y = y + vy;
        
        StdDraw.clear(StdDraw.LIGHT_GRAY); 
        StdDraw.setPenColor(StdDraw.BLACK); 
        StdDraw.filledCircle(x, y, radius);
        StdDraw.show();
        StdDraw.pause(2); 

        } 
    }
            

        
    
}