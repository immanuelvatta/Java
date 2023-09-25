/**
 * Class to represent a MinHeap which is a Priority Queue optimized for fast
 * retrieval of the minimum value. It is implemented using an array but it is
 * best visualized as a tree structure where each 'node' has left and right
 * children except the 'node' may only have a left child.
 * - parent is located at: Math.floor(i / 2);
 * - left child is located at: i * 2
 * - right child is located at: i * 2 + 1
 */
class MinHeap {
    constructor() {
        /**
         * 0th index not used, so null is a placeholder. Not using 0th index makes
         * calculating the left and right children's index cleaner.
         * This also effectively makes our array start at index 1.
         */
        this.heap = [null];
    }

    size() {
        return this.heap.length - 1;
    }

    idxParent(i) {
        return Math.floor(i / 2);
    }

    idxLeftChild(i) {
        return i * 2;
    }
    idxRightChild(i) {
        return i * 2 + 1;
    }
    swap(i, j) {
        const temp = this.heap[j];
        this.heap[j] = this.heap[i];
        this.heap[i] = temp;
    }

    /**
     * Retrieves the top (minimum number) in the heap without removing it.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {?number} Null if empty.
     */
    top() {
        this.heap.length > 1 ? this.heap[1] : null;
    }

    /**
     * Inserts a new number into the heap and maintains the heaps order.
     * 1. Push new num to back then.
     * 2. Iteratively swap the new num with it's parent while it is smaller than
     *    it's parent.
     * - Time: O(log n) logarithmic due to shiftUp / iterative swapping.
     * - Space: O(1) constant.
     * @param {number} num The num to add.
     */
    insert(num) {
        this.heap.push(num);

        let idx = this.heap.length - 1;
        while (idx > 1) {
            let idxOfParent = this.idxParent(idx);
            if (this.heap[idx] < this.heap[idxOfParent]) {
                this.swap(idx, idxOfParent);
                idx = idxOfParent
            } else {
                break;
            }
        }
        return this.size();
    }

    /**
     * Logs the tree horizontally with the root on the left and the index in
     * parenthesis using reverse inorder traversal.
     */
    printHorizontalTree(parentIdx = 1, spaceCnt = 0, spaceIncr = 10) {
        if (parentIdx > this.heap.length - 1) {
            return;
        }

        spaceCnt += spaceIncr;
        this.printHorizontalTree(parentIdx * 2 + 1, spaceCnt);

        console.log(
            " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
            `${this.heap[parentIdx]} (${parentIdx})`
        );

        this.printHorizontalTree(parentIdx * 2, spaceCnt);
    }
}

const myHeap = new MinHeap();
myHeap.insert(50)
myHeap.insert(20)
myHeap.insert(30)
myHeap.insert(22)
myHeap.insert(33)
myHeap.insert(23)

myHeap.printHorizontalTree()
console.log(myHeap.heap);