package de.smartsquare.openclose.scraper

import de.smartsquare.openclose.IcecreamBall

interface Scrapable {
    fun scrapeWith(scraper: Scraper): IcecreamBall
}
