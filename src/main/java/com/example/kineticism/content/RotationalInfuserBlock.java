package com.example.kineticism.content;

import com.simibubi.create.content.kinetics.base.DirectionalKineticBlock;
import com.simibubi.create.content.kinetics.simpleRelays.ShaftBlock;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.property.Properties;

public class RotationalInfuserBlock extends DirectionalKineticBlock implements IBE<RotationalInfuserBlockEntity> {
    public RotationalInfuserBlock(Properties properties) {
        super(properties);
    }

    @Override
    public Class<RotationalInfuserBlockEntity> getBlockEntityClass() {
        return null;
    }

    @Override
    public BlockEntityType<? extends RotationalInfuserBlockEntity> getBlockEntityType() {
        return null;
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return null;
    }
}
