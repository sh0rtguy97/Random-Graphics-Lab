// Lab06Bst.java
// This is the student, starting version of Lab06B which is divided into 8 cells.
// The first cell -- "Draw Random Points" -- is provided as an example.
// Students need to complete the other 7 cells on their own.


import java.awt.*;
import java.applet.*;


public class Lab06Bst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        // Draw 10,000 Random Points
        for (int count = 1; count <= 10000; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(5,245);
            int y = Expo.random(5,320);
            Expo.drawPoint(g,x,y);
        }


        // Draw 1000 Random Lines
        for (int line = 1; line <= 1000; line++)
        {
            Expo.setRandomColor(g);
            int x1 = Expo.random(255,495);
            int x2 = Expo.random(255,495);
            int y1 = Expo.random(5,320);
            int y2 = Expo.random(5,320);
            Expo.drawLine(g,x1,y1,x2,y2);
        }
        // Draw 1000 Random Rectangles
        for (int rect = 1; rect <= 1000; rect++)
        {
            Expo.setRandomColor(g);
            int x1 = Expo.random(505,745);
            int y1 = Expo.random(5,320);
            int x2 = Expo.random(505,745);
            int y2 = Expo.random(5,320);
            Expo.fillRectangle(g,x1,y1,x2,y2);
        }
        // Draw 500 Random Triangles
        for (int tri = 1; tri <= 500; tri++)
        {
            Expo.setRandomColor(g);
            int x1 = Expo.random(755,995);
            int y1 = Expo.random(5,320);
            int x2 = Expo.random(755,995);
            int y2 = Expo.random(5,320);
            int x3 = Expo.random(755,995);
            int y3 = Expo.random(5,320);
            int radius = Expo.random(1,25);
            int sides = 3;
            Expo.setRandomColor(g);
            Expo.fillPolygon(g,x1,y1,x2,y2,x3,y3);
        }

        // Draw 100 Random Initials
        for (int in = 1; in <= 100; in++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(5,155);
            int y = Expo.random(370,645);
            int s = Expo.random(1,64);
            Expo.setFont(g,"Arial",Font.PLAIN,s);
            Expo.drawString(g,"RM",x,y);
        }
            
        // Draw 500 Random Stars with a constant radius of 30 and a random # of points
        for (int star = 1; star <= 500; star++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(280,470);
            int y = Expo.random(355,620);
            int p = Expo.random(1,25);
            Expo.fillStar(g,x,y,30,p);
        }

        // Draw 1000 Random Circles with random radii
        for (int cir = 1; cir <= 1000; cir++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(555,695);
            int y = Expo.random(380,595);
            int r = Expo.random(1,50);
            Expo.fillCircle(g,x,y,r);
        }





        // Draw 250 Random Arcs with 2 random radii, random start and random finish






    }

}




