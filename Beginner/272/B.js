const fs = require("fs");

function main(input) {
  const data = input.split("\n");
  const NM = data[0].split(" ").map(Number);
  const numbers = data.slice(1);

  for (let n = 1; n < NM[0]; n++) {
    for (let N = n + 1; N <= NM[0]; N++) {
      let flag = false;
      for (let m = 0; m < NM[1]; m++) {
        const num = numbers[m].split(" ").map(Number).slice(1);
        let dupFlag = false;
        let cheFlag = false;
        for (const i of num) {
          if (i === N) {
            cheFlag = true;
          }
          if (i === n) {
            dupFlag = true;
          }
        }
        if (cheFlag && dupFlag) {
          flag = true;
          break;
        }
      }
      if (!flag) {
        console.log("No");
        return 0;
      }
    }
  }
  console.log("Yes");
}

main(fs.readFileSync("/dev/stdin", "utf-8"));
