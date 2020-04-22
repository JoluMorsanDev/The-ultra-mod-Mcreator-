package net.mcreator.theultramod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.theultramod.item.GoldscrapItem;
import net.mcreator.theultramod.TheultramodVariables;
import net.mcreator.theultramod.TheultramodElements;

import java.util.function.Supplier;
import java.util.Map;

@TheultramodElements.ModElement.Tag
public class SmithingguipProcedure extends TheultramodElements.ModElement {
	public SmithingguipProcedure(TheultramodElements instance) {
		super(instance, 19);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Smithingguip!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Smithingguip!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Smithingguip!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Smithingguip!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Smithingguip!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((TheultramodVariables.guiopen2) == (true))) {
			if (((TheultramodVariables.WorldVariables.get(world).Esckey) == (false))) {
				if (((TheultramodVariables.button2) == (true))) {
					if ((((new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (5))) != 63) && ((((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (3))).getItem() == new ItemStack(Items.IRON_SWORD, (int) (1)).getItem()) && ((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (4))).getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem())) && ((((new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (5))) <= 64) && ((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (5))).getItem() == new ItemStack(Items.DIAMOND_SWORD, (int) (1)).getItem())) || ((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (5))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))))) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD, (int) (1));
									_setstack.setCount((int) ((new Object() {
										public int getAmount(int sltid) {
											if (entity instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
														if (stack != null)
															return stack.getCount();
													}
												}
											}
											return 0;
										}
									}.getAmount((int) (5))) + 1));
									((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
						world.playSound((PlayerEntity) null, x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.wooden_pressure_plate.click_on")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					}
					TheultramodVariables.button2 = (boolean) (false);
				}
			} else if (((TheultramodVariables.WorldVariables.get(world).Esckey) == (true))) {
				TheultramodVariables.WorldVariables.get(world).Esckey = (boolean) (false);
				TheultramodVariables.WorldVariables.get(world).syncData(world);
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (3))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (5))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (3)));
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (3))));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (4)));
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4))));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (5)));
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4))));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
			}
		}
		if (((TheultramodVariables.guiopen2) == (true))) {
			if (((TheultramodVariables.WorldVariables.get(world).Esckey) == (false))) {
				if (((TheultramodVariables.button2) == (true))) {
					if ((((new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (5))) != 63) && ((((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (3))).getItem() == new ItemStack(Items.SHEARS, (int) (1)).getItem()) && (((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (4))).getItem() == new ItemStack(GoldscrapItem.block, (int) (1)).getItem()) && ((new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4))) >= 2))) && ((((new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (5))) <= 64) && ((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (5))).getItem() == new ItemStack(Items.DIAMOND_SWORD, (int) (1)).getItem())) || ((new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (5))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))))) {
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (3))).decrStackSize((int) (1));
									_current.detectAndSendChanges();
								}
							}
						}
						if (entity instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									((Slot) ((Map) invobj).get((int) (4))).decrStackSize((int) (2));
									_current.detectAndSendChanges();
								}
							}
						}
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD, (int) (1));
									_setstack.setCount((int) ((new Object() {
										public int getAmount(int sltid) {
											if (entity instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
														if (stack != null)
															return stack.getCount();
													}
												}
											}
											return 0;
										}
									}.getAmount((int) (5))) + 1));
									((Slot) ((Map) invobj).get((int) (5))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
						world.playSound((PlayerEntity) null, x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("block.wooden_pressure_plate.click_on")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					}
					TheultramodVariables.button2 = (boolean) (false);
				}
			} else if (((TheultramodVariables.WorldVariables.get(world).Esckey) == (true))) {
				TheultramodVariables.WorldVariables.get(world).Esckey = (boolean) (false);
				TheultramodVariables.WorldVariables.get(world).syncData(world);
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (3))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (4))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (5))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (3)));
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (3))));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (4)));
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4))));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (5)));
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
										if (stack != null)
											return stack.getCount();
									}
								}
							}
							return 0;
						}
					}.getAmount((int) (4))));
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.getPosX();
			int j = (int) entity.getPosY();
			int k = (int) entity.getPosZ();
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
