package org.skypro.scyprocalculatordemo;

import org.springframework.stereotype.Service;

@Service
public class Servis {
    public String Calculator() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return "Результат  " + num1 + "+" + num2 + "=" + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return "Результат  " + num1 + "-" + num2 + "=" + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return "Результат  " + num1 + "*" + num2 + "=" + result;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        int result = num1 / num2;
        return "Результат : " + num1 + "/" + num2 + "=" + result;
    }

}
