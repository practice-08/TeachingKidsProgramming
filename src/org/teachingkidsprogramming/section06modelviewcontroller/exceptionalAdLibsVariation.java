package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class exceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
  }
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("C'mon play the game right.Type in one adverb:");
      askAdverb();
    }
    if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs , try again");
      askAdverb();
    }
    if (adverb.matches(" "))
    {
      MessageBox.showMessage("A blank space, really?");
      askAdverb();
    }
    return "stuff";
  }// end of the method
}// end of the class