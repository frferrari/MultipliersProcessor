class Processor {
  def computeMultiplesSum(n: Int, multiples: List[Int]): Int = {
    if (multiples.isEmpty || n == 0) {
      0
    } else {
      (1 to n)
        .toList
        .foldLeft(0) {
          case (acc, current) if isMultipleOfAList(current, multiples) =>
            acc + current
          case (acc, _) =>
            acc
        }
    }
  }

  def isMultipleOfAList(checking: Int, multiples: List[Int]): Boolean = {
    multiples
      .foldLeft(false)((acc, multiple) => isMultipleOf(checking, multiple) | acc)
  }

  def isMultipleOf(checking: Int, multipleOf: Int): Boolean = {
    (checking % multipleOf) == 0
  }
}
