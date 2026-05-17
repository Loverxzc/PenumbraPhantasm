package destiny.penumbra_phantasm.server.block.entity;

import destiny.penumbra_phantasm.client.render.menu.UmbrastoneFurnaceMenu;
import destiny.penumbra_phantasm.server.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class UmbrastoneFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public UmbrastoneFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.UMBRASTONE_FURNACE_BLOCK_ENTITY.get(), pos, state, RecipeType.SMELTING);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.penumbra_phantasm.umbrastone_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new UmbrastoneFurnaceMenu(containerId, inventory, this, this.dataAccess);
    }
}
