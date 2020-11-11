package de.smartsquare.openclose.malaga

import de.smartsquare.openclose.scraper.Scrapeable
import de.smartsquare.openclose.scraper.Scraper

class MalagaRepository: Scrapeable {

    fun scrapeBall(): MalagaBall {
        // definitely NO rainins!
        return MalagaBall(1.25F, false)
    }

    fun scrapeBallWithRaisin(): MalagaBall {
        return MalagaBall(1.25F, true)
    }

    override fun scrapeWith(scraper: Scraper) = scraper.scrape(this)
}
