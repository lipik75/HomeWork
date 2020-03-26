package edu.academy;

public class Color {
    private int getColorNumber;
    private final int RED = 1, ORANGE = 2, YELLOW = 3, GREEN = 4, BLUE = 5, INDIGO = 6, VIOLET = 7;

    public Color (int colorNumber){
        this.getColorNumber = colorNumber;
    }

    public int getNumber (){
        return getColorNumber;
    }

    public String getName(){
        String colorName;
        switch (getColorNumber){
            case RED:
                colorName = "Красный";
                break;
            case ORANGE:
                colorName = "Оранжевый";
                break;
            case YELLOW:
                colorName = "Желтый";
                break;
            case GREEN:
                colorName = "Зеленый";
                break;
            case BLUE:
                colorName = "Голубой";
                break;
            case INDIGO:
                colorName = "Синий";
                break;
            case VIOLET:
                colorName = "Фиолетовый";
            default:
                colorName = "Нет такого цвета в Радуге :)";
        }
        return colorName;
    }
}
