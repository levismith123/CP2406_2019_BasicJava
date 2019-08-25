package week4;

public class Sandwich {
   private String mainIngredient = "none";
   private String breadType = "none";
   private double price = 0.0;

   public String getMainIngredient(){
       return this.mainIngredient;
   }

   public void setMainIngredient(String ingredient){
       this.mainIngredient = ingredient;
   }

   public String getBreadType(){
       return this.breadType;
   }

   public void setBreadType(String bread){
       this.breadType = bread;
   }

   public double getPrice(){
       return this.price;
   }

   public void setPrice (double value){
       this.price = value;
   }



}
