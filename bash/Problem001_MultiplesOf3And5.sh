t=0

for i in {1..999}
do
    if [ $(( i % 3 )) == 0 ] || [ $(( i % 5 )) == 0 ]
    then 
        t=$((t + i))
        echo "$t $i"
    fi
done


echo "$t"
