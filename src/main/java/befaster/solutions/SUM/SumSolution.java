package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    /**
     * @param x
     * @param y
     * @return
     */
    public int compute(final int x, final int y) {
        int mininumValueToValidate = 0;
        int maxValueToValidate = 100;
        //Validate the parameters
        validateInputValue(x, mininumValueToValidate, maxValueToValidate);
        validateInputValue(y, mininumValueToValidate, maxValueToValidate);

        return x + y;
    }

    /**
     * @param numToCheck Number to be validated
     */
    private void validateInputValue(final int numToCheck, final int minValue, final int maxValue) {
        if (numToCheck < minValue || numToCheck > maxValue) {
            throw new IllegalArgumentException("Input must be a positive integer between 0 and 100");
        }
    }

}






