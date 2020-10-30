package de.smartsquare.openclose

import de.smartsquare.openclose.cup.Cup
import de.smartsquare.openclose.cup.CupService
import de.smartsquare.openclose.scraper.Scrapable
import de.smartsquare.openclose.scraper.TryAllIcecreamBallsScraper
import de.smartsquare.openclose.topping.Cream

class CounterService(
    private val scrapables: List<Scrapable>,
    private val cupService: CupService
) {

    fun serveIcecream(): Cup {
        val balls = scrapables.map { it.scrapeWith(TryAllIcecreamBallsScraper()) }
        return cupService.fillCup(
            balls,
            Cream(0.5F, true),
            null,
            null
        )
    }
}
