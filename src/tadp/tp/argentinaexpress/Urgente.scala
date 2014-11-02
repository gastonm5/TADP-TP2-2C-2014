package tadp.tp.argentinaexpress

class Urgente (override val caracteristicas : Set[Envio],
    override val sucursalOrigen :Sucursal,
    override val sucursalDestino :Sucursal,
    override val volumen :Int,
    override val fecha :Tuple3[Int,Int,Int])
extends Envio (caracteristicas, sucursalOrigen, sucursalDestino, volumen, fecha){
def precio()={110}
  def costoBase()={20}
}