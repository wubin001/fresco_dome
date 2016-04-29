package com.nico.app.entity;

/**
 * Created by 就这样子 on 2016/4/20.
 */
public class MainRecipe {

    public String id_recipe;
    public String name_recipe;
    public String describe_recipe;
    public String start_recipe;
    public String image_recipe;

    private MainRecipe[] mainRecipes = new MainRecipe[10];

    public MainRecipe(String id_recipe, String name_recipe, String describe_recipe, String start_recipe, String image_recipe) {
        this.id_recipe = id_recipe;
        this.name_recipe = name_recipe;
        this.describe_recipe = describe_recipe;
        this.start_recipe = start_recipe;
        this.image_recipe = image_recipe;
    }


    private void bulidMainRecipeData(){
        mainRecipes[0] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[1] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[2] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[3] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[4] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[5] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[6] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[7] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[8] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");
        mainRecipes[9] = new MainRecipe(
                "0","早餐牛奶","The milk cartons in Italy has ...","0","http://i.imgur.com/xnKZkZk.jpg");

    }
}
