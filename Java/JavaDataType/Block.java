public class Block {


    static int var = 10;
    int hello =3;
    {
        System.out.println("hello => initalization");
        hello = 5;
    }

    static{
        System.out.println("var => initalization");
        var =20;
    }

    public static void main(String [] args){
		System.out.println("Instance create");
        Block block = new Block();
	}
    
}
