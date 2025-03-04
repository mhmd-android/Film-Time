package io.filmtime.feature.movie.detail

import io.filmtime.data.model.CreditItem
import io.filmtime.data.model.GeneralError

data class MovieDetailCreditState(
  val isLoading: Boolean = false,
  val credit: List<CreditItem> = emptyList(),
  val message: String? = null,
  val error: GeneralError? = null,
)
