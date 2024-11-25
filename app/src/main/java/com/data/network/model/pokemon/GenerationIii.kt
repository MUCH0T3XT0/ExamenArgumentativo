package com.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: com.data.network.model.pokemon.Emerald,
    @SerializedName("firered-leafgreen") val firered_leafgreen: com.data.network.model.pokemon.FireredLeafgreen,
    @SerializedName("ruby-sapphire") val ruby_sapphire: com.data.network.model.pokemon.RubySapphire
)