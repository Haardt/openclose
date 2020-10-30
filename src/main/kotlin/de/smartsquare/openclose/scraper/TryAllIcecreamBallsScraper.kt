package de.smartsquare.openclose.scraper

import de.smartsquare.openclose.chocolate.ChocolateRepository
import de.smartsquare.openclose.malaga.MalagaRepository
import de.smartsquare.openclose.scraper.Scraper
import de.smartsquare.openclose.straciatella.StraciatellaRepository
import de.smartsquare.openclose.strawberry.StrawberryRepository
import de.smartsquare.openclose.vanilla.VanillaRepository

class TryAllIcecreamBallsScraper: Scraper {
    override fun scrape(chocolateRepository: ChocolateRepository) = chocolateRepository.scrapeBall()

    override fun scrape(malagaRepository: MalagaRepository) = malagaRepository.scrapeBall()

    override fun scrape(straciatellaRepository: StraciatellaRepository) = straciatellaRepository.scrapeBall()

    override fun scrape(strawberryRepository: StrawberryRepository) = strawberryRepository.scrapeBall()

    override fun scrape(vanillaRepository: VanillaRepository) = vanillaRepository.scrapeBall()
}
