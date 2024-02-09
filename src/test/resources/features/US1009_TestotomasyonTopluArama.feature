

  Feature: US1009 kullanici verilen listeddeki tum urunleri aratir

    Scenario Outline: TC17 kullanici listedeki tum urunlerin var oldugunu test eder
      # aranacak urunler phone, java, dress, baby, iphone, samsung

      Given kullanici "toURL" anasayfaya gider
      Then "<aranacakKelime>" icin arama yapar
      And aradigi urunun bulundugunu test eder
      And 1 saniye bekler


      Examples:
      |aranacakKelime|
      |phone         |
      |java          |
      |dress         |
      |baby          |
      |iphone        |
      |samsung       |