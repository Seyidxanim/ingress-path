package lesson_17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        List<Integer> list1 = list.stream()
                .map(n -> n * 2)
                .filter(n -> n > 5)
                .sorted()
                .toList();

       // System.out.println(list1);


        //customer - name,age,spending city
        //constructor getter bir to string
        //customer pupline class main daxilinde
        //seherde qarisiq yaz streamda kecin yasi 30 ve ondan cox xerc 1500 yuxari
        //seherin adlarini standartlasdir ilk herf boyuk/
        //10 % vergi tut
        //xercine gore azalan sira ile
        //yas qruplarina ayir eger yas 40 dan asagidirsa genc, 50 den balacadirsa 40-50 eks halda yashli
        //age qrupunu goster
    }
}
