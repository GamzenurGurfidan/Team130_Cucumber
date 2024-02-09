
  Feature: US1007 Sauce demo alisveis sepeti testi
@e2e
    Scenario: TC15 kullanici sectigi urunu sepete ekleyebilmeli

      Given kullanici "sauceURL" anasayfaya gider
      And 2 saniye bekler
      Then saucedemo username kutusuna "standard_user" yazar
      And saucedemo password kutusuna "secret_sauce" yazar
      And 2 saniye bekler
      Then saucedemo login tusuna basar
      And ilk urunun ismini kaydeder ve bu urunun sayfasina gider
      When saucedemo add to Cart butonuna basar
      Then saucedemo alisveris sepetine tiklar
      And 2 saniye bekler
      And sectigi urunun basarili olarak sepete eklendigini test eder
      And 2 saniye bekler
      And sayfayi kapatir