package lessons.lesson24_enum;

public class EnumRunner {

    public static void main(String[] args) {
        System.out.println(UsStates.CALIFORNIA.getCapital());
        System.out.println(UsStates.FLORIDA.getAbbreviation());

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String stateName = UsStates.getStateNameFromCapital("Olympia");
        System.out.println(stateName);

        String abbreviation = UsStates.getAbbreviationFromCapital("Topeka");
        System.out.println(abbreviation);
    }
}
