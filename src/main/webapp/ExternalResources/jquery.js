
function ajaxFunction()
{
    var uname = $('#name').val();
    var usuggestion = $('#suggestion').val();

    $.ajax({
        type : "post",
        url : "/checkAjax",
        data : JSON.stringify({ name: "Dinesh" }),
        contentType:"application/json; charset=utf-8",
        success : function(response)
        {
            $('#result').html(response);
            $('#resultText').val(response);
            $('#name').val('reseted text');
        },
        error: function(e)
        {
            console.log(e);
            console.log(e.message);
            alert('Error '+ e);
        }
    });
    return false;
}