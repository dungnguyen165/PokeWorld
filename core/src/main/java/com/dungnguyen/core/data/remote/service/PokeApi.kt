package com.dungnguyen.core.data.remote.service

import com.dungnguyen.core.data.remote.ApiEndpoint
import com.dungnguyen.core.data.remote.ApiParameter
import com.dungnguyen.core.data.remote.models.pokemon.ApiPaginatedData
import com.dungnguyen.core.data.remote.models.pokemon.detail.ApiPokemon
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET(ApiEndpoint.POKEMON)
    suspend fun getPokemonList(
        @Query(ApiParameter.OFFSET) offset: Int,
        @Query(ApiParameter.LIMIT) limit: Int,
    ): ApiPaginatedData

    @GET("${ApiEndpoint.POKEMON}/{id}")
    suspend fun getPokemonDetailById(@Path("id") id: String): ApiPokemon

    @GET("${ApiEndpoint.POKEMON}/{name}")
    suspend fun getPokemonDetailByName(@Path("name") name: String): ApiPokemon

}