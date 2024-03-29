package reactST.reactTable.facade.column

import reactST.reactTable.mod.FooterGroupPropGetter
import reactST.reactTable.mod.HeaderGroupPropGetter
import reactST.reactTable.mod.TableFooterProps
import reactST.reactTable.mod.TableHeaderProps

import scala.scalajs.js

@js.native
trait HeaderGroup[D, Plugins] extends Column[D, Plugins] {

  def getFooterGroupProps(): TableFooterProps                                     = js.native
  def getFooterGroupProps(propGetter: FooterGroupPropGetter[D]): TableFooterProps = js.native

  def getHeaderGroupProps(): TableHeaderProps                                     = js.native
  def getHeaderGroupProps(propGetter: HeaderGroupPropGetter[D]): TableHeaderProps = js.native

  var headers: js.Array[HeaderGroup[D, Plugins]] = js.native

  var totalHeaderCount: Double = js.native
}
