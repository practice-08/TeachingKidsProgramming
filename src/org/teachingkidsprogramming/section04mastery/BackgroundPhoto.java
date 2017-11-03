package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class BackgroundPhoto
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    //  Set the current picture to this url "https://usatftw.files.wordpress.com/2017/05/spongebob.jpg?w=1000&h=600&crop=1" --#1.0
    Tortoise.getBackgroundWindow()
        .setBackgroundImage("https://usatftw.files.wordpress.com/2017/05/spongebob.jpg?w=1000&h=600&crop=1");
    Tortoise.show();
    Tortoise.setSpeed(10);
    int side = 2;
    for (int i = 0; i < 75; i++)
    {
      Tortoise.setPenColor(PenColors.Yellows.Yellow);
      side++;
      Tortoise.move(side);
      Tortoise.setX(555);
      Tortoise.setY(65);
      Tortoise.turn(360 / 3);
      Tortoise.turn(1);
    }
  }
}
