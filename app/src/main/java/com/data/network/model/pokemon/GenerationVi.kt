package com.data.network.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire") val omegaruby_alphasapphire: com.data.network.model.pokemon.OmegarubyAlphasapphire,
    @SerializedName("x-y") val x_y: com.data.network.model.pokemon.XY
)