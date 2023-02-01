package inheritance;

public class Animal {

    int legs;
    int weight;
        public void eat() {
            System.out.println("I can eat");
        }


    class Dog extends Animal {
            String color;
            int weight;

            Dog(String color,int weight){
                this.color=color;
                this.weight=weight;
            }
        public void eat() {
            System.out.println("I eat pedigree");
        }
    }
    class Cat extends Animal {
        String color;
        int weight;

        Cat(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }
        public void eat() {
            System.out.println("I eat whiskas");
        }
    }

}
