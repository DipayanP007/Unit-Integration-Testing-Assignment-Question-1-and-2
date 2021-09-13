package CheckEmailID

class CheckEmail {

  def checkAtTheRate(email: String): Boolean = {
    for (i <- 0 until  email.length)
      if (email.charAt(i) == '@')
        return true

  throw new IllegalArgumentException("There is no '@' in the Email ID")
  }

  def recipientName(email: String): Boolean = {
    var index = 0
    while (email.charAt(index) != '@') {
      if (email.charAt(index) == '.') return true

      if (!Character.isLetterOrDigit(email.charAt(index))) throw new IllegalArgumentException("Recepient Name is not alphanumeric")
      index = index + 1
    }
    true
  }

  def domainName(email: String): Boolean = {

    if(!checkAtTheRate(email)) return false
    var index = email.indexOf("@") + 1
    while (email.charAt(index) != '.') {
      if (!Character.isLetterOrDigit(email.charAt(index))) throw new IllegalArgumentException("Domain Name is not alphanumeric")
      index = index + 1
    }
    true
  }

  def topLevelDomain(email: String): Boolean = {

    if(!checkAtTheRate(email)) return false
    val index = email.indexOf(".")
    val toplevelDomain = email.substring(index)
    if (toplevelDomain.equals(".com") || toplevelDomain.equals(".net") || toplevelDomain.equals(".org"))
      return true
    throw new IllegalArgumentException("Invalid Top Level Domain")

  }


}

