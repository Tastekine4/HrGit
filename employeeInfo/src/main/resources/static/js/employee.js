
$('document').ready(function(){
   $('table #editButton').on('click',function (event){
      event.preventDefault();
      //  /employee/findById/?id=1

      var href = $(this).attr('href');
      $.get(href,function (employee,status){
         $(' #idEdit').val(employee.id);
         $(' #firstNameEdit').val(employee.firstName);
         $(' #lastNameEdit').val(employee.lastName);
         $('#sicil_noEdit').val(employee.sicil_no);
      //   $('#departmentNameEdit').val(employee.department.name);
         $('#positionEdit').val(employee.position);
         $('#emailEdit').val(employee.email);
         $('#phoneEdit').val(employee.phone);
         console.log(employee.phone);
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