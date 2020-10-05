import javax.swing.*
import java.awt.*
import java.awt.event.ItemEvent
import java.awt.event.ItemListener

class AppletInterfaz : JApplet() {
    private val lista = List()
    private val flowLayout1 = FlowLayout()
    private val colores = arrayOf(Color.yellow, Color.blue, Color.red, Color.green, Color.black, Color.magenta, Color.cyan)
    private var indice: Int = 0

    override fun init() {
        lista.addItemListener { e -> lista_itemStateChanged(e) }
        lista.add("Amarillo")
        lista.add("Azul")
        lista.add("Rojo")
        lista.add("Verde")
        lista.add("Negro")
        lista.add("Margenta")
        lista.add("Cyan")
        lista.select(0)
        this.layout = flowLayout1
        this.add(lista, null)
    }

    override fun paint(g: Graphics) {
        g.color = colores[indice]
        g.fillRect(150, 120, 100, 100)
    }

    private fun lista_itemStateChanged(e: ItemEvent) {
        indice = lista.selectedIndex
        repaint()
    }
}