import java.util.ArrayList;
import java.util.HashMap;


public class LaptopShop {
    
    String shopName;
    ArrayList<Laptop> assortment = new ArrayList<Laptop>();
    
    
    public void findingRight(HashMap<String, Object> request) {
        int count = 0;

        int ram = new Integer(request.get("ram").toString());
        String color = request.get("color").toString();
        int volumeHDD = new Integer(request.get("volumeHDD").toString());
        double screenDiagonal = new Double(request.get("screenDiagonal").toString());
        int numberProcessorCores = new Integer(request.get("numberProcessorCores").toString());

        for (Laptop laptop : assortment) {
            if (laptop.color.equals(color) & laptop.ram>=ram 
            & laptop.volumeHDD>=volumeHDD & laptop.screenDiagonal>=screenDiagonal 
            & laptop.numberProcessorCores>=numberProcessorCores) {
            
                    laptop.printMinInfo();
                    count++;
            }
        }
        if (count==0) {
            System.out.println("Подходящих вариантов не найдено");
        }    
    }
    

    public void laptopGenerator(int amount) {
        // Генератор ноутбуков

        String[] videoCards = new String[]{"AMD Radeon R7 M340", "AMD Radeon RX Vega M GL/870", 
                                           "AMD Radeon RX 560X", "NVIDIA GeForce GTX 1080 SLI"};
        int[] videoMemory = new int[]{4, 6, 8, 10};
        double[] cpuFrequency = new double[]{2.4, 3.2, 4.6, 5.0, 6.4};
        String[] cpu = new String[]{"AMD Ryzen 9 6980HX", "Intel Core i9 12900HK", 
                                           "AMD Ryzen 5 6600H", "Intel Core i5-12600H"};
        int[] numberProcessorCores = new int[]{4, 6, 8, 16};
        int[] ram = new int[]{4, 8, 16, 32};
        String[] ramType = new String[]{"DDR3", "DDR2", "DDR4", "DIMM", "SIMM"};
        int[] volumeHDD = new int[]{128, 256, 512, 1000};
        String[] operatingSystem = new String[]{"Mac OS", "Linux", "Windows"};
        String[] colors = new String[]{"black", "red", "white", "blue"};
        double[] screenDiagonal = new double[]{11, 12, 13.3, 14, 15, 15.4, 19};
        double[] weight = new double[]{3, 5, 7, 10, 15, 20};
        String[] manufacturerCountry = new String[]{"China", "Vietnam", "Belarus"};
        
        for (int i = 0; i < amount; i++) {
            Laptop l = new Laptop();
            l.cpu = cpu[(int) (Math.random()*cpu.length)];
            l.numberProcessorCores = numberProcessorCores[(int) (Math.random()*numberProcessorCores.length)];
            l.cpuFrequency = cpuFrequency[(int) (Math.random()*cpuFrequency.length)];
            l.ram = ram[(int) (Math.random()*ram.length)];
            l.ramType = ramType[(int) (Math.random()*ramType.length)];
            l.volumeHDD = volumeHDD[(int) (Math.random()*volumeHDD.length)];
            l.videoCard = videoCards[(int) (Math.random()*videoCards.length)];
            l.videoMemory = videoMemory[(int) (Math.random()*videoMemory.length)];
            l.operatingSystem = operatingSystem[(int) (Math.random()*operatingSystem.length)];
            l.screenDiagonal = screenDiagonal[(int) (Math.random()*screenDiagonal.length)];
            l.weight = weight[(int) (Math.random()*weight.length)];
            l.color = colors[(int) (Math.random()*colors.length)];
            l.manufacturerCountry = manufacturerCountry[(int) (Math.random()*manufacturerCountry.length)];
            assortment.add(l);
        }
    }
}
