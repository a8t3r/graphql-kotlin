package com.expediagroup.graphql.examples.server.ktor.schema.models

import com.expediagroup.graphql.generator.execution.TypeMixin
import graphql.schema.DataFetchingEnvironment

class UniversityMixin : TypeMixin {
    override fun supports() = University::class

    fun uppercaseName(env: DataFetchingEnvironment): String? {
        val university = env.getSource<University>()
        return university.name?.uppercase()
    }
}
