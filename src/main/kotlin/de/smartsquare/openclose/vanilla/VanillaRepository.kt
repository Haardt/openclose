package de.smartsquare.openclose.vanilla

import de.smartsquare.openclose.scraper.Scrapable
import de.smartsquare.openclose.scraper.Scraper

class VanillaRepository: Scrapable {

    fun scrapeBall(): VanillaBall {
        return VanillaBall(1.25F)
    }

    override fun scrapeWith(scraper: Scraper) = scraper.scrape(this)
}
