package com.jetcomproject.data.remote.dto


import com.google.gson.annotations.SerializedName

data class CharacterDto(
    @SerializedName("info")
    val info: InfoDto?,
    @SerializedName("results")
    val results: List<ResultDto?>?
)