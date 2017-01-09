def sqrt(x: Double) = {
  def improve(guess: Double) = (guess + x/guess) / 2
  def isGoodEnough(guess: Double) = {
    math.abs(guess*guess - x)/x < 0.0000000000001
  }
  def sqrtIter(guess: Double): Double = {
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))
  }
  sqrtIter(x/2)
}
sqrt(2.0) - math.sqrt(2.0)
sqrt(0.001) - math.sqrt(0.001)
sqrt(0.1e-20) - math.sqrt(0.1e-20)
sqrt(1.0e20) - math.sqrt(1.0e20)
sqrt(1.0e50) - math.sqrt(1.0e50)
sqrt(1.0e60) - math.sqrt(1.0e60)
