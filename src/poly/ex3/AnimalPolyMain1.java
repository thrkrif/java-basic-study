package poly.ex3;


public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Animal[] arr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : arr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
        System.out.println();
    }


}
