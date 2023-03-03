import mill.define.Target
import mill._, scalalib._, scalajslib._, mill.scalajslib.api._

object game extends ScalaModule {
  override def scalaVersion = "3.2.2"
  override def ammoniteVersion = "2.5.8"
  override def forkArgs: Target[Seq[String]] = Seq("-XstartOnFirstThread")
  override def ivyDeps = Agg(ivy"org.typelevel::cats-core:2.9.0",
    ivy"org.typelevel::cats-effect:3.4.2",
    ivy"org.typelevel::cats-mtl:1.3.0",
    ivy"org.typelevel::kittens:3.0.0",
    ivy"org.typelevel::mouse:1.2.1",
    ivy"org.typelevel::cats-parse:0.3.7",
    ivy"co.fs2::fs2-core:3.4.0",
    ivy"co.fs2::fs2-io:3.4.0",
    ivy"com.badlogicgames.gdx:gdx:1.11.0",
    ivy"com.badlogicgames.gdx:gdx-backend-lwjgl3:1.11.0",
    ivy"com.badlogicgames.gdx:gdx-platform:1.11.0;classifier=natives-desktop"
  )
}
