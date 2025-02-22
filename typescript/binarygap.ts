function binaryGap(N: number): number {
    const binaryString = N.toString(2);
    let maxGap = 0;
    let currentGap = 0;
    let counting = false;

    /*
    for (const char of binaryString) {
        if (char === '1') {
            if (counting) {
                maxGap = Math.max(maxGap, currentGap);
            }
            currentGap = 0;
            counting = true;
        } else if (counting) {
            currentGap++;
        }
    } */

    let integerArray: number[] = [];

    for(let i = 0; i < binaryString.length; i++) {
        if (binaryString[i] === '1') {
            integerArray.push(i);
        } 
    }

    for(let i = 0; i < integerArray.length - 1; i++) {
        let diff = integerArray[i + 1] - integerArray[i] - 1;
        if (diff > maxGap) {
            maxGap = diff;
        }
    }
        return maxGap;
}

// Example usage:
const number = 300;
console.log(`The binary gap of ${number} is ${binaryGap(number)}`);