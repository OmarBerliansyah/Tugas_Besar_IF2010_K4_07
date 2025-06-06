package com.SpakborHills.objects;

import java.util.EnumSet;

import com.SpakborHills.entity.Entity;
import com.SpakborHills.entity.EntityType;
import com.SpakborHills.environment.Season;
import com.SpakborHills.main.GamePanel;

public class OBJ_CauliflowerSeeds extends Entity {
    public EnumSet<Season> availableSeasons;

    public OBJ_CauliflowerSeeds(GamePanel gp){
        super(gp);
        name = "Cauliflower Seeds";
        down1 = setup("objects/CauliflowerSeeds",gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nBenih yang dapat\nditanam pada saat\nspring."; 
        isPickable = true;
        daysToHarvest = 5;
        this.harvestProduct = new OBJ_Cauliflower(gp);
        cropCount = 1; // Jumlah panen per tanaman 
        buyPrice = 80; 
        salePrice = 40;
        isEdible = false;
        availableSeasons = EnumSet.of(Season.SPRING);
        type = EntityType.SEED;
    }

    @Override
    public EnumSet<Season> getAvailableSeasons() {
        return availableSeasons;
    }

    @Override
    public Entity copy() {
        return new OBJ_CauliflowerSeeds(gp);
    }
}