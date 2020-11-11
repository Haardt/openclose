package de.smartsquare.openclose.straciatella

import de.smartsquare.openclose.scraper.Scrapeable
import de.smartsquare.openclose.scraper.Scraper

class StraciatellaRepository: Scrapeable {

    fun scrapeBall(): StraciatellaBall {
        return StraciatellaBall(1.25F)
    }

    override fun scrapeWith(scraper: Scraper) = scraper.scrape(this)
}
