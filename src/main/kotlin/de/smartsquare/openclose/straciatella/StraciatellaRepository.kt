package de.smartsquare.openclose.straciatella

import de.smartsquare.openclose.scraper.Scrapable
import de.smartsquare.openclose.scraper.Scraper

class StraciatellaRepository: Scrapable {

    fun scrapeBall(): StraciatellaBall {
        return StraciatellaBall(1.25F)
    }

    override fun scrapeWith(scraper: Scraper) = scraper.scrape(this)
}
