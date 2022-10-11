function main(input) {
  const data = input.split("\n");
  const numbers = data[1].split(" ");
  let result = 0;
  for (const i of numbers) {
    result += Number(i, 10);
  }
  console.log(result);
}

main(require("fs").readFileSync("/dev/stdin", "utf8"));
