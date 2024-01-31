class Triangle: ObjecteGeometric {
    private var base: Double
    private var alcada: Double

    constructor(base: Double, alcada: Double) {
        this.base = base
        this.alcada = alcada
    }

    constructor(x: Int, y: Int, color: String, base: Double, alcada: Double): super(x, y, color) {
        this.base = base
        this.alcada = alcada
    }

    // suposo que es tracta de triangles equilaters
    private fun perimetre(base: Double): Double {
        return base * 3
    }

    private fun area(base: Double, alcada: Double): Double {
        return (base * alcada) / 2
    }

    override fun toString(): String {
        return "${super.toString()} El perimetre és %.2f i l'àrea és %.2f".format(perimetre(base), area(base, alcada))
    }
}