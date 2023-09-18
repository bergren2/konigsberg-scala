import org.scalatest.funsuite.AnyFunSuite

class Problem2Suite extends AnyFunSuite {
  test("simpler problem") {
    assertResult(44) {
      Problem2.solution(90)
    }
  }

  test("harder problem") {
    assertResult(4613732) {
      Problem2.solution(4000000)
    }
  }
}
