
package org.example;

import java.util.Random;
import java.util.Scanner;

//Import random and scanner
public class App {
    public void main(String[] args) {


import Random;
import Scanner;


//Import random and scanner
        public class App {
            public void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                //this prints out in terminal asking the human user to input one of three options
                System.out.println("Make the first move; Rock, Paper or Scissors!");
                // this saves the move under player1Move and continues the program
                String player1Move = scanner.nextLine();


                //creating user 1 and user 2 with user 2 input being a random variable from the 3 created.
                User user1 = new User("Ethan");
                System.out.println(user1.user_input);


                // gets the second player (the computer) to pick random number
                Random random = new Random();
                int randomNumber = random.nextInt(2);

                //creating a set of rules for
                String user2Move;
                if (randomNumber == 0) {
                    user2Move = "rock";
                } else if (randomNumber == 1) {
                    user2Move = "paper";
                } else {
                    user2Move = "scissors";
                }
                System.out.println("Player 2 chose " + user2Move);


                //doing the same for user 1
                int user1Move = player1Move.nextInt(2);

                //creating a set of rules for
                String player1Move;
                if (player1Move == 0) {
                    user1Move = "rock";
                } else if (player1Move == 1) {
                    user1Move = "paper";
                } else if (player1Move == 2)
                    user1Move = "scissors";
                }
                } else (user1Move == user2Move);
                System.out.println("You drew with the Computer!");
            }
                System.out.println("Player 1 chose " + user1Move);


                // Input rock paper and scissors as three variables and their 3 values
                int Rock = 0;
                int Paper = 1;
                int Scissors = 2;

            }


        }


    }}