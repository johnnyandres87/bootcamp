package javabasic.Exercise3;

public class Main {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Nokia","00001","NokiaInc","Litium",
                "Movistar","pianoBlack","000001");
        SmartWatch smartWatch = new SmartWatch("WatchGT","00002","Huawei","litium",
                "red","00001");

        System.out.println("El nombre del smartphone es:\n"+ smartPhone.getName()+"\n"+
                "El codigo del smartphone es:\n"+ smartPhone.getCode()+"\n"+
                "El fabricante del smartphone es:\n"+ smartPhone.getManufacturer()+"\n"+
                "la bateria  del smartphone es:\n"+ smartPhone.getBatery()+"\n"+
                "El color del smartphone es:\n"+ smartPhone.getColor()+"\n");

        System.out.println("El nombre del smartwatch es:\n"+ smartWatch.getName()+"\n"+
                "El codigo del smartwatch es:\n"+ smartWatch.getCode()+"\n"+
                "El fabricante del smartwatch es:\n"+ smartWatch.getManufacturer()+"\n"+
                "la bateria  del smartwatch es:\n"+ smartWatch.getBatery()+"\n"+
                "El color del smartwatch es:\n"+ smartWatch.getColor()+"\n");
    }
}
