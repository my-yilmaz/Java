package lessons.lesson24_enum;

public class EnumRunner {

    public static void main(String[] args) {
        System.out.println(UsStates.CALIFORNIA.getCapital());
        System.out.println(UsStates.FLORIDA.getAbbreviation());

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String stateName = UsStates.getStateNameFromCapital("Olympia");
        System.out.println(stateName);

        System.out.println(UsStates.getStateNameFromCapital("Madison"));

        String abbreviation = UsStates.getAbbreviationFromCapital("Topeka");
        System.out.println(abbreviation);

        System.out.println(UsStates.getAbbreviationFromCapital("Madison"));
    }
}
