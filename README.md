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
  - http://localhost:8080/clients/{idCliente}

- Agregar un cliente nuevo [Metodo POST]
  - http://localhost:8080/clients/addClient

- Actualizar un cliente [Metodo PUT]
  - http://localhost:8080/clients/updateClient/{idCliente}

- Eliminar un cliente [Metodo DELETE]
  - http://localhost:8080/clients/deleteClient/{idCliente}

## INFO PRODUCT SERVICE

- Obtener todos los productos [Metodo GET]
  - http://localhost:8080/products

- Obtener un producto por id [Metodo GET]
  - http://localhost:8080/products/{idProducto}

- Agregar un producto nuevo [Metodo POST]
  - http://localhost:8080/products/addProduct

- Actualizar un producto [Metodo PUT]
  - http://localhost:8080/products/updateProduct/{idProducto}

- Eliminar un producto [Metodo DELETE]
  - http://localhost:8080/products/deleteProduct/{idProducto}

## BANK ACCOUNT SERVICE

- Obtener todas las cuentas bancarias [Metodo GET]
  - http://localhost:8080/bankAccounts

- Obtener una cuenta bancaria id [Metodo GET]
  - http://localhost:8080/bankAccounts/{idCuenta}

- Agregar una cuenta bancaria nueva [Metodo POST]
  - http://localhost:8080/bankAccounts/addBankAccount

- Actualizar una cuenta bancaria [Metodo PUT]
  - http://localhost:8080/bankAccounts/updateBankAccount/{idCuenta}

- Eliminar una cuenta bancaria [Metodo DELETE]
  - http://localhost:8080/bankAccounts/deleteBankAccount/{idCuenta}

## TRANSACTION SERVICE

- Obtener todas las transacciones [Metodo GET]
  - http://localhost:8080/transactions

- Obtener una transaccion por id [Metodo GET]
  - http://localhost:8080/transactions/{idTransaccion}

- Agregar una transaccion nueva [Metodo POST]
  - http://localhost:8080/transactions/makeTransaction

- Actualizar una transaccion [Metodo PUT]
  - http://localhost:8080/transactions/updateTransaction/{idTransaccion}

- Eliminar una transaccion [Metodo DELETE]
  - http://localhost:8080/transactions/deleteTransaction/{idTransaccion}

- Realizar una transaccion (Deposito / Retiro) [Metodo POST]
  - http://localhost:8080/transactions/makeTransaction
