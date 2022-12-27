


public class Laptop {
    // процессор
    String cpu;
    // количество ядер процессора
    int numberProcessorCores;
    // частота процессора
    double cpuFrequency;
    // оперативная память
    int ram;
    // тип оперативной памяти
    String ramType;
    // объем ЖД
    int volumeHDD;
    // Видеокарта
    String videoCard;
    // память видеокарты
    int videoMemory;
    // операционная система
    String operatingSystem;
    // диагональ экрана
    double screenDiagonal;
    // вес ноутбука
    double weight;
    // цвет
    String color;
    // страна производитель
    String manufacturerCountry;

    public void printMinInfo() {
        // вывод минимальной информации
        System.out.printf("\nПроцессор: %s\nВидеокарта: %s\nОбъем памяти ЖД: %d\nГб", 
                                    cpu, videoCard, volumeHDD);
        System.out.printf("Диагональ экрана: %.1f\nЦвет: %s\n", screenDiagonal, color);
    }
}
