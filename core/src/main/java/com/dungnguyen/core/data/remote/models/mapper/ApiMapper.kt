package com.dungnguyen.core.data.remote.models.mapper

interface ApiMapper<A, D> {
    fun mapToDomain(apiEntity: A): D
}