find . -name target -type d -exec rm -rf {} \;

git pull
git add --all
git commit -m "Atualizacao automática"
git push

cd webApp/src/main/webapp/resources/SBComp/
./sincroniza.sh

