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
        stringBox.setItem("Sword");
        String value = stringBox.getItem();
        System.out.println("Inside my box there is a: " + value);
    }

}
