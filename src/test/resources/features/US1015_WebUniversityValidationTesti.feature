
  Feature: US1015 WebUniversity sayfasinda yanlis bilgilerle giris yapılamamali

    Scenario: TC23 yanlis bilgilerle giris yapilamadigini test eder

      Given kullanici "webUniURL" anasayfaya gider
      Then Login Portal a  kadar asagi iner
      And  Login Portal a tiklar
      Then acilan ikinci window'a gecer
      And username ve password kutularina fake degerler yazdirir
      And login butonuna basar
      Then Popup ta cikan yazinin "validation failed" oldugunu test eder
      And Ok diyerek Popup'i kapatir
      When Ilk sayfaya geri doner
      Then Ilk sayfaya donuldugunu test eder
      And sayfayi kapatir