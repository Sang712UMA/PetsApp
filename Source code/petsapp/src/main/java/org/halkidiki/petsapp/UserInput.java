package org.halkidiki.petsapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput {
    static int getInteger() { 
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            int i=Integer.parseInt(line);
            return i;
        }
        catch(IOException | NumberFormatException e) {
            return -1;
        }
    }
    
    static float getFloat() { 
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            float i=Float.parseFloat(line);
            return i;
        }
        catch(IOException | NumberFormatException e) {
        return -1;
        }
    }
    
    static double getDouble() { 
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            double i=Double.parseDouble(line);
            return i;
        }
        catch(IOException | NumberFormatException e) {
        return -1;
        }
    }
    
    static short getShort() { 
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            short i=Short.parseShort(line);
            return i;
        }
        catch(IOException | NumberFormatException e) {
        return -1;
        }
    }
    
    static char getChar(){
        char c;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
	try{
            c=(char)br.read();
            return c;
	}
        catch(Exception e)
        {
        return 'L';
        }
    }
    
    static float getByte() { 
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            float i=Byte.parseByte(line);
            return i;
        }
        catch(IOException | NumberFormatException e) {
        return -1;
        }
    }
    
    static long getLong() { 
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            long i=Long.parseLong(line);
            return i;
        }
        catch(IOException | NumberFormatException e) {
        return -1;
        }
    }
    
    static boolean getBoolean() { 
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            boolean i=Boolean.parseBoolean(line);
            return i;
        }
        catch(Exception e) {
        return false;
        }
    }
    
    static String getString(){
        String line;
        InputStreamReader eisodosString=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(eisodosString);
	try{
            line=br.readLine();
            return line;
	}
        catch(Exception e){
            return "lathos";
        }
    }
    
}

