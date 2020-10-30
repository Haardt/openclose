package de.smartsquare.openclose.scraper

import de.smartsquare.openclose.chocolate.ChocolateBall
import de.smartsquare.openclose.chocolate.ChocolateRepository
import de.smartsquare.openclose.malaga.MalagaBall
import de.smartsquare.openclose.malaga.MalagaRepository
import de.smartsquare.openclose.straciatella.StraciatellaBall
import de.smartsquare.openclose.straciatella.StraciatellaRepository
import de.smartsquare.openclose.strawberry.StrawberryBall
import de.smartsquare.openclose.strawberry.StrawberryRepository
import de.smartsquare.openclose.vanilla.VanillaBall
import de.smartsquare.openclose.vanilla.VanillaRepository

interface Scraper {
    fun scrape(chocolateRepository: ChocolateRepository): ChocolateBall
    fun scrape(malagaRepository: MalagaRepository): MalagaBall
    fun scrape(straciatellaRepository: StraciatellaRepository): StraciatellaBall
    fun scrape(strawberryRepository: StrawberryRepository): StrawberryBall
    fun scrape(vanillaRepository: VanillaRepository): VanillaBall
}
