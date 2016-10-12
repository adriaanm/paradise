package issue48

class Test {
  @deprecated("", "")
  def foo: Unit = {
    C();
    ()
  }
}

