open class Rectangle: ObjecteGeometric {
    public var base: Double
    private var alcada: Double

    constructor(base: Double, alcada: Double) {
        this.base = base
        this.alcada = alcada
    }

    constructor(x: Int, y: Int, color: String, base: Double, alcada: Double): super(x, y, color) {
        this.base = base
        this.alcada = alcada
    }

    open fun perimetre(base: Double, alcada: Double): Double {
        return (2 * base) + (2 * alcada)
    }

    open fun area(base: Double, alcada: Double): Double {
        return base * alcada
    }

    override fun toString(): String {
        return "${super.toString()} El perimetre és %.2f i l'àrea és %.2f".format(perimetre(base, alcada), area(base, alcada))
    }
}