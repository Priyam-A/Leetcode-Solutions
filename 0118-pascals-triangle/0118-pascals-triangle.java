class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> abc = new ArrayList<List<Integer>>();
        ArrayList<Integer> prevRow = new ArrayList<Integer>();
        prevRow.add(1);
        abc.add(prevRow);
        for(int i=1; i<numRows; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int j=0; j<i-1; j++){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1);
            prevRow = row;
            abc.add(row);
        }
        return abc;
    }
}