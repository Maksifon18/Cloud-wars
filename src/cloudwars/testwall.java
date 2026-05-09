package example;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

import static mindustry.type.ItemStack.with;

public class MyWall {
    public static Block myWall;

    public static void load() {
        myWall = new Wall("my-wall") {{
            localizedName = "Моя стена";
            description = "Простая крепкая стена.";

            health = 800;
            size = 1;

            requirements(Category.defense, with(
                Items.copper, 40,
                Items.lead, 20
            ));
        }};
    }
}
