package net.crema.bbcc.item;

import net.crema.bbcc.BitchesBeCrayCray;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BBCC_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BitchesBeCrayCray.MOD_ID, "bbcc_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AETHER_STAR))
                    .displayName(Text.translatable("itemgroup.bitches-be-cray-cray_items"))
                    .entries((displayContext, entries) -> {
                        //Add Items To The Group Here
                        entries.add(ModItems.AETHER_STAR);
                    })
                    .build());

    public static void registerItemGroups() {
        BitchesBeCrayCray.LOGGER.info("Registering Mod Items for " + BitchesBeCrayCray.MOD_ID);
    }
}
