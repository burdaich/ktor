package com.example.plugins

import com.example.database.repository.IdRepository
import com.example.database.repository.MySQLIdRepository
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    val repository: IdRepository = MySQLIdRepository()
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/ids") {
            call.respond(repository.getAllIds())
        }
    }
}
