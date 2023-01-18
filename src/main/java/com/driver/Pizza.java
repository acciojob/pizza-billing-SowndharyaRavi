package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addTakeaway;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean isBillGenerated;
    private int paperBag;
    private int extraCheese;
    private int extraToppings;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
       this.addTakeaway=false;
       this.addExtraCheese=false;
       this.addExtraToppings=false;
       this.isBillGenerated=false;
       this.paperBag=20;
       this.extraCheese=80;
       if(isVeg){
           this.price=300;
           this.extraToppings=70;
       }
       else{
           this.price=400;
           this.extraToppings=120;
       }
       this.bill="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(addExtraCheese==false){
            this.price=price+extraCheese;
            addExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        if(addExtraToppings==false){
            this.price=price+extraToppings;
            addExtraToppings=true;
        }
    }

    public void addTakeaway(){
       if(addTakeaway==false){
           this.price=price+paperBag;
           addTakeaway=true;
       }
    }

    public String getBill() {
        if (isBillGenerated == false) {
            isBillGenerated=true;
            if (addTakeaway) {
                this.bill = this.bill + "Paperbag Added: " + paperBag + "\n";
            }
            if (addExtraCheese) {
                this.bill = this.bill + "Extra Cheese Added: " + extraCheese + "\n";
            }
            if (addExtraToppings) {
                this.bill = this.bill + "Extra Toppings Added: " + extraToppings + "\n";
            }

            this.bill = this.bill + "Total Price: " + this.price + "\n";
            return this.bill;
        }
        return this.bill;
    }
}
