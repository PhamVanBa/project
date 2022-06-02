var ListDepartment = [];

$(document).ready(function() {

    getData();

    $('[data-toggle="tooltip"]').tooltip();
    var actions = $("table td:last-child").html();

    getDataDepartment();
    // Append table with add row form on add new button click
    $(".add-new").click(function() {
        //     $(this).attr("disabled", "disabled");
        //     var index = $("table tbody tr:last-child").index();
        //     var row = '<tr>' +
        //         '<td><input type="text" class="form-control" name="name" id="name"></td>' +
        //         '<td><input type="text" class="form-control" name="department" id="department"></td>' +
        //         '<td><input type="text" class="form-control" name="phone" id="phone"></td>' +
        //         '<td>' + actions + '</td>' +
        //         '</tr>';
        //     $("table").append(row);
        //     $("table tbody tr").eq(index + 1).find(".add, .edit").toggle();
        //     $('[data-toggle="tooltip"]').tooltip();
    });
    // Add row on add button click
    $(document).on("click", ".add", function() {
        // var empty = false;
        // var input = $(this).parents("tr").find('input[type="text"]');
        // input.each(function() {
        //     if (!$(this).val()) {
        //         $(this).addClass("error");
        //         empty = true;
        //     } else {
        //         $(this).removeClass("error");
        //     }
        // });
        // $(this).parents("tr").find(".error").first().focus();
        // if (!empty) {
        //     input.each(function() {
        //         $(this).parent("td").html($(this).val());
        //     });
        //     $(this).parents("tr").find(".add, .edit").toggle();
        //     $(".add-new").removeAttr("disabled");
        // }
    });
    // Edit row on edit button click
    $(document).on("click", ".edit", function() {
        // $(this).parents("tr").find("td:not(:last-child)").each(function() {
        //     $(this).html('<input type="text" class="form-control" value="' + $(this).text() + '">');
        // });
        // $(this).parents("tr").find(".add, .edit").toggle();
        // $(".add-new").attr("disabled", "disabled");
    });
    // Delete row on delete button click
    $(document).on("click", ".delete", function() {
        // $(this).parents("tr").remove();
        // $(".add-new").removeAttr("disabled");
    });
});

function getData(sorted) {
    $("tbody").empty();
    var url = "http://localhost:8090/v1/api/accounts?pageNumber=" + page + "&size=" + size;
    if (minId > 0) {
        url += "&minId=" + minId;
    }
    if (maxId > 0) {
        url += "&maxId=" + maxId;
    }

    if (sorted != null) {
        url += sorted;
    }

    var settings = {
        "url": url,
        "method": "GET",
        "timeout": 0,
    };

    $.ajax(settings).done(function(response) {
        var lessonHtml = "";
        response.content.forEach(item => {
            lessonHtml +=
                `<tr>
                <td>${item.id}</td>
                <td>${item.userName}</td>
                <td>${item.email}</td>
                <td>${item.fullName}</td>
                <td>
                    <a class="edit" title="Edit" data-toggle="tooltip" onclick="updateAccount(${item.id}, this)"><i class="material-icons">&#xE254;</i></a>
                    <a class="delete" title="Delete" data-toggle="tooltip" onclick="deleteAccount(${item.id}, this)"><i class="material-icons">&#xE872;</i></a>
                </td>
            </tr>`
        });

        $("tbody").html(lessonHtml)

        createPagination(response.totalPages,
            response.totalElements,
            response.number,
            response.numberOfElements,
            response.last, response.first)
    });
}
// <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>

var page = 1;
var size = 7;
var offsetPage = 1;
var pageSize = 7;
var minId = 0;
var maxId = 0;


