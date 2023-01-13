package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C02_Priority {

    // TestNG (default) olarak @Test annotationları alfabetik sıraya göre execute ederutgc
    // TestNG prioritysinin sayi degeri en az olan testi ilk once calistirir
    // Priporty attribute u icin negatif degerler kullanilabilir
    // // TestNG default (varsayilan) priority = 0 dir


    @Test(priority =1 )
    public void test02() {
        System.out.println("abc");
    }

    @Test(priority =2 ,enabled = false )
    public void test04() {
        System.out.println("b");
    }


    @Test(priority =3 )
    public void test03() {
        System.out.println("c");
    }

}
