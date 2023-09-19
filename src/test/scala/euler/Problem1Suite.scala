import org.scalatest.funsuite.AnyFunSuite

class Problem1Suite extends AnyFunSuite {
  test("simpler problem") {
    assertResult(23) {
      Problem1.solution(10)
    }
  }

  test("harder problem") {
    assertResult(233168) {
      Problem1.solution(1000)
    }
  }
}
