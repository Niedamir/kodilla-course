package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
	private final String bun;
	private final int burgers;
	private final String sauce;
	private final List<String> ingredients;

	public Bigmac(String bun, int burgers, String sauce, ArrayList<String> ingredients) {
		this.bun = bun;
		this.burgers = burgers;
		this.sauce = sauce;
		this.ingredients = ingredients;
	}

	public static class BigmacBuilder {
		private String bun;
		public static final String SEZAM = "with sezam";
		public static final String NOSEZAM = "without sezam";
		private int burgers;
		private String sauce;
		public static final String SAUCESTANDARD = "standard sauce";
		public static final String SAUCE1000ISLES = "1000 isles sauce";
		public static final String SAUCEBARBECUE = "barbecue sauce";
		private ArrayList<String> ingredients = new ArrayList<>();
		public List<String> availableIngredients = new ArrayList<>();

		public void prepareIngredientsList() {
			availableIngredients.add("salad");
			availableIngredients.add("onion");
			availableIngredients.add("becon");
			availableIngredients.add("cucumber");
			availableIngredients.add("chilli");
			availableIngredients.add("mushrooms");
			availableIngredients.add("shrimp");
			availableIngredients.add("cheese");
		}

		public BigmacBuilder bun(String bun) {
			if (bun.equals(SEZAM) || bun.equals(NOSEZAM)) {
				this.bun = bun;
			} else {
				throw new IllegalStateException("Bun should be with sezam or without sezam!");
			}
			return this;
		}
		public BigmacBuilder burgers(int burgers) {
			this.burgers = burgers;
			return this;
		}
		public BigmacBuilder sauce(String sauce) {
			if (sauce.equals(SAUCESTANDARD) || sauce.equals(SAUCE1000ISLES) || sauce.equals(SAUCEBARBECUE)) {
				this.sauce = sauce;
			} else {
				throw new IllegalStateException("Sauce should be standard sauce or 1000 isles sauce or barbecue sauce!");
			}
			return this;
		}
		public BigmacBuilder ingredient(String ingredient) {
			prepareIngredientsList();
			boolean isInList = false;
			for(String ingredientFromList : availableIngredients) {
				if(ingredient.equals(ingredientFromList)) {
					isInList = true;
				}
			}
			if(isInList == true) {
				ingredients.add(ingredient);
			} else {
				throw new IllegalStateException("Ingredient is not available!");
			}
			return this;
		}

		public Bigmac build() {
			return new Bigmac(bun, burgers, sauce, ingredients);
		}
	}


	public String getBun() {
		return bun;
	}
	public int getBurgers() {
		return burgers;
	}
	public String getSauce() {
		return sauce;
	}
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String toString() {
		return "Bigmac{" + "bun='" + bun + '\'' + ", burgers=" + burgers + ", sauce='" + sauce + '\'' + ", ingredients=" + ingredients + '}';
	}
}
