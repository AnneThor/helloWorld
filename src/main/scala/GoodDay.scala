case class GoodDay(value: String)

object GoodDay { self =>
  def getValue = System.out.println(self)
}
