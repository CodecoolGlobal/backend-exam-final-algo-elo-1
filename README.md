### What to print? You decide!

You are being interviewed for a junior developer position. Your task is the following:

Implement a method which gets two parameters:

- a string array
- an integer

If the integer is divisible by `3` then return the **first** element of the _string array_.
If the integer is divisible by `7` then return the **second** element of the _string array_.
If the integer is divisible by `3` and also by `7`, then return a _string_ with the array's **first and second** elements concatenated (in the same order as they are in the array).
In any other cases, return an **empty string**.

Examples:
The string array input is `{"Code", "Cool"}`
If the integer input is `9`, the method returns `"Code"`.
If the integer input is `14`, the method returns `"Cool"`.
If the integer input is `21`, the method returns `"CodeCool"`.
If the integer input is `2`, the method returns `""`.

Note: the string array input will always contain at least two items.