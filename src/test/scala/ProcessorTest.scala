import org.scalatest.{Matchers, WordSpec}

class ProcessorTest extends WordSpec with Matchers {
  val processor: Processor = new Processor

  "A multiplier processor" when {
    "given the multipliers 3,5,7 and n=0" should {
      "return 0" in {
        processor.computeMultiplesSum(0, List(3, 5, 7)) shouldEqual 0
      }
    }

    "given the multipliers 3,5,7 and n=11" should {
      "return 40" in {
        processor.computeMultiplesSum(11, List(3, 5, 7)) shouldEqual 40
      }
    }

    "given an empty list of multipliers and n=11" should {
      "return 0" in {
        processor.computeMultiplesSum(11, List.empty[Int]) shouldEqual 0
      }
    }
  }
}
