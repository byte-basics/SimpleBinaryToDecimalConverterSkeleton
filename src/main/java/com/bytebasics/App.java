package com.bytebasics;

public class App
{
    public static void main( String[] args )
    {
        if(args.length > 0) {
            BinaryConverter converter = new BinaryConverter();
            System.out.println(converter.convertBinToDec(args[0]));
        } else {
            System.out.println("You must provide a single argument that is a valid binary number " +
                    "between 0 and 1111111111111111");
            System.exit(1);
        }
    }
}
