package de.smartsquare.openclose.chocolate

import de.smartsquare.openclose.scraper.Scrapable
import de.smartsquare.openclose.scraper.Scraper

class ChocolateRepository: Scrapable {

    fun scrapeBall(): ChocolateBall {
        return ChocolateBall(1.25F)
    }

    override fun scrapeWith(scraper: Scraper) = scraper.scrape(this)
}
