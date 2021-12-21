import java.util.*;
public class Recursion {

    public static void main(String[] args) {
        System.out.println("hi");
        Integer[] arr1 = {20,40,10,70,50,30,60,50,70};
        List<Integer> ar = Arrays.asList(arr1);
        int index = 0;
        //displayarray(ar,0);
        //displayReverseArray(ar,0);
        //maxArray(ar, 0);
        //firstIndex(ar,index,70);
        //lastIndex(ar,index,50);
        //System.out.println(allIndices(ar,index,50,0));
        //System.out.println(subsequence("abc"));
        //System.out.println(keyPadSubsequence("543"));
        //System.out.println(stairs(4));
        //System.out.println(MazePaths(1,1,3,3));
        //System.out.println(MazePathsJump(1,1,3,3));
        
    }
    
    

    private static List<String> MazePathsJump(int sr, int sc, int dr, int dc) {
        List<String> hPaths= new ArrayList<>();
        List<String> vPaths= new ArrayList<>();
        List<String> dPaths= new ArrayList<>();

        if(sr==dr && sc==dc)
        {
            ArrayList<String> arEmpty = new ArrayList<String>();
            arEmpty.add("");
            return arEmpty;
        }

        if(sr<dr)
            hPaths= MazePaths(sr + 1, sc, dr, dc);
        if(sc<dc)
            vPaths=MazePaths(sr,sc+1,dr,dc);
        if(sc==sr)
            dPaths=MazePaths(sr+1,sc+1,dr,dc);

        List<String> paths=new ArrayList<String>();
        for (String str:hPaths) {
            paths.add("h"+str);
        }
        for (String str:vPaths) {
            paths.add("v"+str);
        }
        for (String str:dPaths) {}
        //System.out.println(paths);
        return paths;
    }

    private static List<String> MazePaths(int sr, int sc, int dr, int dc) {

        List<String> hPaths= new ArrayList<>();
        List<String> vPaths= new ArrayList<>();
        if(sr==dr && sc==dc)
        {
            ArrayList<String> arEmpty = new ArrayList<String>();
            arEmpty.add("");
            return arEmpty;
        }
        if(sr<dr)
             hPaths= MazePaths(sr + 1, sc, dr, dc);
        if(sc<dc)
            vPaths=MazePaths(sr,sc+1,dr,dc);

        List<String> paths=new ArrayList<String>();
        for (String str:hPaths) {
            paths.add("h"+str);
        }
        for (String str:vPaths) {
            paths.add("v"+str);
        }
        //System.out.println(paths);
        return paths;
    }

    private static List<String> stairs(int index) {
        if(index==0)
        {
            ArrayList<String> arEmpty = new ArrayList<String>();
            arEmpty.add("");
           return arEmpty;
        }
        else if(index<0)
            return new ArrayList<String>();

        List<String> l1 = stairs(index - 1);
        List<String> l2 =    stairs(index - 2);
        List<String> l3 = stairs(index - 3);

        ArrayList<String> l4 = new ArrayList<String>();

        for (String str: l1) {
            l4.add(1+str);
        }
        for (String str: l2) {
            l4.add(2+str);
        }
        for (String str: l3) {
            l4.add(3+str);
        }

        return l4;
    }

    private static List<String> keyPadSubsequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> ar2 = new ArrayList<>();
            ar2.add("");
            return ar2;
        }

        Map<String,String> keypadmap=new HashMap<>(){{put("1","abc");
            put("2","def"); put("3","ghi"); put("4","jkl"); put("5","mno"); put("6","pqrs"); put("7","tu");
            put("8","vwx");put("9","yz");
        }  };

        List<String> rres = keyPadSubsequence(str.substring(1));
        String str2=keypadmap.get(str.charAt(0)+"");
        //List<String> ar2=new ArrayList<>(rres);
        List<String> mres=new ArrayList<>();
        //rres.addAll(Arrays.asList(str2.split("")));
        for(int i=0;i<str2.length();i++){
            for (String rstr:rres) {
                mres.add(rstr+str2.charAt(i));
            }
        }
        System.out.println(mres);
        return mres;

    }





    private static List<String> subsequence(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> arr2 = new ArrayList<>();
        String var =str.charAt(0)+"";
        //include
        //System.out.println(var);
      List<String> ros=subsequence(str.substring(1));
      List<String> ar2=new ArrayList<>(ros);
      ros.add(var);
        for(int i=0;i<ar2.size();i++){
            ros.add(ar2.get(i)+var);
        }
        //System.out.println(ros);

        return ros;
    }

    private static List<Integer> allIndices(List<Integer> ar, int index, int x,int fsf) {
        if (index == ar.size()) {
            List<Integer> emptyList = new ArrayList<>();
            return emptyList;
        }
        if(ar.get(index)==x) {
            List<Integer> arr = allIndices(ar, index + 1, x, fsf);
            arr.add(index);
            return arr;
        }
        else{
            return allIndices(ar, index + 1, x, fsf);
        }

    }

    private static void lastIndex(List<Integer> ar, int index, int x) {
        if (index == ar.size()) {
            System.out.println("-1");
            return;
        }
        if(ar.get(ar.size()-1-index)==x) {
            System.out.println(ar.size()-1-index);
            return;
        }
        lastIndex(ar,index+1,x);

    }

    private static void firstIndex(List<Integer> ar, int index,int x){
        if (index == ar.size()) {
            System.out.println("-1");
            return;
        }
        if(ar.get(index)==x) {
            System.out.println(index);
            return;
        }
        firstIndex(ar,index+1,x);

    }

    private static void displayReverseArray(List<Integer> ar, int index) {
        if (index == ar.size())
            return;
        System.out.println(ar.get(index));
        displayReverseArray(ar, index + 1);

    }

    private static void maxArray(List<Integer> ar, int index) {
        if (index == ar.size()) {
            System.out.println(ar.get(0));
            return;
        }
        if (ar.get(0) < ar.get(index))
            ar.set(0, ar.get(index));
        maxArray(ar,index+1);
    }
}
