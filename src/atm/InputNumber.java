package atm;


public class InputNumber {
    private double number = 0;


    public void appendNumber(String n) {
        if (isFloat){
            if (number == 0) number = Double.parseDouble(n);
            else number = number * 10 + Double.parseDouble(n);
        }else{
            if (count == 1) {
                number = number + Double.parseDouble(n) * 0.1;
                count++;
            }else if (count ==2){
                number = number + Double.parseDouble(n) * 0.01;
            }
        }
    }

    public void appendDot() {
        isFloat = false;

    }

    public double getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%.2f", number);
    }
}
