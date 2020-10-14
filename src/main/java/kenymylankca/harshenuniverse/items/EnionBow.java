package kenymylankca.harshenuniverse.items;

import java.util.List;

import kenymylankca.harshenuniverse.HarshenSounds;
import kenymylankca.harshenuniverse.base.BaseHarshenBow;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class EnionBow extends BaseHarshenBow
{
	public EnionBow()
	{
		super(HarshenSounds.LIGHTNING_HIT);
		setUnlocalizedName("enion_bow");
		setRegistryName("enion_bow");
	}

	@Override
	public int getMaxDamage() {
		return 1837;
	}

	@Override
	public double additionDamage() {
		return 2.0D;
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if(entity instanceof EntityLivingBase && player.getCooledAttackStrength(1) == 1)
		{
			((EntityLivingBase)entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 70));
			((EntityLivingBase)entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 30, 7));
		}
		return super.onLeftClickEntity(stack, player, entity);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00a73" + new TextComponentTranslation("enionbow1").getFormattedText());
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}