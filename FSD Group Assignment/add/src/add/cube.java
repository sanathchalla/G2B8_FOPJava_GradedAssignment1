package add;

  class cube {
	static int height = 50;
	static int width = 60;
	
	public void CaluculateVolume(float depth) {
		float vol = height * width * depth;
		System.out.println("is" + vol);
		
	}
	public static void main(String[] args) {
		cube c = new cube();
		c.CaluculateVolume(70);
	}

}
