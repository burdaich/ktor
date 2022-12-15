package com.example.database

import kotlinx.serialization.Serializable
import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int

object DBIdTable : Table<DBIdEntity>("users") {
    val id = int("id").bindTo { it.id }
}

interface DBIdEntity : Entity<DBIdEntity> {
    companion object : Entity.Factory<DBIdEntity>()

    @Serializable
    val id: Int
}