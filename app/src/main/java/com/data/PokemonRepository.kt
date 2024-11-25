package com.data

import com.data.network.NetworkModuleDI
import com.data.network.model.PokedexObject
import com.data.network.PokemonAPIService
import com.data.network.PokemonApiClient
import com.data.network.model.pokemon.Pokemon

class PokemonRepository() {
    private val apiPokemon = PokemonApiClient()

    suspend fun getPokemonList(limit:Int): PokedexObject? = apiPokemon.getPokemonList(limit)

    suspend fun getPokemonInfo(numberPokemon:Int): Pokemon?  = apiPokemon.getPokemonInfo(numberPokemon)
}