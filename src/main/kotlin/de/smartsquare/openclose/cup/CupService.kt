package de.smartsquare.openclose.cup

import de.smartsquare.openclose.IcecreamBall
import de.smartsquare.openclose.ScrapedIcecreamball
import de.smartsquare.openclose.topping.ChocolateSprinkles
import de.smartsquare.openclose.topping.Cream
import de.smartsquare.openclose.topping.RainbowSprinkles

class CupService {

    // Darn! This function has too many parameters! Please refactor.
    fun fillCup(
        ballScrapes: List<ScrapedIcecreamball>,
        cream: Cream? = null,
        chocolateSprinkles: ChocolateSprinkles? = null,
        rainbowSprinkles: RainbowSprinkles? = null
    ): Cup {
        return Cup(
            ballScrapes,
            cream,
            chocolateSprinkles,
            rainbowSprinkles
        )
    }
}
