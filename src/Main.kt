fun main() {
    println("\nCERCLES")
    val cercle1: Cercle = Cercle(3.0)
    val cercle2: Cercle = Cercle(2,8, "blau", 3.0)
    println(cercle1.toString())
    println(cercle2.toString())

    println("\nRECTANGLES")
    val rectangle1: Rectangle = Rectangle(3.0, 5.0)
    val rectangle2: Rectangle = Rectangle(3, 8, "vermell", 9.5, 4.5)
    println(rectangle1.toString())
    println(rectangle2.toString())

    println("\nTRIANGLES")
    val triangle1: Triangle = Triangle(5.0, 9.5)
    val triangle2: Triangle = Triangle(3, 5, "verd", 7.1, 3.2)
    println(triangle1.toString())
    println(triangle2.toString())

    println("\nQUADRATS")
    val quadrat1: Rectangle = Quadrat(7.7)
    val quadrat2: Rectangle = Quadrat(11, 12, "groc", 8.8)
    println(quadrat1.toString())
    println(quadrat2.toString())
}