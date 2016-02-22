package question7

/**
  * SDP Scala Exercises Week 7
  * Traits and Inheritance, Question 7
  *
  * @author Mark Channer
  */

sealed trait Publication

case class Book(author: Author) extends Publication

final case class Periodical(editor: Editor, issues: Seq[Issue]) extends Publication

final case class Issue(volume: Int, issue: Int, manuscripts: Seq[Manuscript])

final case class Manuscript(override val author: Author, length: Int = 5000) extends Book(author)

final case class Author()

final case class Editor()