function createPagination(totalPage, totalElements, pageNumber, numberOfElements, last, first) {
    $(".clearfix").empty(); // xoa noi dung trong the clearfix cu di
    var textHtml = `<div class="hint-text">Showing <b>${numberOfElements}</b> out of <b>${totalElements}</b> entries</div>`
    textHtml += `<ul class="pagination">`
    if (offsetPage < pageSize + 1) {
        textHtml += `<li class="page-item disabled"><a href="#">Previous</a></li>`
    } else {
        textHtml += `<li class="page-item"><a onclick="clickPreviousPage()">Previous</a></li>`
    }
    if (offsetPage + pageSize - 1 < totalPage) {
        for (let x = offsetPage; x < offsetPage + pageSize; x++) {
            textHtml += `<li class="page-item ${checkActive(x)}"><a onclick="clickSelectPage(${x})" class="page-link">${x}</a></li>`
        }
        // textHtml += `<li class="page-item ${checkActive(offsetPage)}"><a onclick="clickSelectPage(${offsetPage})" class="page-link">${offsetPage}</a></li>`
        // textHtml += `<li class="page-item ${checkActive(offsetPage+1)}"><a onclick="clickSelectPage(${offsetPage+1})" class="page-link">${offsetPage+1}</a></li>`
        // textHtml += `<li class="page-item ${checkActive(offsetPage+2)}"><a onclick="clickSelectPage(${offsetPage+2})" class="page-link">${offsetPage+2}</a></li>`
        // textHtml += `<li class="page-item ${checkActive(offsetPage+3)}"><a onclick="clickSelectPage(${offsetPage+3})" class="page-link">${offsetPage+3}</a></li>`
        // textHtml += `<li class="page-item ${checkActive(offsetPage+4)}"><a onclick="clickSelectPage(${offsetPage+4})" class="page-link">${offsetPage+4}</a></li>`
    } else {
        for (let x = offsetPage; x <= totalPage; x++) {
            textHtml += `<li class="page-item ${checkActive(x)}"><a onclick="clickSelectPage(${x})" class="page-link">${x}</a></li>`
        }
    }
    if (offsetPage > totalPage - pageSize) {
        textHtml += `<li class="page-item disabled"><a href="#" class="page-link">Next</a></li>`
    } else {
        textHtml += `<li class="page-item"><a onclick="clickNextPage()" class="page-link">Next</a></li>`
    }
    textHtml += `</ul>`
    $(".clearfix").html(textHtml);
}

function clickPreviousPage() {
    offsetPage -= pageSize;
    page = offsetPage;
    getData();
}

function clickNextPage() {
    offsetPage += pageSize;
    page = offsetPage;
    getData();
}
/** neu tra ve page thi tra ve active con ko thi tra ve rong*/
function checkActive(p) {
    console.log("page = " + page + ", p = " + p)
    if (p == page) {
        return "active"
    } else {
        return ""
    }
}

function clickSelectPage(pageSelected) {
    if (pageSelected != page) {
        page = pageSelected;
        getData();
    }
}

var sort = 'asc'

function sortColumn(variable) {
    if (variable == 1) {
        if (sort == 'asc') {
            var textSort = '&sort=userName,asc';
            getData(textSort);
            sort = 'desc';
        } else {
            var textSort = '&sort=userName,desc';
            getData(textSort);
            sort = 'asc';
        }
    }
}

function openAddModal() {
    $("#myModal").modal("show");
    // hien thi modal
    // $("#myModal").css("display", "block");

    //clear
    $("#userName").val("");
    $("#email").val("");
    $("#fullName").val("");
    $("#select-department").val("");

    // doi title
    $("#title-modal").html("ADD NEW");
    // doi text button modal
    // button-update
    $("#button-update").html("SAVE");
    $("#button-update").click(function() {
        console.log("click add");
        // lay du lieu tu 3 cai input
        var userName = $("#userName").val();
        var email = $("#email").val();
        var fullName = $("#fullName").val();
        var departmentId = $("#select-department").val();
        createNew(userName, email, fullName, departmentId);
    });
}



function createNew(userName, email, fullName, departmentId) {

    var settings = {
        url: "http://localhost:8090/v1/api/accounts",
        method: "POST",
        timeout: 0,
        headers: {
            "Content-Type": "application/json"
        },
        data: `{ "userName": "${userName}", "email": "${email}", "fullName": "${fullName}", "departmentId" : "${departmentId}"}`,
    };

    $.ajax(settings).done(function(response) {
        $("#myModal").modal('hide');
        alert("");
        getData();
    });
}

function getDataDepartment() {

    var settings = {
        url: "http://localhost:8090/v1/api/departments",
        method: "GET",
        timeout: 0,
    };

    $.ajax(settings).done(function(response) {
        console.log(response);
        var lessonHtml = "";
        response.content.forEach(item => {
            lessonHtml += `<option value="${item.id}">${item.departmentName}</option>`
        });
        ListDepartment = response.content;
        var tagSelect = $("#select-department");
        tagSelect.empty();
        tagSelect.html(lessonHtml);
    });
}

