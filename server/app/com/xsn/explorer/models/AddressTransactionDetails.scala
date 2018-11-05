package com.xsn.explorer.models

case class AddressTransactionDetails(
    address: Address,
    txid: TransactionId,
    received: BigDecimal = 0,
    sent: BigDecimal = 0)

