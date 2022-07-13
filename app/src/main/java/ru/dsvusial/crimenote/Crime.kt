package ru.dsvusial.crimenote

import java.util.*
//Model component
data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title : String,
    var date : Date = Date( ),
    var isSolved : Boolean
)
