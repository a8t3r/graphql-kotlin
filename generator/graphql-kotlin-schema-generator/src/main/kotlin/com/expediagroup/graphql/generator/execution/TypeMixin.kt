package com.expediagroup.graphql.generator.execution

import kotlin.reflect.KClass

interface TypeMixin {
    fun supports(): KClass<*>
}
