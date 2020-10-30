package de.smartsquare.openclose.strawberry

import de.smartsquare.openclose.scraper.Scrapable
import de.smartsquare.openclose.scraper.Scraper

class StrawberryRepository: Scrapable {

    fun scrapeBall(): StrawberryBall {
        return StrawberryBall(1.25F)
    }

    override fun scrapeWith(scraper: Scraper) = scraper.scrape(this)
}
