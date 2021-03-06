package kenymylankca.harshenuniverse.blocks;

import java.util.List;
import java.util.Random;

import kenymylankca.harshenuniverse.HarshenItems;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class HarshenSoulFlower extends BlockFlower
{
	public HarshenSoulFlower() {
		setUnlocalizedName("harshen_soul_flower");
        setRegistryName("harshen_soul_flower");
        blockSoundType = blockSoundType.PLANT;
	}
	
	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.25f, 0f, 0.25f, 0.75f, 0.8125f, 0.75f);
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		addCollisionBoxToList(pos, entityBox, collidingBoxes, NULL_AABB);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return HarshenItems.HARSHEN_CRYSTAL;
	}
	
	@Override
	public EnumFlowerColor getBlockType() {
		return EnumFlowerColor.YELLOW;
	}
	
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	{
		return true;
	}
}