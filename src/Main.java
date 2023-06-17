public class Main {
    public static void main(String[] args) {
        // írd meg a person osztályt
        // példányosísd 3 szor a

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();


        // kérd le a statikus fieldet

        System.out.println(Person.popular);

        // példányosísd még 1 szer
        Person person3 = new Person();

        // kérd le a statikus fieldet
        System.out.println(Person.popular);

        // hívd meg a katasztofa metódust
        System.out.println(Person.katasztrofa());
    }
}
