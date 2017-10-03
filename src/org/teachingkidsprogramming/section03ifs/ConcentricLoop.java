package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //  Set the tortoise x position to 150 --#4.1
    Tortoise.setX(150);
    //  Set the tortoise y position to 200 --#4.2
    Tortoise.setY(200);
    //  Set the tortoise speed to 10  --#4.3
    Tortoise.setSpeed(10);
    //  Do the following 360 times --#3.1
    for (int i = 1; i == 360; i++)
    {
      //      Move the tortoise 3 pixels --#1
      Tortoise.move(3);
      //      Turn the tortoise 1 degree --#2
      Tortoise.turn(1);
      //      If i is divisible by 20 --(HINT: Use mod operator '%') --#7
      //          Do the following 360 times --#8.1
      //              Move the tortoise 1 pixel  --#5  
      //              Turn the tortoise 1 degree --#6    
      //              Change the width of the line that the tortoise draws to 1/100th of the current line --#9  
      //          End Repeat --#8.2
      //   End Repeat --#3.2
    }
  }
}