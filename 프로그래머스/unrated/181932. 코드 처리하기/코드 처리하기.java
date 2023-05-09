class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        
        for(int i = 0; i < code.length(); i++) {
            if(mode == 0) {
                if(code.charAt(i) != '1') {
                    if(i % 2 == 0) {
                        ret += code.charAt(i);
                    }
                } else {
                    mode = 1;
                }
            } else if(mode == 1) {
                if(code.charAt(i) != '1') {
                    if(i % 2 != 0) {
                        ret += code.charAt(i);
                    }
                } else {
                    mode = 0;
                }
            }
        }
        if(ret.length() == 0) {
            ret = "EMPTY";
        }
        return ret;
    }
}