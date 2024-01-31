class Cercle: ObjecteGeometric {
    private var radi: Double

    constructor(radi: Double) {
        this.radi = radi
    }

    constructor(x: Int, y: Int, color: String, radi: Double): super(x, y, color) {
        this.radi = radi
    }

    private fun perimetre(radi: Double): Double {
        return 2 * Math.PI * radi
    }

    private fun area(radi: Double): Double {
        return Math.PI * radi * radi
    }

    override fun toString() : String {
        return "${super.toString()} El perimetre és %.2f i l'àrea és %.2f".format(perimetre(radi), area(radi))
    }
}