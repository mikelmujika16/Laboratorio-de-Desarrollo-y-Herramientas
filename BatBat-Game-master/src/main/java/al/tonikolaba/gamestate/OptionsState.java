/** Copyright to N.Kolaba
All rights reserved ©.
**/

package al.tonikolaba.gamestate;

import java.awt.Color;
import java.awt.Graphics2D;

import al.tonikolaba.audio.JukeBox;
import al.tonikolaba.handlers.Keys;

/**
 * @author N.Kolaba
 */

public class OptionsState extends BasicState {



	public OptionsState(GameStateManager gsm) {
		super(gsm);
		options = new String[] { "HowTo Play", "Language", "Back" };
	}

	@Override
	public void update() {
		// check keys
		handleInput();
	}

	@Override
	public void draw(Graphics2D i) {
		super.draw(i);
		i.setFont(fontMenu);
		i.setColor(Color.RED);
		i.drawString("HowTo Play", 300, 223);
		i.drawString("Language", 300, 248);
		i.drawString("Back", 300, 273);
	}

	String menuSelect = "menuselect";
	@Override
	protected void select() {
		switch (currentChoice) {
		case 0:
			JukeBox.play(menuSelect);
			gsm.setState(GameStateManager.HOWTOPLAY);
			break;
		case 1:
			JukeBox.play(menuSelect);
			gsm.setState(GameStateManager.OPTIONSSTATE);
			break;
		case 2:
			JukeBox.play(menuSelect);
			gsm.setState(GameStateManager.MENUSTATE);
			break;
		default:
			gsm.setState(GameStateManager.MENUSTATE);
			break;
		}
	}

	@Override
	public void handleInput() {
		if (Keys.isPressed(Keys.ENTER))
			select();
		if (Keys.isPressed(Keys.UP) && currentChoice > 0) {
			JukeBox.play("menuoption", 0);
			currentChoice--;
		}
		if (Keys.isPressed(Keys.DOWN) && currentChoice < options.length - 1) {
			JukeBox.play("menuoption", 0);
			currentChoice++;
		}
	}
}
