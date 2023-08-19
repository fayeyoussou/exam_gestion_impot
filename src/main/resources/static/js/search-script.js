document.getElementById('search-input').addEventListener('input', function() {
    var searchText = this.value.toLowerCase();
    var tableRows = document.querySelectorAll('table tbody tr');
    console.log('inout')
    tableRows.forEach(function(row) {
        var rowData = row.textContent.toLowerCase();
        if (rowData.includes(searchText)) {
            row.style.display = 'table-row';
        } else {
            row.style.display = 'none';
        }
    })
});
