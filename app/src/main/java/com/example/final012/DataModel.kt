package com.example.final012

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DataModel(

    @Expose
    @SerializedName("title")
    val title: String,
    @Expose
    @SerializedName("url")
    val url: String,
    @Expose
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: String

)