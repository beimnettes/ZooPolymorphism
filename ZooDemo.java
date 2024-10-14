public class ZooDemo {

    // Abstract class Animal
    abstract static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // Abstract method
        public abstract void makeSound();

        // Overloaded method to make sound multiple times
        public void makeSound(int times) {
            for (int i = 0; i < times; i++) {
                makeSound(); // Calls the makeSound() method
            }
        }
    }

    // Derived class Lion
    static class Lion extends Animal {
        public Lion(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Roar");
        }
    }

    // Derived class Elephant
    static class Elephant extends Animal {
        public Elephant(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Trumpet");
        }
    }

    // Derived class Monkey
    static class Monkey extends Animal {
        public Monkey(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Screech");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create instances of each animal
        Animal lion = new Lion("Simba");
        Animal elephant = new Elephant("Dumbo");
        Animal monkey = new Monkey("George");

        // Store animals in an array
        Animal[] zoo = {lion, elephant, monkey};

        // Loop through the zoo and call makeSound methods
        for (Animal animal : zoo) {
            // Print the animal's name
            System.out.println(animal.getName() + ":");

            // Call makeSound() once
            animal.makeSound();

            // Call the overloaded makeSound(int) method
            animal.makeSound(3);

            // Print a line to separate outputs
            System.out.println();
        }
    }
}
