package org.example;

public class ActivityProposer {
    //it depends on age sex character
    public String activityProposable(User user, long timeSlot){
        //1 IDENTIFY GEOGRAFICAL AREA
        //2 IDENTIFY EXPENDABLE INCOME INCOME
        //3 SEX AND GENDER
        //4 INTERESTS (OUT-DOOR HIPPIE, INDOOR WEEB, DRUG-HEAD PARTY-PERSON)
        switch (user.country) {
            case ITALY:
                //GO TO ITALIAN DATASERVER
                break;
            case SWEDEDN:
                //GOT TO SWEDEN DATASERVER
                break;
            default:
                //GO TO GENERAL DATASERVER
                break;
        }

        }
        return null;
    }
}
