package de.smartsquare.openclose

import de.smartsquare.openclose.IcecreamBall.*
import de.smartsquare.openclose.cup.CupService


fun main() {
    val counterService = CounterService(
        IcecreamballRepository(),
        CupService()
    )

    val cup = counterService.serveIcecream(
        listOf(
            ChocolateBall,
            MalagenBall,
            StraciatellaBall,
            StrawberryBall,
            VanillaBall
        )
    )
    println(cup.toString())
    println("Yummy!")
}
