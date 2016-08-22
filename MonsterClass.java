package com.Day8HW;

public class MonsterClass {

	public String name = null;
	public String size = null;
	public String texture = null;
	public String color = null;
	public String type = null;
	public int eyes = 0;
	public int horns = 0;
	public String movement = null;
	public String power = null;
	public String powerDoes = null;
	public String food = null;
	
	public MonsterClass(String name, String size, String texture, String color, String type, int eyes, int horns,
			String movement, String power, String powerDoes, String food) {
		this.name = name;
		this.size = size;
		this.texture = texture;
		this.color = color;
		this.type = type;
		this.eyes = eyes;
		this.horns = horns;
		this.movement = movement;
		this.power = power;
		this.powerDoes = powerDoes;
		this.food = food;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getHorns() {
		return horns;
	}

	public void setHorns(int horns) {
		this.horns = horns;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getPowerDoes() {
		return powerDoes;
	}

	public void setPowerDoes(String powerDoes) {
		this.powerDoes = powerDoes;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public MonsterClass() {
	}



	@Override
	public String toString() {
		return "Your monster is named " + name + "." + "\n" + name + " is a " + size + " " + color + " " + type +" with " + texture + " skin.\n" + name + " has " + eyes + " eyes, " + horns + " arms, and " + movement + "s to move.\n" + name +" uses the power of " + power
				+ " to " + powerDoes + " " + food + ".";
	}
	
}
	
	


	
	