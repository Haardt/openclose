package de.smartsquare.openclose

import de.smartsquare.openclose.cup.Cup
import de.smartsquare.openclose.cup.CupService
import de.smartsquare.openclose.topping.Cream

class CounterService(
    private val icecreameRepository: IcecreamballRepository,
    private val cupService: CupService
) {

    fun serveIcecream(icecreamBalls: List<IcecreamBall>): Cup {
        val balls = icecreamBalls.map { icecreameRepository.scrapeBall(it, 1.0f) }
        return cupService.fillCup(
            balls.filterIsInstance<Scrape.Success>().map { it.icecreamball },
            Cream(0.5F, true),
            null,
            null
        )
    }
}
