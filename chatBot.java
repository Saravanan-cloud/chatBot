package com.sara;

public class chatBot
{
    public static void main(String[] args)
    {
        String str = "hello";
        switch(str)
        {
            case "hi":
                System.out.println("hi");
                break;
            case "hello":
                System.out.println("im fine what about you ");
                break;
            case "how are you":
                System.out.println("good");
                break;
                
            case "fine":
        		System.out.println("how was today? " );
        		break;
        	case "good":
        		System.out.println("hmm " );
        		break;
        	case "what is your name":
        		System.out.println("This is chatbot" );
        		break;
        	case "nice":
        		System.out.println("thanks " );
        		break;
            default:
                System.out.println("no match");
        }
    }
    }