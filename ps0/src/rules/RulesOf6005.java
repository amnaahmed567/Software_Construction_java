package rules;

public class RulesOf6005 {

    public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired) {
        
        // If the code is written by yourself, you can use it.
        if (writtenByYourself) {
            return true;
        }
        
        // If the assignment specifically requires you to implement the feature, you can't use external code.
        if (implementationRequired) {
            return false;
        }
        
        // If the code was written as part of a 6.005 assignment, you can't use it.
        if (writtenAsCourseWork) {
            return false;
        }
        
        // If the code is available to others and properly cited, it can be used.
        if (availableToOthers && citingYourSource) {
            return true;
        }
        
        // If none of the above conditions are met, the code cannot be used.
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("You may certainly use code you wrote yourself: " +
            RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
        
        // You can add more test cases here for manual testing
    }
}
