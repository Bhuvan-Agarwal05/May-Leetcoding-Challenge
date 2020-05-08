class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        count=0
        for i in J:
            count += S.count(i)
        return count