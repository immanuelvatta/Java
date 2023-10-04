/**
 * Class to represent a queue using an array to store the queued items.
 * Follows a FIFO (First In First Out) order where new items are added to the
 * back and items are removed from the front.
 */
class Queue {
  constructor() {
    this.items = [];
  }

  /**
   * Adds a new given item to the back of this queue.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @param {any} item The new item to add to the back.
   * @returns {number} The new size of this queue.
   */
  enqueue(item) {
    this.items.push(item);
    return this.size();
  }

  /**
   * Removes and returns the first item of this queue.
   * - Time: O(n) linear, due to having to shift all the remaining items to
   *    the left after removing first elem.
   * - Space: O(1) constant.
   * @returns {any} The first item or undefined if empty.
   */
  dequeue() {
    return this.items.shift();
  }

  /**
   * Retrieves the first item without removing it.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @returns {any} The first item or undefined if empty.
   */
  front() {
    return this.items[0];
  }

  /**
   * Returns whether or not this queue is empty.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @returns {boolean}
   */
  isEmpty() {
    return this.items.length === 0;
  }

  /**
   * Retrieves the size of this queue.
   * - Time: O(1) constant.
   * - Space: O(1) constant.
   * @returns {number} The length.
   */
  size() {
    return this.items.length;
  }

  /**
   * Logs the items of this queue.
   * - Time: O(n) linear.
   * - Space: O(n) linear.
   * @returns {string} The same string that is logged.
   */
  print() {
    const str = this.items.join(" ");
    console.log(str);
    return str;
  }

  /**
   * Compares this queue to another given queue to see if they are equal.
   * Avoid indexing the queue items directly via bracket notation, use the
   * queue methods instead for practice.
   * Use no extra array or objects.
   * The queues should be returned to their original order when done.
   * - Time: O(?).
   * - Space: O(?).
   * @param {Queue} q2 The queue to be compared against this queue.
   * @returns {boolean} Whether all the items of the two queues are equal and
   *    in the same order.
   */
  compareQueues(q2) {
    // are the lengths the same
    if (this.size() !== q2.size()) return false;

    // loop through the queues
    const len = this.size();
    const count = 0;
    const isEqual = true;
    while (count < len) {
      // dequeue and compare
      const dq1 = this.dequeue();
      const dq2 = q2.dequeue();

      if (dq1 !== dq2) {
        isEqual = false;
      }

      this.enqueue(dq1);
      q2.enqueue(dq2);
      count++;
    }

    return isEqual;
    // if the same enqueue
    // if different return false
  }

  /**
   * Determines whether the sum of the left half of the queue items is equal to
   * the sum of the right half. Avoid indexing the queue items directly via
   * bracket notation, use the queue methods instead for practice.
   * Use no extra array or objects.
   * The queue should be returned to it's original order when done.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {boolean} Whether the sum of the left and right halves is equal.
   */
  isSumOfHalvesEqual() {
    // get length of queue
    const length = this.size();
    // if the length is odd
    if (length % 2 !== 0) {
      return false;
    }
    //return false
    const midpoint = length / 2;
    // find midpoint
    // var for left_sum
    // var for right_sum
    let leftSum = 0;
    let rightSum = 0;
    // count
    let count = 0;
    while (count < length) {
      const item = this.dequeue();

      if (count < midpoint) {
        leftSum += item;
      } else {
        rightSum += item;
      }
      this.enqueue(item);
      count++;
    }
    return leftSum === rightSum;
    // return left_sum === right_sum
  }
}

/* Rebuild the above class using a linked list instead of an array. */
