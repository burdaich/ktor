package com.example.database.repository

import com.example.database.model.IdResponse

interface IdRepository {
    fun getAllIds(): List<IdResponse>
}