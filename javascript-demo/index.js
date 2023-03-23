const mariadb = require("mariadb");
const fs = require("fs");

async function main() {
	try {
		var connection = await mariadb.createConnection({
			host: "DOMAIN_NAME",
			database: "demo",
			user: "USER",
			password: "PASSWORD",
			ssl: { ca: fs.readFileSync("CERT_PEM") }
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