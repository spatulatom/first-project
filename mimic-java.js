// const readline = require("node:readline");
import readline from "node:readline";

const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
});

rl.question("What is your name? ", (name) => {
	rl.question("How old are you? ", (ageInput) => {
		const age = Number.parseInt(ageInput, 10);

		if (Number.isNaN(age)) {
			console.log("Please enter a valid number for age.");
		} else {
			console.log(`Hi ${name}! You are ${age} years old.`);
		}

		rl.close();
	});
});
