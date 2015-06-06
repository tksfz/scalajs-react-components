package chandu0101.scalajs.react.components.demo.css

import chandu0101.scalajs.react.components.listviews.ReactListView
import chandu0101.scalajs.react.components.searchboxes.ReactSearchBox
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._
import scala.scalajs.js
import scalacss.Defaults._
import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry

object AppCss {

  def load = {
    GlobalRegistry.register(ReactListView.DefaultStyle,
    ReactSearchBox.DefaultStyle)
    GlobalRegistry.onRegistration(_.addToDocument())
  }
}
