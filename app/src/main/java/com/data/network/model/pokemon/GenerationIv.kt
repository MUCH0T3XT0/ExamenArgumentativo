package com.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl") val diamond_pearl: com.data.network.model.pokemon.DiamondPearl,
    @SerializedName("heartgold-soulsilver") val heartgold_soulsilver: com.data.network.model.pokemon.HeartgoldSoulsilver,
    val platinum: com.data.network.model.pokemon.Platinum
)