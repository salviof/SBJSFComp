

cd /home/superBits/projetos/Faculdade_Java/source/SBJSFComp/
find . -name target -type d -exec rm -rf {} \;

cd /home/superBits/projetos/Super_Bits/source/SuperBits_FrameWork/
find . -name target -type d -exec rm -rf {} \;
./sincronizaGit.sh 

cd /home/superBits/projetos/Faculdade_Java/source/SBJSFComp/
find . -name target -type d -exec rm -rf {} \;


./sincronizaGit.sh







