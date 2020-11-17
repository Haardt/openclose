package de.smartsquare.openclose




data class ScrapedIcecreamball private constructor(val type: IcecreamBall, val diameter: Float) {
    companion object {
        operator fun invoke(type: IcecreamBall, diameter: Float): ScrapedIcecreamball? {
            return if (diameter in 0.5f..2.0f) ScrapedIcecreamball(type, diameter) else null
        }
    }
}

sealed class IcecreamBall {
    object ChocolateBall : IcecreamBall()
    object MalagenBall : IcecreamBall()
    object StraciatellaBall : IcecreamBall()
    object StrawberryBall : IcecreamBall()
    object VanillaBall : IcecreamBall()
}

sealed class Scrape {
    data class Success(val icecreamball: ScrapedIcecreamball) : Scrape()
    object Empty : Scrape()
}
