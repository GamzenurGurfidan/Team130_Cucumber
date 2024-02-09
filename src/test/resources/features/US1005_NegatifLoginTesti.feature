

Feature: US1005 gecersiz bilgilerle sisteme giris yapilamamali

   
  Scenario: TC11 Gercerli email, gecersiz password ile sisteme giris yapılamaz

    Given kullanici "toURL" anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler


  Scenario: TC12 Gercersiz email, gecerli password ile sisteme giris yapılamaz

    Given kullanici "toURL" anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecerliPassword" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler


  Scenario: TC13 Gercersiz email, gecersiz password ile sisteme giris yapılamaz

    Given kullanici "toURL" anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecersizEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler