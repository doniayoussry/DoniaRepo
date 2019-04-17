/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

public class RulesOf6005 {
     
    
    public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired){
        if(writtenByYourself){
            return true;
        }
        else if(implementationRequired){
            return false;
        }
        else if(!writtenAsCourseWork && availableToOthers && citingYourSource){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("You may certainly use code you wrote yourself: " +
            RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
}
