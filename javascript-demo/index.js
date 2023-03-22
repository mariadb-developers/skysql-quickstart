const mariadb = require("mariadb");
const fs = require("fs");

async function main() {
	try {
		var connection = await mariadb.createConnection({
			host: "dbpwf11745551.sysp0000.db1.skysql.net",
			port: 3306,
			database: "demo",
			user: "dbpwf11745551",
			password: "VTXhBV-HS9ygo2rPR+yH7Nx",
			ssl: { ca: fs.readFileSync("/Users/alejandro/Downloads/skysql_chain_2022.pem") }
		});

		let rows = await connection.execute("select * from messages");
		rows.forEach(row => console.log(row.content));

	} catch (error) {
		console.error(error);
	} finally {
		if (connection) connection.end();
	}
}

main();