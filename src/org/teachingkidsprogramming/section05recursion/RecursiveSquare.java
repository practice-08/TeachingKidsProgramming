package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class RecursiveSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkGreen);
    Tortoise.setPenColor(PenColors.Yellows.Gold);
    //
    //  Set the speed to the fastest --#8
    Tortoise.setSpeed(10);
    //  Update the length to 100.0 --#1.1
    double length = 100.0;
    //  MakeASquare with the current length(recipe below) --#11.4
    //
    makeASquare(length);
  }
  private static void makeASquare(double length)
  {
    //  Create the makeASquare recipe --#11.1
    //  If the current length is greater than 10 --#10.2
    if (length > 10)
    {
      //      Run the recipe moveToTheSquareStart with the current length  --#4.3
      //
      moveToTheSquareStart(length);
      //
      //  Do the following 4 times --#7.1
      for (int i = 0; i < 4; i++)
      {
        //    Move the Tortoise the current length --#6.2
        Tortoise.move(length);
        //    MakeASquare with the current length divided by 1.7 (recipe below)--#11.3 
        makeASquare(length / 1.7);
        //      If the current process count is less than 3 (HINT: use 'i') --#9
        if (i < 3)
        {
          Tortoise.turn(90);
        }
      }
      //          Turn the tortoise 90 degrees to the right --#6.1
      //  End Repeat --#7.2
      //
      //  MoveBackToCenter with the current length (recipe below)--#5.3
      moveBackToCenter(length);
      //
      //  Set the current length to the current length times two --#10.1
      length = length * 2;
      //
      //  End of makeASquare recipe --#11.2
    }
  }
  private static void moveBackToCenter(double length)
  {
    Tortoise.setPenUp();
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
    //
    //
  }
  private static void moveToTheSquareStart(double length)
  {
    Tortoise.setPenUp();
    Tortoise.move(length / 2);
    Tortoise.turn(-90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
  }
}
