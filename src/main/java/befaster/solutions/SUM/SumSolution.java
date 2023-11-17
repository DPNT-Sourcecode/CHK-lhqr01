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
        String result=(numToCheck >0 && numToCheck < 100) ? "The number " + numToCheck + "is valid"
                : "The number " + numToCheck + "is not valid";
    }

}



