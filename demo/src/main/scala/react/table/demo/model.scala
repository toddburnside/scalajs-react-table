package react.table.demo

import japgolly.scalajs.react.Reusability

case class Details(year: Int, pickups: Int, color: String)
object Details {
  implicit val reuseDetails: Reusability[Details] = Reusability.derive
}

case class Guitar(id: Int, make: String, model: String, details: Details)

object Guitar {
  implicit val reuseGuitar: Reusability[Guitar] = Reusability.derive
}

case class Person(id: Int, first: String, last: String, age: Int)

object Person {
  implicit val reusePerson: Reusability[Person] = Reusability.derive
}
