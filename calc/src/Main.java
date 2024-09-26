
    import java.util.Scanner;

   public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите символ");
            String input = scanner.nextLine();
            try {
                String result = calc(input);
                System.out.println("Результат: " + result);
            } catch (Exception a) {
                System.out.println("Неверный формат входных данных,попробуйте еще раз!!!");
            }
        }

        public static String calc(String input) throws Exception {
            String[] part = input.split(" ");
            if (part.length != 3) {
                throw new Exception("Неверный формат выражения");
            }

            int number1 = Integer.parseInt(part[0]);
            int number2 = Integer.parseInt(part[2]);
            String operator = part[1];

            if (number1 < 1 || number1 > 10 || number2 < 1 || number2 > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }

            int result;
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
                default:
                    throw new Exception("Вы ввели неверный оператор");
            }

            return String.valueOf(result);
        }
    }


