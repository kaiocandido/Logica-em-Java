class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

            if(operation == null ){
                throw new IllegalArgumentException("Operation cannot be null");
            }

            if(operation.isEmpty() ){
                throw new IllegalArgumentException("Operation cannot be empty");
            }

            if(operation.equals("+")){
                int resultado = operand1 + operand2;
                String resultadoFinal = operand1 + " + " + operand2 + " = " + resultado;
                return resultadoFinal;
            } else if (operation.equals("*")) {
                int resultado = operand1 * operand2;
                String resultadoFinal = operand1 + " * " + operand2 + " = " + resultado;
                return resultadoFinal;
            } else if (operation.equals("/")) {
                try{
                    int resultado = operand1 / operand2;
                    String resultadoFinal = operand1 + " / " + operand2 + " = " + resultado;
                    return resultadoFinal;

                }catch (ArithmeticException  e){
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }

            } else {
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }



    }
}
