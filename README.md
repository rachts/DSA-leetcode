<div align="center">

# 🧩 DSA LeetCode Solutions

**A curated, documented archive of my LeetCode solutions — one problem at a time.**

[![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![C](https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white)](https://en.wikipedia.org/wiki/C_(programming_language))
[![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)](https://www.python.org/)
[![Problems](https://img.shields.io/badge/problems-63-brightgreen?style=for-the-badge)](#-progress)

</div>

---

## 📌 About

This repository holds my solutions to **LeetCode** problems, organized one folder per problem. Each folder contains:

- 📄 **Problem statement** — full description, examples, and constraints
- 💻 **Solution code** — written for readability first, then efficiency

Solutions are in **Java** today; **C** and **Python** versions are on the roadmap.

---

## ✨ Highlights

- 📂 **One folder per problem**, named `{problem-id}-{kebab-case-title}`
- 📝 **Every problem documented** with its statement, examples, and constraints
- 🎯 **Broad topic coverage** — arrays, strings, linked lists, backtracking, DP, and more
- 🔄 **Actively maintained** — new solutions added regularly

---

## 🗂️ Repository Structure

```
DSA-leetcode/
├── 6-zigzag-conversion/
│   ├── README.md                  # Problem statement, examples, constraints
│   └── zigzag-conversion.java     # Solution
├── 20-valid-parentheses/
│   ├── README.md
│   └── valid-parentheses.java
├── 42-trapping-rain-water/
│   ├── README.md
│   └── trapping-rain-water.java
└── ...                            # One folder per problem
```

---

## 📊 Progress

| Metric | Count |
|:-------|------:|
| Problems documented | **63** |
| Java solutions | **61** |
| C solutions | 0 |
| Python solutions | 0 |

---

## 🧠 Topics Covered

| Topic | Example Problems |
|:------|:-----------------|
| **Arrays & Two Pointers** | Remove Duplicates from Sorted Array, Trapping Rain Water, 3Sum Closest |
| **Strings** | Zigzag Conversion, Count and Say, Reverse Substrings Between Parentheses |
| **Linked Lists** | Merge Two Sorted Lists, Reverse Nodes in k-Group, Remove Nth Node From End |
| **Stacks** | Valid Parentheses, Longest Valid Parentheses, Score of Parentheses |
| **Backtracking** | Sudoku Solver, Permutations II, Combination Sum II |
| **Dynamic Programming** | Unique Paths, Edit Distance |
| **Binary Search** | Find First and Last Position in Sorted Array |
| **Greedy & Intervals** | Jump Game, Merge Intervals |
| **Math & Hashing** | Group Anagrams, Pow(x, n), Permutation Sequence |
| **Matrices & Simulation** | Valid Sudoku, Set Matrix Zeroes, Spiral Matrix II |

---

## 🚀 Usage

```bash
git clone https://github.com/rachts/DSA-leetcode.git
cd DSA-leetcode/42-trapping-rain-water
```

Solutions use LeetCode's `class Solution { ... }` format, so they don't include a `main` method. To run one locally, paste it into the LeetCode editor, or wrap it in a small test harness:

```java
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // 6
    }
}
```

*(Requires JDK 8+.)*

---

## 🛣️ Roadmap

- [x] Document each problem with its full statement
- [x] Cover the core DSA topics
- [ ] Add time & space complexity notes to each solution
- [ ] Tag problems by difficulty (Easy / Medium / Hard)
- [ ] Add C solutions
- [ ] Add Python solutions

---

## 🤝 Contributing

Suggestions and improvements are welcome. Feel free to open an issue or pull request to:

- Add a solution in another language
- Propose a more optimal approach
- Fix or improve documentation

---

## ⚠️ Disclaimer

All problem statements belong to **[LeetCode](https://leetcode.com/)**. The solutions here are my own implementations, shared for learning and reference.

---

<div align="center">

⭐ *If this repo helps you, a star keeps the motivation going.* ⭐

</div>
