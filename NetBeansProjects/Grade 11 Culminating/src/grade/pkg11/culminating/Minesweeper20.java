/*
 * Created by Calvin McPhail
 * On January 25th
 * To Simulate a Minesweeper game without flags
 */
package grade.pkg11.culminating;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Minesweeper20 implements ActionListener {

    ArrayList<Integer> mineList = new ArrayList();

    JFrame frame = new JFrame("Minesweeper");//Initializes the frame
    JButton reset = new JButton("Reset");//Initializes the reset button
    JButton[][] buttons = new JButton[20][20];//Creates a two dimensional array for the buttons
    int[][] counts = new int[20][20];//Creates a two dimensional array for later uses
    Container grid = new Container();
    final int MINE = 10;// Creates a constant integer for the mines

    public Minesweeper20() {
        JOptionPane.showMessageDialog(frame,"How to Play Minesweeper: Click on any square if it's a mine press reset and try again. However If it's a number that represents how many mines that square is touching in the eight directions around it. If you clear all the non mine squares you win.");
        frame.setSize(900, 700);//Sets frame size
        frame.setLayout(new BorderLayout());//Sets border for the frame
        frame.add(reset, BorderLayout.NORTH);//Adds reset button to the top of the frame
        reset.addActionListener(this);
        //Button grid
        grid.setLayout(new GridLayout(20, 20));//Makes a 20x20 grid for the buttons
        for (int a = 0; a < buttons.length; a++) {//Creates all the buttons
            for (int b = 0; b < buttons[0].length; b++) {
                buttons[a][b] = new JButton();
                buttons[a][b].addActionListener(this);
                grid.add(buttons[a][b]);//Adds the button when created
            }
        }
        frame.add(grid, BorderLayout.CENTER);//Adding the grid to the center
        createRandomMines();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Stops the program from running after closing the window
        frame.setVisible(true);//Making the frame visible
    }

    public static void main(String[] args) {
        new Minesweeper20(); //Runs the game
    }

    public void createRandomMines() {
        for (int x = 0; x < counts.length; x++) {
            for (int y = 0; y < counts[0].length; y++) {//Going through all values of the squares using the 1000s and 100s for x values and 10s and 1s for y values
                mineList.add(x * 100 + y);//Adding the values to a list to select mines later
            }
        }
        //Reset counts and picks out 30 mines
        counts = new int[20][20];
        for (int a = 0; a < 50 ; a++) {//Picking out mines from the list adding them to the grid and removing them from the list to avert repeat mines
            int choice = (int) (Math.random() * mineList.size());
            counts[mineList.get(choice) / 100][mineList.get(choice) % 100] = MINE;
            mineList.remove(choice);
        }
        //Initializes Mine count
        int mineCount = 0;
        for (int x = 0; x < counts.length; x++) {
            mineCount = 0;//Resets mine counts to prevent numbers from becoming huge
            for (int y = 0; y < counts[0].length; y++) {
                mineCount = 0;//Resets mine counts to prevent numbers from becoming huge
                if (counts[x][y] != MINE) {//If the square you click isn't a mine then go throught the mine count process to decide it's number
                    if (x > 0 && y > 0 && counts[x - 1][y - 1] == MINE) {//Checks bottom left for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }
                    if (y > 0 && counts[x][y - 1] == MINE) {//Checks down for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }
                    if (x < counts.length - 1 && y > 0 && counts[x + 1][y - 1] == MINE) {//Checks bottom right for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }
                    if (x < counts.length - 1 && counts[x + 1][y] == MINE) {//Checks right for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }
                    if (x < counts.length - 1 && y < counts[0].length - 1 && counts[x + 1][y + 1] == MINE) {//Checks top right for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }
                    if (y < counts[0].length - 1 && counts[x][y + 1] == MINE) {//Checks up for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }
                    if (x > 0 && y < counts[0].length - 1 && counts[x - 1][y + 1] == MINE) {//Checks top left for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }
                    if (x > 0 && counts[x - 1][y] == MINE) {//Checks  left for Mine from click
                        mineCount++;//Adding to minecount for the number the square will have
                    }

                    counts[x][y] = mineCount;//Setting the count of that square to the number of mines around it, to show the user the amount of mines near that square

                }

            }

        }
    }

    public void gameLost() {
        for (int x = 0; x < buttons.length; x++) {
            for (int y = 0; y < buttons[0].length; y++) {
                if (buttons[x][y].isEnabled()) {
                    if (counts[x][y] != MINE) {//If the square you click isn't a bomb then set the number
                        buttons[x][y].setText(counts[x][y] + "");//Setting the text of the button to the number of mines around it 
                        buttons[x][y].setEnabled(false);//Making sure the user can't reclick a square they've already clicked
                    } else {
                        buttons[x][y].setText("X");//If you hit a bomb the text of the button goes to an X and you lose
                        buttons[x][y].setEnabled(false);//Making sure the user can't reclick a square they've already clicked

                    }
                }
            }
        }
    }

    public void clearZeros(ArrayList<Integer> toClear) {
        if (toClear.size() == 0) {

        } else {
            int x = toClear.get(0) / 100;
            int y = toClear.get(0) % 100;
            toClear.remove(0);
            if (counts[x][y] == 0) {
                if (x > 0 && y > 0 && buttons[x - 1][y - 1].isEnabled() == true) {//Checks bottom left for Zero from click
                    buttons[x - 1][y - 1].setText(counts[x - 1][y - 1] + "");
                    buttons[x - 1][y - 1].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x - 1][y - 1] == 0) {
                        toClear.add((x - 1) * 100 + (y - 1));//Adding the zero to the list to be cleared
                    }
                }
                if (y > 0 && buttons[x][y - 1].isEnabled() == true) {//Checks down for Zero from click
                    buttons[x][y - 1].setText(counts[x][y - 1] + "");
                    buttons[x][y - 1].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x][y - 1] == 0) {
                        toClear.add(x * 100 + (y - 1));//Adding the zero to the list to be cleared
                    }
                }

                if (x < counts.length - 1 && y > 0 && buttons[x + 1][y - 1].isEnabled() == true) {//Checks bottom right for Zero from click
                    buttons[x + 1][y - 1].setText(counts[x + 1][y - 1] + "");
                    buttons[x + 1][y - 1].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x + 1][y - 1] == 0) {
                        toClear.add((x + 1) * 100 + (y - 1));//Adding the zero to the list to be cleared
                    }
                }
                if (x < counts.length - 1 && buttons[x + 1][y].isEnabled() == true) {//Checks right for Zero from click
                    buttons[x + 1][y].setText(counts[x + 1][y] + "");
                    buttons[x + 1][y].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x + 1][y] == 0) {
                        toClear.add((x + 1) * 100 + (y));//Adding the zero to the list to be cleared

                    }
                }
                if (x < counts.length - 1 && y < counts[0].length - 1 && buttons[x + 1][y + 1].isEnabled() == true) {//Checks top right for Zero from click
                    buttons[x + 1][y + 1].setText(counts[x + 1][y + 1] + "");
                    buttons[x + 1][y + 1].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x + 1][y + 1] == 0) {
                        toClear.add((x + 1) * 100 + (y + 1));//Adding the zero to the list to be cleared
                    }
                }
                if (y < counts[0].length - 1 && buttons[x][y + 1].isEnabled() == true) {//Checks up for Zero from click
                    buttons[x][y + 1].setText(counts[x][y + 1] + "");
                    buttons[x][y + 1].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x][y + 1] == 0) {
                        toClear.add(x * 100 + (y + 1));//Adding the zero to the list to be cleared
                    }
                }
                if (x > 0 && y < counts[0].length - 1 && buttons[x - 1][y + 1].isEnabled() == true) {//Checks top left for Zero from click
                    buttons[x - 1][y + 1].setText(counts[x - 1][y + 1] + "");
                    buttons[x - 1][y + 1].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x - 1][y + 1] == 0) {
                        toClear.add((x - 1) * 100 + (y + 1));//Adding the zero to the list to be cleared
                    }
                }
                if (x > 0 && buttons[x - 1][y].isEnabled() == true) {//Checks  left for Zero from click
                    buttons[x - 1][y].setText(counts[x - 1][y] + "");
                    buttons[x - 1][y].setEnabled(false);//Making the button unclickable after the first click
                    if (counts[x - 1][y] == 0) {
                        toClear.add((x - 1) * 100 + y);//Adding the zero to the list to be cleared
                    }

                }

                clearZeros(toClear);//Clearing all zeros next to the click
            }

        }
    }

    public void checkWin() {
        boolean won = true;//The user is winning until they hit a mine
        for (int x = 0; x < counts.length; x++) {
            for (int y = 0; y < counts[0].length; y++) {
                if (counts[x][y] != MINE && buttons[x][y].isEnabled() == true) {//checking if the users click qualifies them to continue playing
                    won = false;//the user doesn't win for clearing a single button
                }
            }

        }
        if (won == true) {
            JOptionPane.showMessageDialog(frame, "You win!");//Sets up a message for winning the game
        }
    }

    @Override
    public void actionPerformed(ActionEvent Event) {
        if (Event.getSource().equals(reset)) {//If user hits reset button it resets the game
            //reset board
            for (int x = 0; x < buttons.length; x++) {
                for (int y = 0; y < buttons[0].length; y++) {
                    buttons[x][y].setEnabled(true);//Re-enables all buttons
                    buttons[x][y].setText("");//Makes sure that the value of the button isn't showing
                    createRandomMines();//Resets all the mines so user can't memorize the position
                }
            }
        } else {//User has pressed a square if they didn't press the reset button
            for (int x = 0; x < buttons.length; x++) {
                for (int y = 0; y < buttons[0].length; y++) {
                    if (Event.getSource().equals(buttons[x][y])) {
//User has pressed a button and now is calling it's action
                        if (counts[x][y] == MINE) {//Checks if the square is a mine
                            buttons[x][y].setText("X");//Sets the text to an X
                            gameLost();//Calls the method for a lost game

                        } else if (counts[x][y] == 0) {//Checking if square pressed is a 0
                            buttons[x][y].setText(counts[x][y] + "");
                            buttons[x][y].setEnabled(false);//Making the button unclickable after the first click
                            ArrayList<Integer> toClear = new ArrayList();
//Initializing the clear list for the zeros
                            toClear.add(x * 100 + y);//Adding the square you just pressed
                            clearZeros(toClear);
//Calling the clear method to check for other zeros surrounding the original
                            checkWin();//Checking to see if the user has won

                        } else {
                            buttons[x][y].setText(counts[x][y] + "");
//Setting the text to it's number based on surrounding mines
                            buttons[x][y].setEnabled(false);//Making the button unclickable after the first click
                            checkWin();//Checking to see if the user has won
                        }

                    }

                }
            }

        }

    }

}

