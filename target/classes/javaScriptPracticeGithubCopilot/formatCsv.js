//Create a function to format the data into CSV format
//The function should read csv file, format the data and write it to a new CSV file
//Use the csv-parser library to parse the input csv file
//Format the 'name' field to uppercase, 'age' field as an integer and 'city' field to lowercase
//USe the 'fast-csv' library to write the formatted data to the output csv file
//Log a message when the process is complete

const csv = require('csv-parser');
const fs = require('fs');
const fastcsv = require('fast-csv');

const formatCSV = (inputFile, outputFile) => {
    const writeStream = fs.createWriteStream(outputFile);
    const csvStream = fastcsv.format({ headers: true });
    csvStream.pipe(writeStream);

    fs.createReadStream(inputFile)
        .pipe(csv())
        .on('error', (error) => console.error(error))
        .on('data', (row) => {
            csvStream.write({
                name: row.name.toUpperCase(),
                age: parseInt(row.age),
                city: row.city.toLowerCase()
            });
        })
        .on('end', () => {
            csvStream.end();
            console.log('CSV processing complete.');
        });
};