class Quadrat: Rectangle {

    constructor(base: Double): super(base, base) {
    }

    constructor(x: Int, y: Int, color: String, base: Double): super(x, y, color, base, base) {
    }

    override fun perimetre(base: Double, alcada: Double): Double {
        return base * 4
    }

    override fun area(base: Double, alcada: Double): Double {
        return base * base
    }

    override fun toString(): String {
        return super.toString()
    }
}