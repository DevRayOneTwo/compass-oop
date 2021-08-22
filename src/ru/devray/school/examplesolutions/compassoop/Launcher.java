package ru.devray.school.examplesolutions.compassoop;

import java.util.Scanner;

/**
 * Класс-запускалка нашего приложения компасса.
 * Направлен на работу с пользовательским вводом.
 */
public class Launcher {

    public static void main(String[] args) {

        double degreeInput = readDegree(); // вызываем метод для чтения ввода пользователя
        // проверяем, что ввод неотрицательный, иначе завершаем программу
        if (degreeInput < 0) {
            System.out.println("Введено некорректное значение!");
            return;
        }

        Compass compass = new Compass(); // создаем экземпляр компаса
        compass.showDirection(degreeInput); // вызываем метод для определения направления
    }

    //метод для считывания ввода пользователя
    static double readDegree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число градусов больше 0: ");
        // если введено не числовое значение, то возвращаем -1
        return scanner.hasNextDouble() ? scanner.nextDouble() : -1;
    }

}




