package chapter12.machines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransportDemo {
    public static void main(String[] args) throws IOException {
        // Дефиниране на екземпляр от изброим тип
        Transport vehicle;

        // Инициализиране
        vehicle = Transport.BUS;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().trim().toLowerCase();
        vehicle = choose(str);

        if(vehicle == Transport.CAR){
            System.out.println(Transport.CAR);
        }
        else if(vehicle == Transport.VAN){
            System.out.println(Transport.VAN);
        }
        else if(vehicle == Transport.BUS){
            System.out.println(Transport.BUS);
        }
        else if(vehicle == Transport.LORRY){
            System.out.println(Transport.LORRY);
        }
        else if(vehicle == Transport.TRAIN){
            System.out.println(Transport.TRAIN);
        }
        else if(vehicle == Transport.AIRPLANE){
            System.out.println(Transport.AIRPLANE);
        }


        int fuel = 0;

        switch (vehicle){
            case CAR: fuel = 60; break;
            case VAN: fuel = 120; break;
            case BUS: fuel = 280; break;
            case LORRY: fuel = 380; break;
            case TRAIN: fuel = 2800; break;
            case AIRPLANE: fuel = 6000; break;
            default: break;
        }

        System.out.printf("The fuel of the %s is %d.%n", vehicle, fuel);

        reader.close();
    }

    static Transport choose(String str){
        switch (str){
            case "car": return Transport.CAR;
            case "van": return Transport.VAN;
            case "bus": return Transport.BUS;
            case "lorry": return Transport.LORRY;
            case "train": return Transport.TRAIN;
            case "airplane": return Transport.AIRPLANE;
            default: return Transport.CAR;
        }
    }
}
