
$('document').ready(function(){
    $('table #editButton').on('click',function (event){
        event.preventDefault();
        //  /departments/findById/?id=1
        var href = $(this).attr('href');
        $.get(href,function (departments,status){
            $(' #idEdit').val(departments.id);
            $(' #nameEdit').val(departments.name);
            $(' #managerEdit').val(departments.manager);
            $(' #locationEdit').val(departments.location);
        });
        $('#editModal').modal();

    });
    $('table #deleteButton').on('click',function (event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
});