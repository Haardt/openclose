package de.smartsquare.openclose.malaga

class MalagaRepository {

    fun scrapeBall(): MalagaBall {
        // definitely NO rainins!
        return MalagaBall(1.25F, false)
    }

    fun scrapeBallWithRaisin(): MalagaBall {
        // definitely NO rainins!
        return MalagaBall(1.25F, true)
    }
}
