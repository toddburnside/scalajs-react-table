package reactST.reactTable.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{ JSBracketAccess, JSGlobal, JSGlobalScope, JSImport, JSName }

@js.native
trait ColumnFooter[D] extends StObject {

  var Footer: String = js.native
}

object ColumnFooter {

  @scala.inline
  def apply[D](Footer: String): ColumnFooter[D] = {
    val __obj = js.Dynamic.literal(Footer = Footer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFooter[D]]
  }

  @scala.inline
  implicit class ColumnFooterMutableBuilder[Self <: ColumnFooter[_]](val x: Self) extends AnyVal {

    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])

    @scala.inline
    def setFooter[D](value: Renderer[HeaderProps[D]])(implicit
      ev:                   Self <:< ColumnFooter[D]
    ): Self =
      StObject.set(x, "Footer", value.asInstanceOf[js.Any])

    @scala.inline
    def setFooterComponentClass[D](value: ComponentClassP[HeaderProps[D] with js.Object])(implicit
      ev:                                 Self <:< ColumnFooter[D]
    ): Self =
      StObject.set(x, "Footer", value.asInstanceOf[js.Any])

    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)

    @scala.inline
    def setFooterVdomElement(value: VdomElement): Self =
      StObject.set(x, "Footer", value.rawElement.asInstanceOf[js.Any])
  }
}
