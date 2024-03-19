package com.example.customclock.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class Template(
    var baseColor: Int,
    var textColor: Int,
    var frameColor: Int,
    var dotsColor: Int,
    var hourHandColor: Int,
    var minuteHandColor: Int,
    var secondHandColor: Int
) : Parcelable
