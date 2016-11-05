package fvi.breakout;

import com.almasb.fxgl.GameApplication;
import com.almasb.fxgl.GameSettings;
import com.almasb.fxgl.asset.Assets;
import com.almasb.fxgl.entity.EntityType;
import com.almasb.fxgl.physics.PhysicsEntity;
import javafx.scene.layout.Pane;
import org.jbox2d.dynamics.BodyType;

/**
 * Created by Vika on 05.11.2016.
 */
public class BreakOutApp extends GameApplication{
    private enum Type implements EntityType{
        BAT,BALL, BRICK
    }
    private Assets assets;
    private PhysicsEntity bat,ball;


    @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("Created by Frantsuh_Breakout ");
        settings.setVersion("1.0");
        settings.setWidth(640);
        settings.setHeight(660);
        settings.setIntroEnabled(false);

    }

    @Override
    protected void initAssets() throws Exception {
        assets = assetManager.cache();
        assets.logCached();

    }

    @Override
    protected void initGame() {
        initBat();
        //initBall();
        //initBrick();
    }
    private void initBat(){
        bat=new PhysicsEntity (Type.BALL);
        bat.setPosition(getWidth()/2-128/2,getHeight()-25);
        bat.setGraphics(assets.getTexture("bat.png"));
        bat.setBodyType(BodyType.KINEMATIC);
        addEntities(bat);


    }

    @Override
    protected void initUI(Pane uiRoot) {

    }

    @Override
    protected void initInput() {

    }

    @Override
    protected void onUpdate() {

    }
    public static void main (String[] args){

launch(args);
    }
}
