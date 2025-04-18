package external;

public class MainImmutable {

    public static void main(String[] args) {


        PersonImmutable jane = new PersonImmutable("Jane", "01/01/1930");
        PersonImmutable jim = new PersonImmutable("Jim", "02/02/1932");
        PersonImmutable joe = new PersonImmutable("Joe", "03/03/1934");

        PersonImmutable[] johnsKids = {jane, jim, joe};
        PersonImmutable john = new PersonImmutable("John", "05/05/1900", johnsKids);

        System.out.println(john);

        PersonImmutable johnCopy = new PersonImmutable("John", "05/05/1900");
        System.out.println(johnCopy);

        PersonImmutable[] kids = johnCopy.kids();
        kids[0] = jim;
        kids[1] = new PersonImmutable("Ann", "04/04/1936");
        System.out.println(johnCopy);

        johnsKids[0] = new PersonImmutable("Ann", "04/04/1936");
        System.out.println(john);


    }
}
