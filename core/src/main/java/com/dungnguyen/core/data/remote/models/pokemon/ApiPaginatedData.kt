package com.dungnguyen.core.data.remote.models.pokemon


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiPaginatedData(
    @Json(name = "count")
    val count: Int?,
    @Json(name = "next")
    val next: String?,
    @Json(name = "previous")
    val previous: Any?,
    @Json(name = "results")
    val results: List<Result?>?
) {
    @JsonClass(generateAdapter = true)
    data class Result(
        @Json(name = "name")
        val name: String?,
        @Json(name = "url")
        val url: String?
    )
}