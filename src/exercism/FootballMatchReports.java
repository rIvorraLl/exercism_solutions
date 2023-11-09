package exercism;

public class FootballMatchReports {
    public static String onField(int shirtNum) {
	if (shirtNum > 11 || shirtNum < 1) {
	    throw new IllegalArgumentException("Number must be greater than 0 and less than 12");
	}
	switch (shirtNum) {
	case 1:
	    return "goalie";
	case 2:
	    return "left back";
	case 3:
	case 4:
	    return "center back";
	case 5:
	    return "right back";
	case 6:
	case 7:
	case 8:
	    return "midfielder";
	case 9:
	    return "left wing";
	case 10:
	    return "striker";
	}
	return "right wing";
    }
}
