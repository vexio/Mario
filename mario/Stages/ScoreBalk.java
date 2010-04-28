/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario.Stages;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import mario.MarioWorld;
import mario.core.Collision;
import mario.core.StageObject;
import mario.core.interfaces.Static;

/**
 *
 * @author Mike
 */
public class ScoreBalk extends StageObject implements Static
{
    private int score;
    private int newScore;
    private int killedEnemy;
//    private String scoreString;
    private int lives = 3;
    private int coins;

    public ScoreBalk(Stage game, MarioWorld marioWorld ,int x, int y, int width, int height)
    {
        super(game, x, y, width, height, "/images/nsmbtileset.png");
        frames.put("muntje", new Rectangle(457, 167, 45, 48));
        frames.put("coin", new Rectangle(1278, 2328, 48, 48));
        setAnimation(new String[]{"coin"});
    }

    @Override
    public void doLoopAction()
    {
        //Controleerd telkens op nieuwe Score.
        addScore();
//        scoreString = Integer.toString(score);
    }

    @Override
    public void draw(Graphics graphics)
    {
        Font font = new Font("Arial", Font.PLAIN, 20);
        graphics.setFont(font);

        graphics.setColor(Color.WHITE);
        graphics.drawString("Score: " + newScore, 10, 30);
        setAnimation(new String[]{"muntje"});
//        graphics.drawImage(getImage(), 50, 5, null);
        graphics.drawString("Coins: " + coins, 110, 30);
        //setAnimation(new String[]{"leven"});
//        graphics.drawImage(getImage(), 20, 5, null);
        graphics.drawString("Lives: " + lives, 210, 30);
        graphics.drawString("Killed enemy's: " + killedEnemy, 310, 30);

    }

    //Zit in de doLoop zodat altijd de juiste Score aangegeven wordt.
    public void addScore()
    {
        newScore = getScore() + (getCoins() * 100) + (killedEnemy * 20);
    }

    public void addScore(int punten)
    {
        score += punten;
    }

    public int getCoins()
    {
        return coins;
    }

    public void setCoins(int coins)
    {
        this.coins = coins;
    }

    public int getLives()
    {
        return lives;
    }

    public void setLives(int lives)
    {
        this.lives = lives;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public void addCoin()
    {
        coins++;
    }

    public void killEnemy()
    {
        killedEnemy++;
    }

    @Override
    public void doCharacterCollision(ArrayList<Collision> collisions, StageObject mapObject)
    {
    }

    public int getKilledEnemys()
    {
        return killedEnemy;
    }

    public void setKilledEnemys(int killedEnemy)
    {
        this.killedEnemy = killedEnemy;
    }
}
