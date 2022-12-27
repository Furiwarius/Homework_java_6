import java.util.HashMap;
import java.util.Scanner;

public class inputModul {

    public static HashMap<String, Object> inputData() {
        HashMap<String, Object> result = new HashMap<>();
        String[] instructions = new String[]{"Введите объем ЖД: ",
                                            "Введите цвет(англ): ",
                                            "Введите необходимое количество ОП: ",
                                            "Введите диагональ экрана: ",
                                            "Введите количество ядер процессора: "};
        String[] key = new String[]{"volumeHDD", "color", "ram",
                                    "screenDiagonal", "numberProcessorCores"};

        for (int i = 0; i < instructions.length; i++) {
            Object input = userRequest(instructions[i]);
            result.put(key[i], input);
        }


        return result;
    }

    public static Object userRequest(String str) {
        Scanner newInput = new Scanner(System.in);

        System.out.println(str);

        while (true) {
            if (newInput.hasNextLine()){
                String expression = newInput.nextLine();
                if (!expression.isEmpty()){
                    return expression;
                }
                else{
                    clearScreen();
                    System.out.println(str);
                }
            }
        }         
    } 

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }


}
