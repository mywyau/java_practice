package java_practice.generics;

public class GenericClasses {


    // We will define a generic class called Box

    public class Box<T> {

        private T item;

        public void setItem(T item){
            this.item = item; 
        }

        public T getItem(){
            return this.item; 
        }
    }

}
