back = new GImage(new Point(640, 480), Color.WHITE);
GShape r = new GRectangle(10, 10, 620, 460, Color.RED);
boolean direction = true;
while (true) {
	if (r.getX() >= 20) {
		direction = false;
	} else if (r.getX() <= 0) {
		direction = true;
	}
	if (direction) {
		r.move(1, 0);
	} else {
		r.move(-1, 0);
	}
	Thread.sleep(10L);
}