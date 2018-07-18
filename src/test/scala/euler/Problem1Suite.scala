import org.scalatest.FunSuite

class Problem1Suite extends FunSuite {
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
