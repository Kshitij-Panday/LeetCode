/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeak(mountainArr);

        int firstTry = binarySearch(
                mountainArr, target, 0, peak, true);

        if (firstTry != -1) {
            return firstTry;
        }

        return binarySearch(
                mountainArr, target,
                peak + 1,
                mountainArr.length() - 1,
                false);
    }

    private int findPeak(MountainArray arr) {
        int s = 0;
        int e = arr.length() - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    private int binarySearch(MountainArray arr,
            int target,
            int s,
            int e,
            boolean asc) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int val = arr.get(mid);

            if (val == target) {
                return mid;
            }

            if (asc) {
                if (target < val) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target < val) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}