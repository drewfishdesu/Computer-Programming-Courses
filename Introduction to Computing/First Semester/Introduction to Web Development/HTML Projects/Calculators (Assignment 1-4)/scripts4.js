let payrollData = [];

function addEmployee() {
    // Get input values
    const name = document.getElementById('name').value;
    const daysWorked = parseInt(document.getElementById('daysWorked').value);
    const dailyRate = parseFloat(document.getElementById('dailyRate').value);
    const deduction = parseFloat(document.getElementById('deduction').value);

    // Error handling and input validation
    if (!name || !daysWorked || !dailyRate || !deduction) {
        alert("Please fill out all fields.");
        return;
    }

    // Calculate Gross and Net Pay
    const grossPay = daysWorked * dailyRate;
    const netPay = grossPay - deduction;

    // Add employee to payroll data
    payrollData.push({
        name: name,
        daysWorked: daysWorked,
        dailyRate: dailyRate,
        grossPay: grossPay,
        deduction: deduction,
        netPay: netPay,
    });

    // Updates the table
    updatePayrollTable();

    // Clears the form
    document.getElementById('name').value = '';
    document.getElementById('daysWorked').value = '';
    document.getElementById('dailyRate').value = '';
    document.getElementById('deduction').value = '';
}

function updatePayrollTable() {
    const tableBody = document.getElementById('payrollTable').getElementsByTagName('tbody')[0];
    tableBody.innerHTML = ''; // Clear current table rows
    let totalGross = 0;
    let totalDeduction = 0;
    let totalNet = 0;

    payrollData.forEach((employee, index)  =>{
        totalGross += employee.grossPay;
        totalDeduction += employee.deduction;
        totalNet += employee.netPay;
        
        const row = tableBody.insertRow();
        row.innerHTML = `
        <td style="text-align: right; padding-right: 10px">${index + 1}</td>
        <td>${employee.name}</td>
        <td style="text-align: right">${employee.daysWorked}</td>
        <td style="text-align: right">${employee.dailyRate.toFixed(2)}</td>
        <td style="text-align: right">${employee.grossPay.toFixed(2)}</td>
        <td style="text-align: right">${employee.deduction.toFixed(2)}</td>
        <td style="text-align: right">${employee.netPay.toFixed(2)}</td>
        <td><button onclick="deleteEmployee(${index})">Delete</button></td>
        `;
        document.getElementById("totalGross").innerHTML = totalGross.toFixed(2);
        document.getElementById("totalDeduction").innerHTML = totalDeduction.toFixed(2);
        document.getElementById("totalNet").innerHTML = totalNet.toFixed(2);
    });
}

function deleteEmployee(index = -1) {
    if(index === -1) {
        // Ask for a line number if no index is passed
        const lineNumber = prompt("Enter the line number to delete: ");
        const lineIndex = parseInt(lineNumber) - 1;

        if(lineIndex >= 0 && lineIndex < payrollData.length) {
            payrollData.splice(lineIndex, 1);
            updatePayrollTable();
        } else {
            alert("Invalid Line Number.");
        }
    } else {
        // Delete employee directly if index is provided
        payrollData.splice(index, 1);
        updatePayrollTable();
    }
}