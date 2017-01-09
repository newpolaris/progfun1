package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def stack(frame: Int, chars: List[Char]): Boolean = {
        if (chars.isEmpty) frame == 0
        else if (chars.head != '(' && chars.head != ')') stack(frame, chars.tail)
        else if (chars.head == '(') stack(frame+1, chars.tail)
        else {
          if (frame <= 0) false
          else stack(frame-1, chars.tail)
        }
      }
      stack(0, chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      def change(money: Int, coins: List[Int]): Int = {
        if (money < 0 || coins.isEmpty) 0
        else if (money == 0) 1
        else {
          change(money - coins.head, coins) + change(money, coins.tail)
        }
      }
      change(money, coins.sorted.reverse)
    }
  }
