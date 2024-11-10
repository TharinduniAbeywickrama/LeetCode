class Solution:
    def canPlaceFlowers( self, flowerbed: List[int], n: int) -> bool:
        count = 0
        length = len(flowerbed)

        for i in range(length):
            if flowerbed[i]==0:
                empty_left=(i==0 or flowerbed[i-1]==0)
                empty_right=(i==length-1 or flowerbed[i+1]==0)

                if empty_left and empty_right:
                    flowerbed[i]=1
                    count+=1

                    if count>=n:
                        return True
    
        return count>=n


solution = Solution()

# Example 1
flowerbed1 = [1, 0, 0, 0, 1]
n1 = 1
result1 = solution.canPlaceFlowers(flowerbed1, n1)
print("Output for Example 1:", result1)  # Expected Output: true

# Example 2
flowerbed2 = [1, 0, 0, 0, 1]
n2 = 2
result2 = solution.canPlaceFlowers(flowerbed2, n2)
print("Output for Example 2:", result2)  # Expected Output: false


