import mariadb

try:
    with mariadb.connect(
            host="dbpwf11745551.sysp0000.db1.skysql.net",
            port=3306,
            database="demo",
            user="dbpwf11745551",
            password="VTXhBV-HS9ygo2rPR+yH7Nx",
            ssl_ca="/Users/alejandro/Downloads/skysql_chain_2022.pem"
    ) as connection:
        cursor = connection.cursor()
        cursor.execute("select * from messages")
        for (id, content) in cursor:
            print(content)

except Exception as e:
    print(e)
