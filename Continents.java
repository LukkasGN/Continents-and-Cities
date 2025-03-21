/* 
Author: Lucas Gabriel Nordio
Date: 17/03/25

A codeCademy project that will print out a continent and the largest city in that continent, based on the value of an integer.

CodeCademy definition:

Planet Earth is a magical place. Let’s practice the Java switch statement that you learned about.

Write a Continents.java program that will print out a continent and the largest city in that continent, based on the value of an integer.

The instructions provided are general guidelines. Upon completion of the project, feel free to add functionality of your own.

If you get stuck during this project or would like to see an experienced developer work through it, click Get Unstuck to see a project walkthrough.
*/

public class Continents {

  public static void main(String[] args) {

    int continent = 4;

    switch (continent) {
      case 1:
        System.out.println("North America: Mexico City, Mexico");
        break;
      case 2:
        System.out.println("South America: Sao Paulo, Brazil");
        break;
      case 3:
        System.out.println("Europe: Moscow, Russia");
        break;
      case 4:
        System.out.println("Africa: Lagos, Nigeria");
        break;
      case 5:
        System.out.println("Asia: Shanghai, China");
        break;
      case 6:
        System.out.println("Australia: Sydney, Australia");
        break;
      case 7:
        System.out.println("Antarctica: McMurdo Station, US");
        break;
      default:
        System.out.println("Undefined continent!");
    }

  }

}
