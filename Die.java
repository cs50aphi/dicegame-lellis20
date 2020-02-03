public class Die
{
  int sides; // number of sides on the die. Change this number for a different die.
  int lastroll = 0;
  int min;
  int max;

  // methods
  public int roll()
  {
    int x = (int)((Math.random()*6)+1);
    lastroll = x;
    min = 1;
    max = 6;
    return x;
  }
  public int roll(int sides)
  {
    int x = (int)((Math.random()*sides)+1);
    min = 1;
    min = sides;
    lastroll = x;
    return x;
  }
  public int roll(int sides, int minimum)
  {
      int x = (int)((Math.random()*sides) + minimum);
      min = minimum;
      max = sides;
      lastroll = x;
      return x;
  }

}