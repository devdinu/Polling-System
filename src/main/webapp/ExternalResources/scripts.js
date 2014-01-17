function showNameControl() {
    document.getElementById('NameControl').style.visibility = 'visible'
    document.getElementById('IdControl').style.visibility = 'hidden'
}
function showIdControl() {
    document.getElementById('IdControl').style.visibility = 'visible'
    document.getElementById('NameControl').style.visibility = 'hidden'
}

function checkControls() {
    var $fields = $(".form :input");
    if (document.getElementById('userName').value == 0) {
        alert("Name Field Empty");
//            document.getElementById('userName').style.backgroundColor = 'read';
    }
}


