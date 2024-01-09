package object;

public class GuessGame {

      Player player1;
      Player player2;
      Player player3;

      public void startGame() {
            player1 = new Player();
            player2 = new Player();
            player3 = new Player();

            int guessp1 = 0;
            int guessp2 = 0;
            int guessp3 = 0;

            boolean p1isRight = false;
            boolean p2isRight = false;
            boolean p3isRight = false;

            int targetNumber = (int) (Math.random() * 10);
            System.out.println("I'm thinking of a number between 0 and 9...");

            while(true) {
                  player1.guess();
                  player2.guess();
                  player3.guess();

                  guessp1 = player1.number;
                  System.out.println("Player one guessed: " + guessp1);

                  guessp2 = player2.number;
                  System.out.println("Player two guessed: " + guessp2);

                  guessp3 = player3.number;
                  System.out.println("Player three guessed: " + guessp3);

                  if(guessp1 == targetNumber) {
                        p1isRight = true;
                  }
                  if(guessp2 == targetNumber) {
                        p2isRight = true;
                  }
                  if(guessp3 == targetNumber) {
                        p3isRight = true;
                  }

                  if(p1isRight || p2isRight || p3isRight) {
                        System.out.println("We have a winner!");
                        System.out.println("Player one got it right? " + p1isRight);
                        System.out.println("Player two got it right? " + p2isRight);
                        System.out.println("Player three got it right? " + p3isRight);
                        System.out.println("Game over");
                        break;
                  } else {
                        System.out.println("Players will have to try again");
                  }
            }
      }


}
