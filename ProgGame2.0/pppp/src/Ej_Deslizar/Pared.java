//No Editable
package Ej_Deslizar;

public class Pared extends Tile {

	public Pared(Character type){
		super(type);
	}

	@Override
	public int stop_slide() {
		return STOP;
	}
}
