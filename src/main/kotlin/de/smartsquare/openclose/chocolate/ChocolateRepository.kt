package de.smartsquare.openclose.chocolate

import de.smartsquare.openclose.scraper.Scrapeable
import de.smartsquare.openclose.scraper.Scraper

class ChocolateRepository: Scrapeable {

    fun scrapeBall(): ChocolateBall {
        return ChocolateBall(1.25F)
    }

    override fun scrapeWith(scraper: Scraper) = scraper.scrape(this)
}
