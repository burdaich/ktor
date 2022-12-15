package com.example.database.repository

import com.example.database.DatabaseManager
import com.example.database.model.IdResponse

class MySQLIdRepository : IdRepository {

    private val database = DatabaseManager()

    override fun getAllIds(): List<IdResponse> = database.getAllIds().map { IdResponse(it.id) }
}