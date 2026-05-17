package destiny.penumbra_phantasm.client.render.screen;

import destiny.penumbra_phantasm.client.render.menu.UmbrastoneFurnaceMenu;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class UmbrastoneFurnaceScreen extends AbstractFurnaceScreen<UmbrastoneFurnaceMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/furnace.png");

    public UmbrastoneFurnaceScreen(UmbrastoneFurnaceMenu menu, Inventory playerInventory, Component title) {
        super(menu, new SmeltingRecipeBookComponent(), playerInventory, title, TEXTURE);
    }
}
