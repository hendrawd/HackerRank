/**
 * Created by hendrawd on 1/4/16.
 *
 * @see https://www.hackerrank.com/contests/30-days-of-code/challenges/day-4-boolean-operators-class-vs-instance
 */
public class LogicalOperatorsClassVsInstance {

    //just need to include these lines code
    public class Person {

        int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initial_Age
            if (initialAge < 0) {
                System.out.println("This person is not valid, setting age to 0.");
                age = 0;
            } else {
                age = initialAge;
            }
        }

        public void amIOld() {
            // Do some computations in here and print out the correct statement to the console
            // using System.out.println()...
            if (age < 13) {
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }

        public void yearPasses() {
            // Increment the age of the person in here
            age++;
        }
    }
}
