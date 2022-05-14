/**
 * Errors below.
 */
class DeliberateErrors {
    main(String[] args) {
        //Removed "r" from print
        //System.out.pintln("Starting an error.\n");
        //Revised after Linter Check
        System.out.println("Starting an error.\n");

        //Changed 2 to 2.0
        //int answer = 5 / 2.0;
        //Revised after Linter Check
        int answer = 5 / 2;
        System.out.println(answer + "\n");

        //Need to end string with "
        //String errorHere = "Right here\n';
        //Revised after Linter Check
        String errorHere = "Right here\n";
        System.out.println(errorHere);

        //Changed 1 to 1.0
        int integer;
        //integer = 1.0;
        //Revised after Linter Check
        integer = 1;
        System.out.println("Integer is " + integer);
    }
}
