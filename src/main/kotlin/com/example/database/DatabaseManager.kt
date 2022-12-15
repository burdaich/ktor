package com.example.database

import org.ktorm.database.Database
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList

class DatabaseManager {

    private val hostname = "sqldbgistek.database.windows.net"
    private val port = 1433
    private val username = "gistek_dev"
    private val password = "Ubiquos2022"
    private val databaseName = "StagingUbiquos"

    private val ktormDataBase: Database = Database.connect(
        "jdbc:sqlserver://$hostname:$port;databaseName=$databaseName",
        "com.microsoft.sqlserver.jdbc.SQLServerDriver",
        user = username,
        password = password
    )

    fun getAllIds() = ktormDataBase.sequenceOf(DBIdTable).toList()

}