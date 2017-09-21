process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var h = parseInt(readLine());
    var m = parseInt(readLine());

    nums = ['', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', ' ten',
                   'eleven', 'twelve', 'thirteen', 'fourteen', 'quarter', 'sixteen', 'seventeen', 'eighteen',
                   'nineteen', 'twenty', 'twenty one', 'twenty two', 'twenty three', 'twenty four', 'twenty five',
                   'twenty six', 'twenty seven', 'twenty eight', 'twenty nine'];

    if(m === 0){
        console.log(nums[h] + ' o\' clock');
    }
    else if(m > 30){
        if(m === 45){
            console.log(nums[(60- m)] + ' to ' + nums[h + 1]);
        }
        else{
            console.log(nums[(60 - m)] + ' minutes to ' + nums[h + 1]);
        }
    }
    else if(m < 30){
        if(m === 1){
            console.log(nums[m] + ' minute past ' + nums[h]);
        }
        else if(m === 15){
            console.log(nums[m] + ' past ' + nums[h]);
        }
        else{
            console.log(nums[m] + ' minutes past ' + nums[h]);
        }
    }
    else{
        console.log('half past ' + nums[h]);
    }

}
