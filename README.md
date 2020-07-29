# APIGatewayBank
Los microservicios a los cuales llama este API Gateway son:
 - INFO CLIENT SERVICE (https://github.com/JhojanGuiller/InfoClientService)
 - INFO PRODUCT SERVICE (https://github.com/JhojanGuiller/InfoProductService)
 - BANK ACCOUNT SERVICE (https://github.com/JhojanGuiller/BankAccountService)
 - TRANSACTION SERVICE (https://github.com/JhojanGuiller/TransactionService)

El APIGatewayBank se ejecuta en el puerto 8080

# RUTAS

## INFO CLIENT SERVICE

- Obtener todos los clientes [Metodo GET]
  - http://localhost:8080/clients

- Obtener un cliente por id [Metodo GET]
  - http://localhost:8080/clients/<id>

- Agregar un cliente nuevo [Metodo POST]
  - http://localhost:8080/clients/addClient

- Actualizar un cliente [Metodo PUT]
  - http://localhost:8080/clients/updateClient/<id>

- Eliminar un cliente [Metodo DELETE]
  - http://localhost:8080/clients/deleteClient/<id>

## INFO PRODUCT SERVICE

- Obtener todos los productos [Metodo GET]
  - http://localhost:8080/products

- Obtener un producto por id [Metodo GET]
  - http://localhost:8080/products/<id>

- Agregar un producto nuevo [Metodo POST]
  - http://localhost:8080/products/addProduct

- Actualizar un producto [Metodo PUT]
  - http://localhost:8080/products/updateProduct/<id>

- Eliminar un producto [Metodo DELETE]
  - http://localhost:8080/products/deleteProduct/<id>

## BANK ACCOUNT SERVICE

- Obtener todos las cuentas bancarias [Metodo GET]
  - http://localhost:8080/bankAccounts

- Obtener una cuenta bancaria id [Metodo GET]
  - http://localhost:8080/bankAccounts/<id>

- Agregar una cuenta bancaria nueva [Metodo POST]
  - http://localhost:8080/bankAccounts/addBankAccount

- Actualizar una cuenta bancaria [Metodo PUT]
  - http://localhost:8080/bankAccounts/updateBankAccount/<id>

- Eliminar una cuenta bancaria [Metodo DELETE]
  - http://localhost:8080/bankAccounts/deleteBankAccount/<id>

## TRANSACTION SERVICE

- Obtener todos los productos [Metodo GET]
  - http://localhost:8080/transactions

- Obtener un producto por id [Metodo GET]
  - http://localhost:8080/transactions/<id>

- Agregar un producto nuevo [Metodo POST]
  - http://localhost:8080/transactions/makeTransaction

- Actualizar un producto [Metodo PUT]
  - http://localhost:8080/transactions/updateTransaction/<id>

- Eliminar un producto [Metodo DELETE]
  - http://localhost:8080/transactions/deleteTransaction/<id>
