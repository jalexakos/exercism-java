class SqueakyClean {
    static String clean(String identifier) {
        String cleanedString = "";
        for (int i = 0; i <identifier.length(); i++) {
            char idxChar = identifier.charAt(i);
            Character idxCharObj = idxChar;
            if (idxChar == ' ') {
                cleanedString = cleanedString.concat("_");
            } else if (idxChar == '-') {
                cleanedString = cleanedString.concat(("" + identifier.charAt(i + 1)).toUpperCase());
                i++;
            } else if (idxCharObj.isDigit(idxChar)) {
                switch(idxChar) {
                    case '4':
                        cleanedString = cleanedString.concat("a");
                        break;
                    case '3':
                        cleanedString = cleanedString.concat("e");
                        break;
                    case '0':
                        cleanedString = cleanedString.concat("o");
                        break;
                    case '1':
                        cleanedString = cleanedString.concat("l");
                        break;
                    default:
                        cleanedString = cleanedString.concat("t");
                        break;
                }
            } else if (idxCharObj.isAlphabetic(idxChar)) {
                cleanedString = cleanedString.concat("" + idxChar);
            } else {
                continue;
            }
        }
        return cleanedString;
    }
}

// learning chars in Java, and how they differ as primitive from Strings. I will study these more, as the distinction
// is not clear to me.