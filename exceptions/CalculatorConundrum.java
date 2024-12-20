// from https://exercism.org/tracks/java/exercises/calculator-conundrum

package exceptions;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int answer;
        try {
            switch(operation) {
                case "+":
                    answer = operand1 + operand2;
                    break;
                case "*":
                    answer = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) throw new ArithmeticException("Division by zero is not allowed");
                    answer = operand1 / operand2;
                    break;
                case null:
                    throw new IllegalArgumentException("Operation cannot be null");
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                default:
                    throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            }            
        } catch (ArithmeticException e) {
            throw new IllegalOperationException(e.getMessage(), e);
        }


        return String.format("%d %s %d = %d", operand1, operation, operand2, answer);
    }
}

// learning exceptions in Java. These were pretty straightforward. I think I get them.
// Not too dissimilar from JavaScript.