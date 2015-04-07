package pl.gpost.example;

import pl.gpost.TurtleGraphicsWindow;

class TGWexample1 extends TurtleGraphicsWindow
{

   public TGWexample1()
   { super( 600, 600 ); }

   void box( int side )
   {
      for ( int i=4; i > 0; i-- )
      {
         forward(side);
         right(90);
      }
   }

   void drawSomething()
   {
      setpensize( 1 );
      home();
      setheading( NORTH );
      for ( int count=30; count > 0; count-- )
      {
         box( 180 );
	 right( 360/30 );
      }
      penup();
      home();
      setheading( NORTH );
      right( 360/120 );
      for ( int colorNumber=1; colorNumber < 32; colorNumber++ )
      {
         if ( colorNumber == WHITE )
            continue;
         forward( 90 );
         setpencolor( colorNumber );
         fill();
         home();
         right( 360/30 );
      }
      home();
      setheading( NORTH );
      right( 360/40 );
      for ( int colorNumber=31; colorNumber > 0; colorNumber-- )
      {
         if ( colorNumber == WHITE )
            continue;
         forward( 90 );
         setpencolor( colorNumber );
         fill();
         home();
         right( 360/30 );
      }
   }

   public static void main(String[] args)
   {
      TGWexample1 me = new TGWexample1();
      me.hideturtle();
      me.drawSomething();
   }

} // end class pl.gpost.example.TGWexample1
