class SqueakyClean {
    static String clean(String identifier) {
        String underscores = identifier.replace(" ", "_");
        StringBuilder sb = new StringBuilder();
        Boolean ifen = false;
        int count = 0;

        String stringNova = underscores.replace("4", "a").replace("3", "e")
                .replace("0", "o").replace("1", "l").replace("7", "t");

        for (int i = 0; i < stringNova.length(); i ++){
            char letra = stringNova.charAt(i);
            if (letra == '-'){
                ifen = true;
            }else if(ifen){
                sb.append(Character.toUpperCase(letra));
                ifen = false;
            }else {
                sb.append(letra);
            }
        }

        String resultado = sb.toString();
        StringBuilder rs = new StringBuilder();

        for (int j = 0; j < resultado.length(); j++){
            char l =resultado.charAt(j);

            if(!Character.isDigit(l) && Character.isLetterOrDigit(l) || Character.isLetter(l) || l == '_' ){
                rs.append(l);
            }
        }

        return rs.toString();
    }


}
