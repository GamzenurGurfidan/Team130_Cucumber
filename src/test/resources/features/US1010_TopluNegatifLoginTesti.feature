
  Feature: US1010 kullanici verilen yanlis bilgilerle giris yapamaz

    Scenario Outline: TC18 yanlis bilgilerle giris yapılamadigini test eder

      Given kullanici "toURL" anasayfaya gider
      Then account butonuna basar
      When email olarak listeden "<siradakiEmail>" girer
      And password olarak listeden "<siradakiPassword>" girer
      Then signIn butonuna basar
      And sisteme giris yapamadigini test eder
      And 1 saniye bekler

      Examples:
      |siradakiEmail    |siradakiPassword|
      | banu@gmail.com  |  898989        |
      |sedat@yahoo.com  |  989887        |
      |orkong@tmail.com |  122334        |
      |fatih@hotmail.com|  454545        |
      |arzu@senmail.com |  676767        |
      |mehmet@mynet.com |  878987        |