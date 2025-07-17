package java_practice.generics;

public class GenericClasses {


    // We will define a generic class called Box

    public static class Box<T> {

        private T item;

        public void setItem(T item){
            this.item = item; 
        }

        public T getItem(){
            return this.item; 
        }
    }


    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> numberBox = new Box<>();
        stringBox.setItem("Sword");
        numberBox.setItem(100);
        String swordValue = stringBox.getItem();
        Integer numberValue = numberBox.getItem();
        System.out.println("Inside my string box there is a: " + swordValue);
        System.out.println("Inside my number box there is a: " + numberValue);
    }

}
