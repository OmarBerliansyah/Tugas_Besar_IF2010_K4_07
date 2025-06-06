package com.SpakborHills.objects;

import com.SpakborHills.entity.Entity;
import com.SpakborHills.main.GamePanel;

public class OBJ_Wine extends Entity {

    public OBJ_Wine(GamePanel gp){
        super(gp);
        name = "Wine";
        down1 = setup("objects/Wine",gp.tileSize, gp.tileSize);
        isPickable = true;
        plusEnergy = 20; 
        buyPrice = 100;
        salePrice = 90;
        isEdible = true;
        description = "[" + name + "]\nDapat memulihkan energi\nsebanyak " + plusEnergy; 
    }
}