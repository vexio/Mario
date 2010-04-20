/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario.scenery;

import java.awt.Rectangle;
import mario.Game;
import mario.core.Collision;
import mario.core.MapObject;
import mario.core.NoClip;

/**
 *
 * @author danny
 */
public class SmallShrooms extends Scenery implements NoClip, ForeGround
{
    public SmallShrooms(Game game, int x, int y, int width, int height)
    {
        super(game, x, y, width, height, "/images/nsmbtileset.png");
        frames.put("smallShroom 0", new Rectangle(308, 67, 95, 36));
        setAnimation(new String[]
                {
                    "smallShroom 0"
                });
    }

    @Override
    public void doLoopAction()
    {
    }

    @Override
    public void doCharacterCollision(Collision collision, MapObject mapObject)
    {
    }
}
