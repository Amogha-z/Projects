function _(id){
    return document.getElementById(id);
}
const POSSIBILITIES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
const OUTPUT = _("output");

function baseToDecimal(decimal,base){
    let output= 0;       
    place=0;
    if(base==16){
        for(let i = decimal.length-1; i>-1; i--){
            if (typeof decimal[i] === 'string' && (decimal[i] >= 'a' && decimal[i] <= 'f'|| decimal[i]>='A' && decimal[i]<='f')){
                output+=POSSIBILITIES.indexOf(decimal[i]) * (base**place)        
                place+=1
            }
            else{
                break;
            }
        }
    }
    for(let i = decimal.length-1; i>-1; i--){   
        output+=POSSIBILITIES.indexOf(decimal[i]) * (base**place)        
        place+=1    
    }    
    return output;
}

function decimalToBase(decimal,base) {
    let output = "";
    while (decimal > 0) { 
        output += POSSIBILITIES[decimal % base]; 
        decimal = Math.floor(decimal / base) 
    } 
    output = output.split("").reverse().join("");
    return output; 
}

function baseConvert(){
    let decimal;
    let result;
    let inpValue = _("inputValue").value;
    let base1 = parseInt(_("selection1").value);
    let base2 = parseInt(_("selection2").value);
    if (base1===base2 || inpValue==0){
        OUTPUT.innerHTML = inpValue;
        return;
    }
    else if(base1===10){
        for(let i=0; i<inpValue.length; i++){
            if (typeof inpValue[i] === 'string' && (inpValue[i] >= 'a' && inpValue[i] <= 'z'|| inpValue[i]>='A' && inpValue[i]<='Z')) {
                let error="Decimal doesn't take string values. Give only numbers."
                OUTPUT.innerHTML = "<span class='error'>" + error +"</span>";
                return;
        }
        decimal=inpValue;
        result = decimalToBase(decimal,base2);
        }
    }
    else if(base1===8){
        for(let i=0; i<inpValue.length; i++){
            if(parseInt(inpValue[i])>7){
                let error=`Can't calculate base ${base2} from the given octal value.`;
                OUTPUT.innerHTML = "<span class='error'>" + error +"</span>";
                return;
            }
            else if (typeof inpValue[i] === 'string' && (inpValue[i] >= 'a' && inpValue[i] <= 'z'|| inpValue[i]>='A' && inpValue[i]<='Z')) {
                let error="Octal doesn't take string values. Give only numbers."
                OUTPUT.innerHTML = "<span class='error'>" + error +"</span>";
                return;
            }  
        decimal = baseToDecimal(inpValue,base1);
        result = decimalToBase(decimal,base2);    
        }
    }
    else if(base1===2){
        for(let i=0; i<inpValue.length; i++){
            if(parseInt(inpValue[i])>1){
                let error="A binary should only have 1s and 0s."
                OUTPUT.innerHTML = "<span class='error'>" + error +"</span>";
                return;
            }
            else if (typeof inpValue[i] === 'string' && (inpValue[i] >= 'a' && inpValue[i] <= 'z'|| inpValue[i]>='A' && inpValue[i]<='Z')) {
                let error="Binary doesn't take string values. Give only numbers."
                OUTPUT.innerHTML = "<span class='error'>" + error +"</span>";
                return;
            }
        decimal = baseToDecimal(inpValue,base1);
        result = decimalToBase(decimal,base2);
        }
    }
    else if(base1===16){
        let modified = "";
        for(let i=0; i<inpValue.length; i++){
            modified+=inpValue[i].toUpperCase();
        }
        inpValue=modified;
        decimal = baseToDecimal(inpValue,base1);
        result = decimalToBase(decimal,base2);
        
    }
    OUTPUT.innerHTML = result;
}
function reset(){
    OUTPUT.innerHTML ="";
    _("inputValue").value = "";
}