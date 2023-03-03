package com.ivmoreau.game

import com.badlogic.gdx.{ApplicationAdapter, Gdx}
import com.badlogic.gdx.backends.lwjgl3.{Lwjgl3Application, Lwjgl3ApplicationConfiguration}
import com.badlogic.gdx.graphics.g2d.{SpriteBatch, BitmapFont}
import com.badlogic.gdx.graphics.GL20

case class GameTT() extends ApplicationAdapter:

  var batch: SpriteBatch = null
  var font: BitmapFont = null

  override def create(): Unit =
    batch = new SpriteBatch()
    font = new BitmapFont()

  override def render(): Unit =
    Gdx.gl.glClearColor(.25f, .25f, .25f, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    batch.begin()
    font.draw(batch, "Holi! uwu", Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2)
    batch.end()

  override def dispose(): Unit =
    batch.dispose()
    font.dispose()


@main def run() =
  val cfg = new Lwjgl3ApplicationConfiguration()
  cfg.setTitle("Test")
  cfg.setWindowedMode(800, 480)
  cfg.useVsync(true)
  cfg.setForegroundFPS(60)
  new Lwjgl3Application(new GameTT(), cfg)
