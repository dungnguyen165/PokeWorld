package com.dungnguyen.core.data.remote.models.mapper

import com.dungnguyen.core.data.remote.models.pokemon.ApiPaginatedData

class ApiPaginatedPokemonMapper : ApiMapper<ApiPaginatedData, PaginatedPokemon> {
    override fun mapToDomain(apiEntity: ApiPaginatedData): PaginatedPokemon {
        TODO("Not yet implemented")
    }
}