import org.bukkit.Material;

public class MaterialCategory {
  public static boolean isHelmet(Material paramMaterial) {
    switch (paramMaterial) {
      case LEATHER_HELMET:
      case IRON_HELMET:
      case GOLDEN_HELMET:
      case DIAMOND_HELMET:
      case CHAINMAIL_HELMET:
      case TURTLE_HELMET:
      case NETHERITE_HELMET:
        return true;
    } 
    return false;
  }
  
  public static boolean isBoots(Material paramMaterial) {
    switch (paramMaterial) {
      case LEATHER_BOOTS:
      case IRON_BOOTS:
      case GOLDEN_BOOTS:
      case DIAMOND_BOOTS:
      case CHAINMAIL_BOOTS:
      case NETHERITE_BOOTS:
        return true;
    } 
    return false;
  }
  
  public static boolean isChestplate(Material paramMaterial) {
    switch (paramMaterial) {
      case LEATHER_CHESTPLATE:
      case IRON_CHESTPLATE:
      case GOLDEN_CHESTPLATE:
      case DIAMOND_CHESTPLATE:
      case CHAINMAIL_CHESTPLATE:
      case NETHERITE_CHESTPLATE:
        return true;
    } 
    return false;
  }
  
  public static boolean isLeggings(Material paramMaterial) {
    switch (paramMaterial) {
      case LEATHER_LEGGINGS:
      case IRON_LEGGINGS:
      case GOLDEN_LEGGINGS:
      case DIAMOND_LEGGINGS:
      case CHAINMAIL_LEGGINGS:
      case NETHERITE_LEGGINGS:
        return true;
    } 
    return false;
  }
  
  public static boolean isBarding(Material paramMaterial) {
    switch (paramMaterial) {
      case IRON_HORSE_ARMOR:
      case GOLDEN_HORSE_ARMOR:
      case DIAMOND_HORSE_ARMOR:
      case LEATHER_HORSE_ARMOR:
        return true;
    } 
    return false;
  }
  
  public static boolean isArmor(Material paramMaterial) {
    return (isHelmet(paramMaterial) || isChestplate(paramMaterial) || isLeggings(paramMaterial) || isBoots(paramMaterial) || isBarding(paramMaterial));
  }
  
  public static boolean isWeapon(Material paramMaterial) {
    if (isSword(paramMaterial) || paramMaterial == Material.TRIDENT || isBow(paramMaterial))
      return true; 
    return false;
  }
  
  public static boolean isBow(Material paramMaterial) {
    switch (paramMaterial) {
      case BOW:
      case CROSSBOW:
        return true;
    } 
    return false;
  }
  
  public static boolean isTool(Material paramMaterial) {
    if (isSpade(paramMaterial) || isHoe(paramMaterial) || isPick(paramMaterial) || isAxe(paramMaterial))
      return true; 
    switch (paramMaterial) {
      case SHEARS:
      case FLINT_AND_STEEL:
      case FISHING_ROD:
      case CARROT_ON_A_STICK:
      case SHIELD:
      case COMPASS:
      case CLOCK:
      case LEAD:
        return true;
    } 
    return false;
  }
  
  public static boolean isSword(Material paramMaterial) {
    switch (paramMaterial) {
      case IRON_SWORD:
      case STONE_SWORD:
      case GOLDEN_SWORD:
      case DIAMOND_SWORD:
      case WOODEN_SWORD:
      case NETHERITE_SWORD:
        return true;
    } 
    return false;
  }
  
  public static boolean isSpade(Material paramMaterial) {
    switch (paramMaterial) {
      case IRON_SHOVEL:
      case STONE_SHOVEL:
      case GOLDEN_SHOVEL:
      case DIAMOND_SHOVEL:
      case WOODEN_SHOVEL:
      case NETHERITE_SHOVEL:
        return true;
    } 
    return false;
  }
  
  public static boolean isHoe(Material paramMaterial) {
    switch (paramMaterial) {
      case IRON_HOE:
      case STONE_HOE:
      case GOLDEN_HOE:
      case DIAMOND_HOE:
      case WOODEN_HOE:
      case NETHERITE_HOE:
        return true;
    } 
    return false;
  }
  
  public static boolean isPick(Material paramMaterial) {
    switch (paramMaterial) {
      case IRON_PICKAXE:
      case STONE_PICKAXE:
      case GOLDEN_PICKAXE:
      case DIAMOND_PICKAXE:
      case WOODEN_PICKAXE:
      case NETHERITE_PICKAXE:
        return true;
    } 
    return false;
  }
  
  public static boolean isAxe(Material paramMaterial) {
    switch (paramMaterial) {
      case IRON_AXE:
      case STONE_AXE:
      case GOLDEN_AXE:
      case DIAMOND_AXE:
      case WOODEN_AXE:
      case NETHERITE_AXE:
        return true;
    } 
    return false;
  }
  
  public static boolean isLog(Material paramMaterial) {
    switch (paramMaterial) {
      case ACACIA_LOG:
      case BIRCH_LOG:
      case DARK_OAK_LOG:
      case JUNGLE_LOG:
      case OAK_LOG:
      case SPRUCE_LOG:
        return true;
    } 
    return false;
  }
  
