package de.smartsquare.openclose.cup

import de.smartsquare.openclose.IcecreamBall
import de.smartsquare.openclose.ScrapedIcecreamball
import de.smartsquare.openclose.topping.ChocolateSprinkles
import de.smartsquare.openclose.topping.Cream
import de.smartsquare.openclose.topping.RainbowSprinkles

data class Cup(
    val balls: List<ScrapedIcecreamball>,
    val cream: Cream?,
    val chocolateSprinkles: ChocolateSprinkles?,
    val rainbowSprinkles: RainbowSprinkles?,
)
