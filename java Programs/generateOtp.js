// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler
function generateOtp(limit)
{
    var digit = '0123456789';
    let OTP = '';
    for(let i=0;i<limit;i++){
        OTP +=digit[Math.floor(Math.random()*10)];
    }
    return OTP;
}

console.log("Your OTP is here",generateOtp(6));
console.log("Don't share your otp");
console.log("with anyone");