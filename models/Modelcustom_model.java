// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer bone7;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;

	public Modelcustom_model() {
		textureWidth = 16;
		textureHeight = 16;

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -5.0F, -13.0F, -4.0F, 9, 9, 9, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -4.0F, -3.0F, 7, 1, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -3.0F, -2.0F, 5, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -2.0F, -1.0F, 3, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.5708F);
		bone7.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -12.0F, 5.0F, -3.0F, 7, 1, 7, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -11.0F, 6.0F, -2.0F, 5, 1, 5, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -10.0F, 7.0F, -1.0F, 3, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -9.0F, 8.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone3, -1.5708F, 0.0F, 1.5708F);
		bone7.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -12.0F, 4.0F, -3.0F, 7, 1, 7, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -11.0F, 5.0F, -2.0F, 5, 1, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -10.0F, 6.0F, -1.0F, 3, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -9.0F, 7.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, 3.1416F, 0.0F, 1.5708F);
		bone7.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -12.0F, 4.0F, -4.0F, 7, 1, 7, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -11.0F, 5.0F, -3.0F, 5, 1, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -10.0F, 6.0F, -2.0F, 3, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -9.0F, 7.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 1.5708F, 0.0F, 1.5708F);
		bone7.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -12.0F, 5.0F, -4.0F, 7, 1, 7, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -11.0F, 6.0F, -3.0F, 5, 1, 5, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -10.0F, 7.0F, -2.0F, 3, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -9.0F, 8.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone6, 3.1416F, 0.0F, 0.0F);
		bone7.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -4.0F, 13.0F, -4.0F, 7, 1, 7, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -3.0F, 14.0F, -3.0F, 5, 1, 5, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -2.0F, 15.0F, -2.0F, 3, 1, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -1.0F, 16.0F, -1.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone7.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}