package javaQuestions.interviewQuestions8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q04_MapTask {
    /*
  TODO: PART 1
        create a map with groupName as key and groupMembers as value
        "Group1" = ["Member1", "Member2"]
        "Group2" = ["Member3", "Member4", "Member5"]
        /
        BÖLÜM 1
        anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
        "Grup1" = ["Üye1", "Üye2"]
        "Grup2" = ["Üye3", "Üye4", "Üye5"]
        /
        PART 2
        find how many members each group has
        /
        BÖLÜM 2
        her grubun kaç üyesi olduğunu bul

     */
    public static void main(String[] args) {
        // Part 1
        Map<String, List<String>> groupMap = new HashMap<>();
        groupMap.put("Grup1", Arrays.asList("Üye1", "Üye2"));
        groupMap.put("Grup2", Arrays.asList("Üye3", "Üye4", "Üye5"));

        // Part 2
        for (String groupName : groupMap.keySet()) {
            List<String> groupMembers = groupMap.get(groupName);
            int numMembers = groupMembers.size();
            System.out.println(groupName + " grubunda " + numMembers + " üye var.");
        }
    }
}
