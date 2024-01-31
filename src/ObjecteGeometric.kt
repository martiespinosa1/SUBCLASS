open abstract class ObjecteGeometric {
    protected var x : Int = 0
    protected var y : Int = 0
    protected var color: String = "blanc"

    constructor()

    constructor(x: Int, y: Int, color: String) {
        this.x = x
        this.y = y
        this.color = color
    }

    // he tret els getters i setters pel problema que hi havia al tractarse de variables protected i ja crear-se implicitament

    override fun toString(): String {
        return "Les coordenades de la fgura són ($x,$y) i el color es $color."
    }
}