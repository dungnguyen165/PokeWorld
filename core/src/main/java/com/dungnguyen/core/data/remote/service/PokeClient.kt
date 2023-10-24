package com.dungnguyen.core.data.remote.service

import com.dungnguyen.core.data.remote.ApiParameter
import com.dungnguyen.core.data.remote.models.pokemon.ApiPaginatedData
import com.dungnguyen.core.data.remote.models.pokemon.detail.ApiPokemon

class PokeClient(val pokeApi: PokeApi) {

    suspend fun getPokemonList(
        page: Int = ApiParameter.FIRST_PAGE,
        limit: Int = ApiParameter.DEFAULT_LIMIT
    ): ApiPaginatedData =
        pokeApi.getPokemonList(
            offset = page * limit,
            limit = limit
        )

    suspend fun getPokemonDetailById(id: String): ApiPokemon =
        pokeApi.getPokemonDetailById(id)

    suspend fun getPokemonDetailByName(name: String): ApiPokemon =
        pokeApi.getPokemonDetailByName(name)
}