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
        //Validate the parameters
        validateInputValue(x);
        validateInputValue(y);

        return x + y;
        throw new SolutionNotImplementedException();
    }

    /**
     * @return
     */
    private int validateInputValue(final int numToCheck) {
        return (numToCheck >0 && numToCheck < 100) ? 0 : throw new IllegalArgumentException("Input must be a positive integer between 0 and 100");


    }

}




