import mariadb

try:
    with mariadb.connect(
            host="dbpgf24938486.sysp0000.db.skysql.net",
            port=3306,
            database="demo",
            user="dbpgf24938486",
            password="1%E5pTCkW7.SFCZD27P4x7",
            ssl_ca="/Users/alejandro/Downloads/skysql_chain_2022.pem"
    ) as connection:
        cursor = connection.cursor()
        cursor.execute("select * from messages")

        for (id, content) in cursor:
            print(content)

except Exception as ex:
    print(ex)
