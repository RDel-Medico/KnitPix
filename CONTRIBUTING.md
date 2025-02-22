# Contributing to KnitPix

Thank you for your interest in contributing to KnitPix! We welcome contributions from both experienced developers who want to share their knowledge and newcomers eager to learn and grow. This guide will help you get started.

## How to Contribute

### 1. Finding an Issue
- Browse the Issues tab to find something you’d like to work on.
- If you have an idea for a new feature or improvement, open an issue for discussion before starting development.

### 2. Fork and Clone the Repository
- Fork the repository to your GitHub account.
- Clone your forked repository:
```
git clone https://github.com/your-username/KnitPix.git
cd KnitPix
```
- Add the original repository as an upstream remote:
```
git remote add upstream https://github.com/RDel-Medico/KnitPix.git
```
### 3. Creating a New Branch
- Always create a new branch from the main branch:
```
git checkout main
git pull upstream main
git checkout -b feature-branch-name
```
- Your branch should contain only one feature or bug fix related to a single issue.

### 4. Writing Code and Committing Changes
- Follow best coding practices and ensure your code is clean and well-documented.
- Write meaningful commit messages:
- Keep your branch updated with dev:
```
git fetch upstream
git merge upstream/main
```

### 5. Submitting a Pull Request (PR)
- Push your branch to your forked repository:
```
git push origin feature-branch-name
```
- Open a PR against the main branch.
- Clearly describe the changes, reference the issue number, and include screenshots if applicable.
- A maintainer will review your PR and may request changes.

### 6. Reviewing and Merging
- Your PR must meet code standards before merging.
- Once approved, your changes will be merged into main.

## Code of Conduct

By contributing, you agree to follow our [Code of Conduct](https://github.com/RDel-Medico/KnitPix/blob/main/CODE_OF_CONDUCT.md) to foster a welcoming and respectful environment.

## Need Help?

If you need any assistance, feel free to ask in the discussions or issues section.

Happy coding! 🎉

