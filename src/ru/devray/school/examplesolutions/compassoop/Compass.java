package ru.devray.school.examplesolutions.compassoop;

public class Compass {

    public void showDirection(double degreeInput) {

        //int directionIndex = getDirectionIndexWithoutLoop(degreeInput);
        int directionIndex = getDirectionIndexWithLoop(degreeInput);

        System.out.println( String.format("%s %.2f\u00B0", Direction.values()[directionIndex], degreeInput) );

    }

    //более лакончиное решение с использованием цикла
    public int getDirectionIndexWithLoop(double degreeInput){

        // нормализуем ввод к диапазону 0-360
        double targetDegree = degreeInput % 360;

        // индекс искомого направления, который мы будем искать.
        // изначально проинициализирован = 0.
        int directionIndex = 0;

        for (int i = 0; i < Direction.values().length; i++){
            if (targetDegree < Direction.values()[i].getDegree() + 11.25 ) {
                directionIndex = i;
                break;
            }
        }

        return directionIndex;
    }

    //альтернативное решение на математике, без использования цикла
    public int getDirectionIndexWithoutLoop(double degreeInput){

        // нормализуем ввод к диапазону 0-360
        double targetDegree = degreeInput % 360;

        // получаем размер одного сектора (диапазона значений направления) в градусах
        double sectorSize = 360.0 / Direction.values().length;

        // целое значение от деления ввода на размер сектора = индекс нижней границы сектора
        int lowerBoundIndex = (int)(targetDegree / sectorSize);

        // индекс верхней границы сектора
        int upperBoundIndex = (lowerBoundIndex + 1) % Direction.values().length;

        // получаем из enum нижнюю границу в градусах
        double lowerBound = Direction.values()[lowerBoundIndex].getDegree();

        // если разница между вводом и нижней границей меньше половины сектора, то возвращаем индекс нижней границы, иначе верхней
        return (targetDegree - lowerBound < sectorSize / 2) ? lowerBoundIndex : upperBoundIndex;

    }

}