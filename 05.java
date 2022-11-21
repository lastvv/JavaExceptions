//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
package JavaExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 05 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи что-нибудь, что угодно");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("И чего ты ничего не ввёл?");

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
