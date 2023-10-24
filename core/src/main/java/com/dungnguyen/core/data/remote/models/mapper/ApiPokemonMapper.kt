package com.dungnguyen.core.data.remote.models.mapper

import com.dungnguyen.core.data.remote.models.pokemon.detail.ApiPokemon
import com.dungnguyen.core.domain.model.Pokemon

class ApiPokemonMapper : ApiMapper<ApiPokemon, Pokemon> {
    override fun mapToDomain(apiEntity: ApiPokemon): Pokemon {
        TODO("Not yet implemented")
    }
}