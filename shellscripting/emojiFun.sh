my_list=("apple" "balloon" "cat" "dog" "example" "fox" "giraffe" "happy" "icecream" "joke" "kite" "lamp" "mango" "night" "orange" "parrot" "quest" "rabbit" "state" "temperatue" "umbrella" "vital" "water" "xray" "yogurt" "zebra")
emoji_list=("🍎" "🎈" "🐱" "🐶" "💡" "🦊" "🦒" "😃" "🍦" "😄" "🪁" "🔦" "🥭" "🌃" "🍊" "🦜" "🔍" "🐇" "🏛️" "🌡️" "☂️" "🩸" "💧" "💀" "🍨" "🦓")

while true; do
    echo type quit to exit
    read -p "Enter a variable : " user_input
    if [[ "$user_input" == "quit" ]]; then
        echo "Exiting the program..."
        break
    fi

    found_match=false
    
    for i in "${!my_list[@]}"; do
        if [[ "${user_input,,}" == "${my_list[$i]:0:1}" ]]; then
            espeak "$user_input is for ${my_list[$i]}"
            echo "${emoji_list[$i]}"
	    figlet "${my_list[$i]}"
            found_match=true
            break
        fi
    done
    
    if [[ "$found_match" == false ]]; then
        echo "No match found."
    fi
done
