/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_10;

/**
 *
 * @author Biah
 */
public class Week_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int numb[][] = new int[3][5];// This is just a list of things like a array
      numb[0][0] = 1;
      numb[0][1] = 3;
      numb[0][2] = -2;
      numb[0][3] = 1;
      numb[0][4] = 3;
      numb[1][1] = 0;
      numb[1][2] = 1;
      numb[1][3] = 2;
      numb[1][4] = 0;
      numb[2][0] = 4;
      numb[2][1] = -1;
      numb[2][2] = 1;
      numb[2][3] = 4;
      numb[2][4] = -1;

    int ans = 0;// I couldn't just leave the variable as just a int so I just made it equal to zero
    System.out.println ("This is Positive: ");
    for (int p = 0; p < numb.length; p++) {
	int ans1 = 1;
	for (int i = 0; i < numb.length; i++) {
	    int r = numb[i][i + p];// I start coding at the end. It's much easier that way
	    System.out.print (ans1 + "*" + r + "=");
	    ans1 = numb[i][i + p] * ans1;
	    System.out.print (ans1 + " ");
	}
	System.out.print (" " + ans + "+" + ans1 + "=");
	ans = ans + ans1;
	System.out.println (ans);//This adds it to the total I have stored as ans
      }
    System.out.println ("This is Negative: ");
    for (int p = 0; p < numb.length; p++)
      {
	int ans1 = 1;     //ans1 can't be zero because it's multiplying different variables together with itself
	for (int i = 0; i < numb.length; i++)
	  {
	    int r = numb[2 - i][i + p];
	    System.out.print (ans1 + "*" + r + "=");
	    ans1 = numb[2 - i][i + p] * ans1;
	    System.out.print (ans1 + " ");
	  }
	System.out.print (" " + ans + "-" + ans1 + "=");
	ans = ans - ans1;/////Subtract because decriments work like that
	System.out.println (ans);
      }
  }
}
/* this is my list of variables I have on my desk arranged just as so
1 3 -2 1 3
2 0 1 2 0
4 -1 1 4 -1
*/
