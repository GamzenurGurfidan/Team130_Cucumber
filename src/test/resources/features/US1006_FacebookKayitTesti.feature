
  Feature: Kullanici facebooka kayit icin form doldurabilmeli

    Scenario: TC14 faker class ile kullanici formu doldurabilmeli

      Given kullanici "faceURL" anasayfaya gider
      Then facebook cookies kabul eder
      And facebook'da yeni hesap olustur butonuna basar
      And 1 saniye bekler
      When Faker class'indan bilgilerle facebook kayit formunu doldurur
      Then 2 saniye bekler
      And facebook kayit ol tusuna basar
      Then 2 saniye bekler