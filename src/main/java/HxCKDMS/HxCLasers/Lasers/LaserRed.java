package HxCKDMS.HxCLasers.Lasers;

import HxCKDMS.HxCLasers.Api.LaserHandler;
import HxCKDMS.HxCLasers.Api.LensUpgrade;
import net.minecraft.entity.Entity;

public class LaserRed extends LaserHandler {
    @Override
    public void entityInteract(LensUpgrade[] lensUpgrades, Entity entity) {
        entity.setFire(5);
    }
}
