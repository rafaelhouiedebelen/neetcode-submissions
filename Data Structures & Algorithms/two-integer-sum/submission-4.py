class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # NOTE: Step 1
        # Create an empty dictionary.
        # This will store numbers we have already seen.
        # key = number
        # value = index
        seen = {}

        # NOTE: Step 2
        # Start from the first index of nums.
        i = 0

        # NOTE: Step 3
        # For each number, calculate the needed number:
        # needed = target - current number
        while i < len(nums):
            num = nums[i]

            needed = target - num

        # NOTE: Step 4
        # Check if the needed number is already in the dictionary.
        # If yes, return the index of needed and the current index.
            if needed in seen:
                return [seen[needed], i]

        # NOTE: Step 5
        # If not found, store the current number and its index in the dictionary.
            seen[num] = i

        # NOTE: Step 6
        # Move to the next index and repeat.
            i += 1
