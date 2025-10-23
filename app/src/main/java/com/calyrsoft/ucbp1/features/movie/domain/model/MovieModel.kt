package com.calyrsoft.ucbp1.features.movie.domain.model

import com.calyrsoft.ucbp1.features.github.domain.model.UrlPath
import kotlinx.serialization.Serializable

@Serializable
data class MovieModel(
    val id: Int,
    val pathUrl: UrlPath,
    val title: String,
    val rating: Int = 0,
    val overview: String = "",
    val voteAverage: Double = 0.0,
    val releaseDate: String = "",
    val posterPath: String = "",
    val popularity: Double = 0.0,
    val voteCount: Int = 0,
    val originalLanguage: String = ""
)