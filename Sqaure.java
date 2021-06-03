/*Requirements:
-------------
1. Two Constructors (default, and single parameter)
2. Need methods to: get and set side
3. Need a method to retrieve area and a method to retrieve the perimeter
*/

public class Square extends Object{
	private int Side = 0;
	private int myArea = 0;
	private int myPerimeter = 0;

	public Square() { this(0); }

	public Square( int InitialSide ){
		this.SetSide( InitialSide );
		}

	public int GetSide(){   return this.Side;   }

	public void SetSide( int NewSideValue ){
		this.Side = NewSideValue;
		this.UpdateAreaAndPerimeter();
		}

	public int GetArea(){ return this.myArea; }
	
	public int GetPerimeter(){  return this.myPerimeter; }
	
	private void UpdateAreaAndPerimeter(){
			this.myArea = this.Side * this.Side;
			this.myPerimeter = this.Side * 4;
		}


	public String toString() {
		String Temp = new String();

		Temp = "I am a square with a side value of " + Side + ". My Area is " + this.myArea + ". My Perimeter is " + this.myPerimeter;
		return Temp;
	}

	public static void main(String Args[]){

		System.out.println("Hello!");

		Square MySquareA;
		MySquareA = new Square();

		MySquareA.SetSide(10);

		System.out.println(MySquareA);

		for(int i = 0; i <= 100; i++){
			MySquareA.SetSide(i);
			System.out.println(MySquareA);
		}

		int k = 101;
		while(k <= 200){
			MySquareA.SetSide(k);
			System.out.println(MySquareA);

			k++;
		}

		//Test Single Paramter Constructor

		Square MySquareB;
		MySquareB = new Square(25);

		System.out.println(MySquareB);

		System.out.println(MySquareB.GetSide());
		System.out.println(MySquareB.GetPerimeter());
		System.out.println(MySquareB.GetArea());
	}

javadoc SquareDocumentation;
}
