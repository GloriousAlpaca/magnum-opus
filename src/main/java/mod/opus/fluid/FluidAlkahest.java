package mod.opus.fluid;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class FluidAlkahest extends FlowingFluid{

	@Override
	public Fluid getFlowingFluid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fluid getStillFluid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean canSourcesMultiply() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void beforeReplacingBlock(IWorld worldIn, BlockPos pos, BlockState state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected int getSlopeFindDistance(IWorldReader worldIn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getLevelDecreasePerBlock(IWorldReader worldIn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item getFilledBucket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean func_215665_a(IFluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_,
			Fluid p_215665_4_, Direction p_215665_5_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getTickRate(IWorldReader p_205569_1_) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected float getExplosionResistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected BlockState getBlockState(IFluidState state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSource(IFluidState state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLevel(IFluidState p_207192_1_) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static class Flowing extends FluidAlkahest {
	      protected void fillStateContainer(StateContainer.Builder<Fluid, IFluidState> builder) {
	         super.fillStateContainer(builder);
	         builder.add(LEVEL_1_8);
	      }

	      public int getLevel(IFluidState p_207192_1_) {
	         return p_207192_1_.get(LEVEL_1_8);
	      }

	      public boolean isSource(IFluidState state) {
	         return false;
	      }
	   }

	   public static class Source extends FluidAlkahest {
	      public int getLevel(IFluidState p_207192_1_) {
	         return 8;
	      }

	      public boolean isSource(IFluidState state) {
	         return true;
	      }
	   }
	   
}
