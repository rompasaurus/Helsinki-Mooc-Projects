public class Calculator {

    private Reader reader = new Reader();
    private int calculations;
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        int[] values = {0, 0};
        getUserValues(values);
        System.out.print("sum of the values ");
        System.out.println(values[0] + values[1]);
        calculations++;
    }

    private void getUserValues(int[] values) {
        System.out.println("value1: ");
        values[0] = reader.readInteger();
        System.out.println("value2: ");
        values[1] = reader.readInteger();
    }

    private  void difference() {
        int[] values={0,0};
        getUserValues(values);
        System.out.print("difference of the values ");
        System.out.println(values[0] - values[1]);
        calculations++;
    }

    private void product() {
        int[] values = {0, 0};
        getUserValues(values);
        System.out.print("product of the values ");
        System.out.println(values[0] * values[1]);
        calculations++;
    }
    private void statistics() {
        System.out.println("Calculations done "+calculations);
    }
}

