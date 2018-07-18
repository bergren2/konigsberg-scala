object Problem1 {
  def solution(limit: Int): Int = {
    var sum = 0

    // need: modulo, iterate over numbers
    for (i <- 1 to limit - 1) {
      if (i % 3 == 0) sum += i
      else if (i % 5 == 0) sum += i
    }

    sum
  }
}
