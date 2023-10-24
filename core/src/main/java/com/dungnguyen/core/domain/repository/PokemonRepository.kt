package com.dungnguyen.core.domain.repository

import com.dungnguyen.core.domain.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    fun getPokemonList(): Flow<List<Pokemon>>

    suspend fun getMorePokemon(page: Int, limit: Int): PaginatedPokemon

    suspend fun storePokemon(pokemon: List<Pokemon>)

    suspend fun getPokemonDetailById(id: String): Pokemon

    suspend fun getPokemonDetailByName(name: String): Pokemon
}