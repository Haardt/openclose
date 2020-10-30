package de.smartsquare.openclose

import de.smartsquare.openclose.chocolate.ChocolateRepository
import de.smartsquare.openclose.cup.CupService
import de.smartsquare.openclose.malaga.MalagaRepository
import de.smartsquare.openclose.straciatella.StraciatellaRepository
import de.smartsquare.openclose.strawberry.StrawberryRepository
import de.smartsquare.openclose.vanilla.VanillaRepository

fun main() {
    val counterService = CounterService(
        listOf(
            { ChocolateRepository().run { scrapeBall() } },
            { MalagaRepository().run { scrapeBall() } },
            { MalagaRepository().run { scrapeBallWithRaisin() } },
            { StraciatellaRepository().run { scrapeBall() } },
            { StrawberryRepository().run { scrapeBall() } },
            { VanillaRepository().run { scrapeBall() } }),
        CupService()
    )

    val cup = counterService.serveIcecream()
    println(cup.toString())
    println("Yummy!")
}
