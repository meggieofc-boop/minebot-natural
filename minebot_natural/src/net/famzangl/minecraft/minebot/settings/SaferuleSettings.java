package net.famzangl.minecraft.minebot.settings;

public class SaferuleSettings {
	@ClampedFloat(min = 1, max = 180)
	private float maxPitchChangeDegrees = 8;
	@ClampedFloat(min = 1, max = 180)
	private float maxYawChangeDegrees = 10;
	
	private boolean allowTopOfWorldHit = false;

	public float getMaxPitchChangeDegrees() {
		return maxPitchChangeDegrees;
	}

	public float getMaxYawChangeDegrees() {
		return maxYawChangeDegrees;
	}

	public boolean isAllowTopOfWorldHit() {
		return allowTopOfWorldHit;
	}
}
