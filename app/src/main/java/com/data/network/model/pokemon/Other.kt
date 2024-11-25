package com.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class Other(
    val dream_world: com.data.network.model.pokemon.DreamWorld,
    val home: com.data.network.model.pokemon.Home,
    @SerializedName("official-artwork") val official_artwork: com.data.network.model.pokemon.OfficialArtwork,
    val showdown: com.data.network.model.pokemon.Showdown
)