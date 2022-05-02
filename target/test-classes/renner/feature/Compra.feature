Feature: Realizar compra
  Description: Feature para validar a compra de produtos no site

  Scenario: Realizar a compra de três produtos especificos
    Given como um cliente cadastrado no automationpractice
    When eu quero fazer a compra de ao menos três produtos
      | nome                        | cor   | tamanho | Quantidade |
      | Printed Chiffon Dress       | Green | M       |            |
      | Faded Short Sleeve T-shirts | Blue  |         |            |
      | Blouse                      |       |         |          2 |
      | Printed Dress               |       |         |            |
    Then para que eu possa estar bem vestida