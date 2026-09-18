class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int m = g.length;
        int n = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int p = 0;
        int q = 0;

        while(p < m && q < n) {
            if(g[p] <= s[q]) p++;
            q++;
        }

        return p;
    }
}