package de.smartsquare.openclose

import de.smartsquare.openclose.Scrape.Empty
import de.smartsquare.openclose.Scrape.Success


class IcecreamballRepository() {
    fun scrapeBall(type: IcecreamBall, diameter: Float): Scrape {
        return ScrapedIcecreamball(type, diameter).let { if (it != null) Success(it) else Empty }
    }
}
