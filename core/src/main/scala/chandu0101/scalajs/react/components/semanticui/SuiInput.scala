package chandu0101.scalajs.react.components.semanticui

import chandu0101.macros.tojs.JSMacro
import chandu0101.macros.tojs.JSMacro._
import japgolly.scalajs.react.{React, ReactComponentU_, ReactElement, ReactNode}

import scala.scalajs.js

case class SuiInput(
  key:      js.UndefOr[String]        = js.undefined,
  ref:      js.UndefOr[String]        = js.undefined,
  as:       js.UndefOr[String]        = js.undefined,
  defaultValue: js.UndefOr[String]    = js.undefined,
  placeholder:  js.UndefOr[String]    = js.undefined,
  `type`:   js.UndefOr[String]        = js.undefined,
  value:    js.UndefOr[String]        = js.undefined,
  label:    js.UndefOr[ReactElement]  = js.undefined,
  labelPosition: js.UndefOr[String]   = js.undefined
) {
  def apply(children: ReactNode*) = {
    val props = JSMacro[SuiInput](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Sui.Input)
    if (children.isEmpty)
      f(props).asInstanceOf[ReactComponentU_]
    else if (children.size == 1)
      f(props, children.head).asInstanceOf[ReactComponentU_]
    else
      f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}