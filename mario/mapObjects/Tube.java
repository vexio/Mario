/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mario.mapObjects;

import java.awt.Rectangle;
import mario.Game;
import mario.core.Collision;
import mario.core.MapObject;
/**
 *
 * @author Onno
 */
public class Tube extends MapObject{

    public Tube(Game game, int x, int y, int width, int height)
    {
        super(game, x, y, width, height, "/images/scenery.png");
        frames.put("tube 0", new Rectangle(325, 60, 96, 96));
        setAnimation(new String[]{"tube 0"});
    }


    @Override
    public void doLoopAction() {

    }

    @Override
    public void doCharacterCollision(Collision collision, MapObject mapObject) {

    }




}