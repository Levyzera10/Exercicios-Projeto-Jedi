WORKFLOW
Working Dire --> (add) index --> (commit) head 

Working directory : new files 
index : temporary area 
head : the last commit 

( inside of index )
add and confirm  
git add . <arquivo>

alterations 
git commit -m "comments"
- the file will be sent  to HEAD , but not to the  remote repository yet.-

SEND ALTERATIONS 
Head --> repository remote 
git push origin master 

add an existing repository to  a remote server 
git remote add origin <server>

BRANCHES 
- Are used to develop isolated function from the others-

new branch : git checkout -b function_x
return : git checkout master 
remove : git branch -d function_x

- a branch won't be available unless you send it to your remote repository.-
git push origin < function_x>

UPDATE AND MERGE
- update your local repository-
git pull 
- to merge another branch to your use -
git merge < branch>

LABELING 
- Is recommended make labels to software releases -
git tag 1.0.0 1b2e1d63ff
  - commit id - git log 

-OVERWRITE LOCAL CHANGES-
git checkout -- <file>

-to remove all the changes and local commits-
git fetch origin
git reset --hard origin/master

TIPS
 graphic interface 
gitk

use colored outputs 
git config color.ui true 

display log in one line for commit 
git config format.pretty oneline 

include interactions 
git add -i

