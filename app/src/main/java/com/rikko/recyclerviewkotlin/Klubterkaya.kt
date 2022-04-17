package com.rikko.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Klubterkaya(
    val imgKlubterkaya: Int,
    val nameKlubterkaya: String,
    val descKlubterkaya: String,
) :Parcelable
