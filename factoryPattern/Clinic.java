import java.util.Scanner;

public class Clinic{

    static Scanner input;
    static PetRecord petRecord;

    public static void main(String[] args) {
        
        input = new Scanner(System.in);
        petRecord = new PetRecord();
        Pet pet;
        int choice;
        
    do{
        System.out.println("Choose Pet: ");
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");

        System.out.print("\nChoose your number: ");
        choice = input.nextInt();

    switch (choice) {
            case 1:
                pet = new Dog();
                petRecord.setPetId("P001");
                petRecord.setPetName("Bantay");
                petRecord.setPet(pet);
                ((Dog) pet).setBreed(("Siberian Husky"));
                printRecord();
                break;
            case 2:
                pet = new Cat();
                petRecord.setPetId("P002");
                petRecord.setPetName("Muning");
                petRecord.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                printRecord();
                break;
            case 3:
                System.out.println("\nHernandez, Janice V.\n3BSCS-2\nTerminated");
                break;
            default: System.exit(0);
                break; 
        }

    }while(choice != 3);
    input.close();
  }

  public static void printRecord(){
    System.out.println("\nPet ID: " + petRecord.getPetId());
    System.out.println("Pet Name: " + petRecord.getPetName());
    System.out.println("Pet Kind: " + petRecord.getPet().getClass().getSimpleName());
    System.out.println("Comunication Sound: " + petRecord.getPet().makeSound());
    System.out.println("Play: " + petRecord.getPet().play());

    if (petRecord.getPet() instanceof Dog) {
            Dog dog = (Dog) petRecord.getPet();
            System.out.println("Breed: " + dog.getBreed());
        } else if (petRecord.getPet() instanceof Cat) {
            Cat cat = (Cat) petRecord.getPet();
            System.out.println("Number of Lives: " + cat.getNoOfLives());
        }
    System.out.println();
  }
}