  public static boolean isWood(Material paramMaterial) {
    switch (paramMaterial) {
      case ACACIA_WOOD:
      case BIRCH_WOOD:
      case DARK_OAK_WOOD:
      case JUNGLE_WOOD:
      case OAK_WOOD:
      case SPRUCE_WOOD:
        return true;
    } 
    return false;
  }
  
  public static boolean isStrippedLog(Material paramMaterial) {
    switch (paramMaterial) {
      case STRIPPED_ACACIA_LOG:
      case STRIPPED_BIRCH_LOG:
      case STRIPPED_DARK_OAK_LOG:
      case STRIPPED_JUNGLE_LOG:
      case STRIPPED_OAK_LOG:
      case STRIPPED_SPRUCE_LOG:
        return true;
    } 
    return false;
  }
  
  public static boolean isStrippedWood(Material paramMaterial) {
    switch (paramMaterial) {
      case STRIPPED_ACACIA_WOOD:
      case STRIPPED_BIRCH_WOOD:
      case STRIPPED_DARK_OAK_WOOD:
      case STRIPPED_JUNGLE_WOOD:
      case STRIPPED_OAK_WOOD:
      case STRIPPED_SPRUCE_WOOD:
        return true;
    } 
    return false;
  }
  
  public static boolean isBurnableWood(Material paramMaterial) {
    return (isLog(paramMaterial) || isStrippedLog(paramMaterial) || isWood(paramMaterial) || isStrippedWood(paramMaterial));
  }
  
  public static boolean isRepairable(Material paramMaterial) {
    return (paramMaterial.getMaxDurability() > 0);
  }
  
  public static boolean isAnvilRepairable(Material paramMaterial) {
    if (!isRepairable(paramMaterial))
      return false; 
    switch (paramMaterial) {
      case BOW:
      case CROSSBOW:
      case SHEARS:
      case FLINT_AND_STEEL:
      case FISHING_ROD:
      case CARROT_ON_A_STICK:
      case COMPASS:
      case CLOCK:
      case LEAD:
      case TRIDENT:
        return false;
    } 
    return true;
  }
  
  public static Material getRawMaterial(Material paramMaterial) {
    switch (paramMaterial) {
      case DIAMOND_HELMET:
      case DIAMOND_BOOTS:
      case DIAMOND_CHESTPLATE:
      case DIAMOND_LEGGINGS:
      case DIAMOND_HORSE_ARMOR:
      case DIAMOND_SWORD:
      case DIAMOND_SHOVEL:
      case DIAMOND_HOE:
      case DIAMOND_PICKAXE:
      case DIAMOND_AXE:
        return Material.DIAMOND;
      case GOLDEN_HELMET:
      case GOLDEN_BOOTS:
      case GOLDEN_CHESTPLATE:
      case GOLDEN_LEGGINGS:
      case GOLDEN_HORSE_ARMOR:
      case GOLDEN_SWORD:
      case GOLDEN_SHOVEL:
      case GOLDEN_HOE:
      case GOLDEN_PICKAXE:
      case GOLDEN_AXE:
        return Material.GOLD_INGOT;
      case IRON_HELMET:
      case CHAINMAIL_HELMET:
      case IRON_BOOTS:
      case CHAINMAIL_BOOTS:
      case IRON_CHESTPLATE:
      case CHAINMAIL_CHESTPLATE:
      case IRON_LEGGINGS:
      case CHAINMAIL_LEGGINGS:
      case IRON_HORSE_ARMOR:
      case IRON_SWORD:
      case IRON_SHOVEL:
      case IRON_HOE:
      case IRON_PICKAXE:
      case IRON_AXE:
        return Material.IRON_INGOT;
      case STONE_SWORD:
      case STONE_SHOVEL:
      case STONE_HOE:
      case STONE_PICKAXE:
      case STONE_AXE:
        return Material.STONE;
      case WOODEN_SWORD:
      case WOODEN_SHOVEL:
      case WOODEN_HOE:
      case WOODEN_PICKAXE:
      case WOODEN_AXE:
        return Material.OAK_PLANKS;
      case LEATHER_HELMET:
      case LEATHER_BOOTS:
      case LEATHER_CHESTPLATE:
      case LEATHER_LEGGINGS:
      case LEATHER_HORSE_ARMOR:
        return Material.LEATHER;
      case ELYTRA:
        return Material.PHANTOM_MEMBRANE;
      case TURTLE_HELMET:
        return Material.SCUTE;
      case NETHERITE_HELMET:
      case NETHERITE_BOOTS:
      case NETHERITE_CHESTPLATE:
      case NETHERITE_LEGGINGS:
      case NETHERITE_SWORD:
      case NETHERITE_SHOVEL:
      case NETHERITE_HOE:
      case NETHERITE_PICKAXE:
      case NETHERITE_AXE:
        return Material.NETHERITE_INGOT;
    } 
    return null;
  }
}
