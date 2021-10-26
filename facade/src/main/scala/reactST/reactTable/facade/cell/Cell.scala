package reactST.reactTable.facade.cell

import japgolly.scalajs.react.facade.React.Node
import reactST.reactTable.Plugin
import reactST.reactTable.facade.column.Column
import reactST.reactTable.mod.CellPropGetter
import reactST.reactTable.mod.CellValue
import reactST.reactTable.mod.Row
import reactST.reactTable.mod.TableCellProps
import reactST.reactTable.mod.UseGroupByCellProps
import reactST.reactTable.reactTableStrings

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait Cell[D, V, Plugins] extends js.Object {

  var column: Column[D, Plugins] = js.native

  // TODO Maybe we could convert to scalajs-react TagMod here?
  def getCellProps(): TableCellProps                              = js.native
  def getCellProps(propGetter: CellPropGetter[D]): TableCellProps = js.native

  def render(`type`: String): Node                       = js.native
  def render(`type`: String, userProps: js.Object): Node = js.native
  @JSName("render")
  def render_Cell(`type`: reactTableStrings.Cell): Node = js.native
  @JSName("render")
  def render_Cell(`type`: reactTableStrings.Cell, userProps: js.Object): Node =
    js.native

  var row: Row[D] = js.native

  var value: CellValue[V] = js.native
}

object Cell {

  implicit class CellOps[Self <: Cell[_, _, _]](val cell: Self) extends AnyVal {
    def renderCell: Node = cell.render_Cell(reactTableStrings.Cell)
  }

  implicit def UseGroupByCellOpts[D, V, Plugins](cellProps: Cell[D, V, Plugins])(implicit
    ev:                                                     Plugins <:< Plugin.GroupBy.Tag
  ): UseGroupByCellProps[D] = cellProps.asInstanceOf[UseGroupByCellProps[D]]
}