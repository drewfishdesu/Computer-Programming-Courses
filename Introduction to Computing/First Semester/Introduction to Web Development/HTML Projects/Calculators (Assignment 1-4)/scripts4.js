let payrollData = [];

// Add employee
function addEmployee() {
    // Get form values
    const name = document.getElementById('name').value.trim();
    const daysWorked = parseInt(document.getElementById('daysWorked').value);
    const dailyRate = parseFloat(document.getElementById('dailyRate').value);
    const deduction = parseFloat(document.getElementById('deduction').value);

    // Validate inputs
    if (!name || daysWorked <= 0 || dailyRate < 0 || deduction < 0) {
        alert("Please provide valid inputs.");
        return;
    }

    // Calculate payroll details
    const grossPay = daysWorked * dailyRate;
    const netPay = grossPay - deduction;

    // Add employee to payroll array
    payrollData.push({ name, daysWorked, dailyRate, grossPay, deduction, netPay });

    // Update table and clear form
    updatePayrollTable();
    document.getElementById('payrollForm').reset();
}

// Update payroll table
function updatePayrollTable() {
    const tableBody = document.querySelector('#payrollTable tbody');
    tableBody.innerHTML = ''; // Clear table

    // Totals
    let totalGross = 0;
    let totalDeduction = 0;
    let totalNet = 0;

    payrollData.forEach((employee, index) => {
        totalGross += employee.grossPay;
        totalDeduction += employee.deduction;
        totalNet += employee.netPay;

        // Create row
        const row = `
            <tr>
                <td>${index + 1}</td>
                <td>${employee.name}</td>
                <td>${employee.daysWorked}</td>
                <td>${employee.dailyRate.toFixed(2)}</td>
                <td>${employee.grossPay.toFixed(2)}</td>
                <td>${employee.deduction.toFixed(2)}</td>
                <td>${employee.netPay.toFixed(2)}</td>
                <td><button onclick="deleteEmployee(${index})">Delete</button></td>
            </tr>
        `;
        tableBody.insertAdjacentHTML('beforeend', row);
    });

    // Update totals
    document.getElementById('totalGross').textContent = totalGross.toFixed(2);
    document.getElementById('totalDeduction').textContent = totalDeduction.toFixed(2);
    document.getElementById('totalNet').textContent = totalNet.toFixed(2);
}

// Delete employee
function deleteEmployee(index) {
    const isSure = confirm(`Are you sure you want to delete ${payrollData[index].name}?`);
    if (isSure) {
        payrollData.splice(index, 1);
        updatePayrollTable();
    }
}