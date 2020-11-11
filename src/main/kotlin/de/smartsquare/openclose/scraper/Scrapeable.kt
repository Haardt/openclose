package de.smartsquare.openclose.scraper

import de.smartsquare.openclose.IcecreamBall

interface Scrapeable {
    fun scrapeWith(scraper: Scraper): IcecreamBall
}
