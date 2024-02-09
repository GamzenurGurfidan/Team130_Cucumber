

  Feature: US1003 kullanici parametre olarak verilen urunu aratabilmeli
    @deneme
    Scenario: TC07 parametre ile arama yapabilmeli
      Given kullanici Testotomasyon sayfasina gider
      And "baby" icin arama yapar
      Then aradigi urunun bulundugunu test eder
      And 1 saniye bekler


    Scenario: TC08 kullanici nutella icin sonuc bulunamamali
      Given kullanici Testotomasyon sayfasina gider
      And "nutella" icin arama yapar
      And 3 saniye bekler
      Then aradigi urunun bulundugunu test eder



    Scenario: TC09 parametre ile arama yapabilmeli
      Given kullanici Testotomasyon sayfasina gider
      And "iphone" icin arama yapar
      Then aradigi urunun bulundugunu test eder
