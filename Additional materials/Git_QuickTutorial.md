## What is Git?

**Git** is the most common **version control system** that is used by Software Engineers & Programmers, nowadays. You have several different hosting services for "Git Repositories" (Bitbucket, Gitlab, Github...), in our case we are using **Github**.

## Concepts

* **Clone**: Copy server version of the repository to your computer.
* **Pull**: A pull is the action to "fetch" what is in the repository at that moment, and update your local version with the version on the server. *(This is the way you keep your files synchronise with the web repository)*
* **Commits**: You create a "node" of the changes you have done. You should comment the changes, making it easier to traverse the nodes afterwards. (YOU DO NOT UPDATE THE SERVER VERSION WHEN YOU COMMIT, YOU NEED TO PUSH THE COMMITS)
* **Push**: A push is the action to update the repository with the changes you have done.
* **Master Branch**: This is the main branch of the project, this is like "the actual version of the project".
* **Branch**: You can use different branches apart from "Master", you create a branch when you want to work/create a feature of the project, without the need to check Master branch, or to make changes to Master branch. Example: Someone is working on the frontend of the web, so he create a branch called "web-front", and he will only commit and push changes to that branch, without modifying the Master branch.
* **Merge**: Join your changes/branches/etc... with Master. After you have work with a branch, when you want to join your "web-front" with the rest of the project, you merge it
* **Pull-request**: If you want to introduce something on Master, but you are not sure about it (or if the repository requires it, you ask for a "pull", meaning you push your changes to a branch but you are waiting to be review by the team in order to merge the changes to Master.

## Quick tutorial to update things to Git

1. **Pull** *(from the repository version)*
2. **Commit your changes** *(Create nodes of your changes)*
3. **Push** *(to the repository version)*

## Easiest way to Pull/Commit/Push/Branch... (Github) 

There are several programs that let you work easily on Github *(SourceTree, Github Desktop, TortoiseGit, GitKraken...)* You can even work with your terminal *(bash, cmd, powershell...)*.

I recommend you to use [Github Desktop](https://desktop.github.com). You will need to **log in** in your account. Then you will **clone the repositories** in a folder in your computer. Now, everytime you modify a file in that folder, you will see the changes on the app. You can check what changes you want to **commit** *(left part of the screen)*. And then you can Pull/Push to the server *(top part of the screen)*

## Links to tutorials:
* [Hello World Tutorial from Github](https://guides.github.com/activities/hello-world/)
* [Quick reference sheet commands](https://www.atlassian.com/dam/jcr:8132028b-024f-4b6b-953e-e68fcce0c5fa/atlassian-git-cheatsheet.pdf)
* [Github Desktop Tutorials](https://help.github.com/en/desktop)
* [Github Branch Tutorial](https://guides.github.com/introduction/flow/)
* [Github Tutorial Videos](https://www.youtube.com/user/GitHubGuides/featured)
* [Github Udemy Free Course](https://www.udemy.com/git-started-with-github/)



