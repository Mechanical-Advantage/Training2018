GitHub tutorial
Note: Make sure git is installed on your computer
    - Check by typing "git" in the console
1) In a folder of your choosing, 
    - git clone "https://github.com/Mechanical-Advantage/Training2018.git" 
2) Make a branch on the repository
    - git branch <branch name>
3) Switch to the branch
    - git checkout <branch name that was just made>
2) Navigate to Mechanical-Advantage/Training2018/examples/githubTraining folder
3) Find the file "Editme.java"
4) Create a class of your liking 
    - Give it a name of "<yourName>.java"
    - Make it do something really cool :)
5) Navigate to EditMe.java 
    - Add your "Class.method()" to the main method
    - This way anyone who wants to run the code can do so
6) From the staging area, you will need to add your files to get committed
    - git add .
    - This will add all your files that you have changed from the local(your computer) to the staging area to be committed
6) Commit your changes
    - git commit -m "<commit message>"
7) You will then push your changes so that they are published to the github servers
    - git push
8) Navigate to www.github.com
    - Login
    - Navigate to Mechanical-Advantage/Training2018
    - Should see a green "Create Pull request" of your branch
        - This will allow your changes to be merged to the master branch
9) I will merge your changes into master
10) Run the EditMe.java
    - If all done right, you should be able to see each other's files and each other's changes.
