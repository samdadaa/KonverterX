
import java.util.Random;

public class Umwandeln
{
    public String grossSchreibung(String text)
    {
        StringBuilder neuerString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char zeichen = text.charAt(i);

            if (i == 0 || Character.isWhitespace(text.charAt(i - 1))) {
                zeichen = Character.toUpperCase(zeichen);
            }

            neuerString.append(zeichen);
        }
        return neuerString.toString();
    }

    public String grossBuchstaben(String text)
    {
        StringBuilder neuerString = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char zeichen = text.charAt(i);
            zeichen = Character.toUpperCase(zeichen);
            neuerString.append(zeichen);
        }
        return neuerString.toString();
    }


    public String kleinBuchstaben(String text)
    {
        StringBuilder neuerString = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char zeichen = text.charAt(i);
            zeichen = Character.toLowerCase(zeichen);
            neuerString.append(zeichen);
        }
        return neuerString.toString();
    }

    public String camelCase(String text)
    {
        StringBuilder neuerString = new StringBuilder();
        boolean neuesWort = true;

        for (char zeichen : text.toCharArray()) {
            if (neuesWort) {
                zeichen = Character.toUpperCase(zeichen);
            }
            neuerString.append(zeichen);
            neuesWort = Character.isWhitespace(zeichen);

        }
        String textUmgewandelt = neuerString.toString().replace(" ", "");

      return textUmgewandelt;
    }

    public String kebabCase(String text)
    {
        String kebabCase = text.toString().replace(" ","-");
       return kebabCase;
    }

    public String snakeCase(String text)
    {
        String snakeCase = text.toString().replace(" ","_");
       return snakeCase;
    }

    public String leerZeilenEntfernen(String text)
    {
        String ohneleerzeicen = text.toString().replace(" ","");
        return ohneleerzeicen;
    }

    public String randomCase(String text)
    {
        StringBuilder neuerString = new StringBuilder();
        Random random = new Random();
        for (Character zeichen : text.toCharArray())
        {
            if (!zeichen.equals(' '))
            {
                int rand = random.nextInt(1,3);
                switch (rand)
                {
                    case 1: zeichen = Character.toLowerCase(zeichen);
                        neuerString.append(zeichen);
                        break;
                    case 2: zeichen = Character.toUpperCase(zeichen);
                        neuerString.append(zeichen);
                }
            }else
            {
                neuerString.append(zeichen);
            }
        }
        return  neuerString.toString();
    }
}