function searchMinMax() {
    page = 1;
    $("tbody").empty();
    var url = "http://localhost:8090/v1/api/accounts?pageNumber=" + page + "&size=" + size;


    if ($("#minId").val() > 0) {
        url += "&minId=" + $("#minId").val();
        minId = $("#minId").val();
    }
    if ($("#maxId").val() > 0) {
        url += "&maxId=" + $("#maxId").val();
        maxId = $("#maxId").val();
    }

    var settings = {
        "url": url,
        "method": "GET",
        "timeout": 0,
    };

    $.ajax(settings).done(function(response) {
        var lessonHtml = "";
        response.content.forEach(item => {
            lessonHtml +=
                `<tr>
                <td>${item.id}</td>
                <td>${item.userName}</td>
                <td>${item.email}</td>
                <td>${item.fullName}</td>
                <td>
                    
                    <a class="edit" title="Edit" data-toggle="tooltip" onclick="updateAccount(${item.id}, this)" ><i class="material-icons">&#xE254;</i></a>
                    <a class="delete" title="Delete" data-toggle="tooltip" onclick="deleteAccount(${item.id}, this)" ><i class="material-icons">&#xE872;</i></a>
                </td>
            </tr>`
        });

        $("tbody").html(lessonHtml)
        createPagination(response.totalPages,
            response.totalElements,
            response.number,
            response.numberOfElements,
            response.last, response.first)
    });
}

function refreshMinMax() {
    $("#minId").val("display", "none");
    $("#maxId").val("display", "none");

    minId = 0;
    maxId = 0;

    $("tbody").empty();

    getData();
}

function searchFullName() {
    page = 1;
    $("tbody").empty();
    var url = "http://localhost:8090/v1/api/accounts?pageNumber=" + page + "&size=" + size;


    if ($("#fullName").val() > 0) {
        url += "&fullName=" + $("#fullName").val();
        fullName = $("#fullName").val();
    }


    var settings = {
        "url": url,
        "method": "GET",
        "timeout": 0,
    };

    $.ajax(settings).done(function(response) {
        var lessonHtml = "";
        response.content.forEach(item => {
            lessonHtml +=
                `<tr>
                <td>${item.id}</td>
                <td>${item.userName}</td>
                <td>${item.email}</td>
                <td>${item.fullName}</td>
                <td>
                    
                    <a class="edit" title="Edit" data-toggle="tooltip" onclick="updateAccount(${item.id}, this)" ><i class="material-icons">&#xE254;</i></a>
                    <a class="delete" title="Delete" data-toggle="tooltip" onclick="deleteAccount(${item.id}, this)" ><i class="material-icons">&#xE872;</i></a>
                </td>
            </tr>`
        });

        $("tbody").html(lessonHtml)
        createPagination(response.totalPages,
            response.totalElements,
            response.number,
            response.numberOfElements,
            response.last, response.first)
    });
}

// delete single account
function deleteAccount(accountId, fullName) {
    $('#myModalDelete').modal('show');
    document.getElementById('delete-single-account-confirm-mess').innerHTML = 'This action can not be undone. Delete <span style="color:red;">' + fullName + '</span>?';
    document.getElementById('delete-single-account-btn').onclick = function() { deleteSingleAccount(accountId) };
}

function deleteSingleAccount(accountId) {
    console.log("--> click delete")
    $.ajax({
        url: 'http://localhost:8090/v1/api/accounts/' + accountId,
        type: 'DELETE',
        success: function(result) {
            // error
            if (result == undefined || result == null) {
                alert("Error when loading data");
                return;
            }
            $('#myModalDelete').modal('hide');
            getData();
        }
    });
}

function updateAccount(id, element) {
    var listTd = $(element).parents("tr").find("td");

    var userName, email, fullName, departmentId, departmentName;
    listTd.each(function(index) {
        switch (index) {
            case 1:
                userName = $(this).text();
                break;
            case 2:
                email = $(this).text();
                break;
            case 3:
                fullName = $(this).text();
                break;
            case 4:
                departmentId = $(this).text();
                break;
            case 5:
                departmentName = $(this).text();
                break;
        }
    });

    $("#myModal").modal("show");
    // $("#myModal").css("display", "block"); //show modal
    $("#userName").val(userName);
    $("#email").val(email);
    $("#fullName").val(fullName);
    $("#select-department").val(departmentId);

    // $("#select-department").val(departmentName);

    $("#button-update").click(function() {
        $("#myModal").modal('hide');
        // $("#myModal").css("display", "none"); //
        updateAccounts(
            id,
            $("#userName").val(),
            $("#email").val(),
            $("#fullName").val(),
            $("#select-department").val(),
            // $("#select-department").val(),

        );
    });
}

function updateAccounts(idItem, userName, email, fullName, departmentId) {
    $.ajax({
        url: "http://localhost:8090/v1/api/accounts/" + idItem,
        type: "PUT",
        headers: {
            "Content-Type": "application/json",
        },
        data: `{ "userName": "${userName}", "email": "${email}", "fullName": "${fullName}", "departmentId" : "${departmentId}"}`,
        success: function(listData, status, xhr) {
            alert("Update success");
            $("#myModal").modal('hide');
            getData();
        },

        error: function(data, status, xhr) {
            alert("Lỗi update item => " + idItem);
        },
    });
}