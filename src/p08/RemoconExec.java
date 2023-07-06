package p08;

public class RemoconExec {

	public static void main(String[] args) {
		/*
		 * AirconRemocon ar = new AirconRemocon(); TVRemocon tv = new TVRemocon();
		 */

		/*
		 * Remote r1 = ar; Remote r2 = tv;
		 */
		Remote[] remotes = new Remote[2];
		remotes[0] = new AirconRemocon();
		remotes[1] = new TVRemocon();

		/*
		 * r1.on(); r1.off(); r2.on(); r2.off();
		 */

		for (int i = 0; i < remotes.length; i++) {
			if (remotes[i] instanceof AirconRemocon) {
				AirconRemocon ar = (AirconRemocon) remotes[i];
				ar.tempUp();
				ar.tempDown();
			} else if (remotes[i] instanceof TVRemocon) {
				TVRemocon tv = (TVRemocon) remotes[i];
				tv.chUp();
				tv.chDown();
			}

			remotes[i].on();
			remotes[i].off();
		}

	}
}
