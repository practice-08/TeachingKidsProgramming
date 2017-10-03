package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    //int i;
    //int answer = (int) (Math.random() * 100 + 1);
    // System.out.println("The answer is " + answer);
    // int answer = 40;
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("yOU wON!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high ");
      }
      else
      {
        MessageBox.showMessage("Too low ");
      }
      if (i == 8)
        MessageBox.showMessage("You've lost");
    }
  }
}
