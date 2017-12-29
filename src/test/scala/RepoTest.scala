package scala

import mock_inline.Repo
import org.mockito.Mockito._
import org.scalatest.mockito.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

class RepoTest extends FlatSpec with Matchers with MockitoSugar {

  "mock_inline.Repo.connection" should "return connection" in {
    val repo = mock[Repo]
    when(repo.getConnection) thenReturn "fake_connection"

    repo.getConnection should equal("fake_connection")
  }

}
