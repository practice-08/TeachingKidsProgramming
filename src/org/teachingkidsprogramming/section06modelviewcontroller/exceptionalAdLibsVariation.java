package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class exceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String bodyPart = askBodyPart();
    String edverb = askEdverb();
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
  }
  private static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("Enter an adverb");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("C'mon play the game right.Type in one adverb:");
      askEdverb();
    }
    if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs , try again");
      askEdverb();
    }
    if (edverb.matches(" "))
    {
      MessageBox.showMessage("A blank space, really?");
      askEdverb();
    }
    return "wow";
  }
  private static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Please just enter a body part:");
      askBodyPart();
    }
    return "Thing";
  }
}// end of the class
