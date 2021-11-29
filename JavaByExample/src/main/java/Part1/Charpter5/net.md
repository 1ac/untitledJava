"Сеть - это компьютер"

Пакет java.net предоставляет мозные средства работы в сети в готовом виде.
Примеры абстракций
- применяем класс URL для разбора (parse) различных URL - адресов и загружать сетевые ресурсы, указывая URL адресом
- применять класс URLConnection для управления процессом загрузки сетевых ресурсов
- писать клиентские программы применяющие класс Socket для соединения через сеть
- Применять классы Socket ServerSocket при написании серверов
- Отправлять и получать с низкими непроизводительными расходами пакеты дейтаграмм

# Класс URLConnection
Класс устанавливает подключение к URL. open-Stream() вспомогательный метод getInputStream. Приминение объекта URLConnection 
напрямую, минуя openStream() позволяет точнее управлять процессом получения содержимого URL

Пример показывает как следует применять URLConnection для получения информации о типе, размере, дате и других свойствах
содержимого ресурса, на который указывает URL. Для адресов URL, использующих протокол HTTP, в примере также показано, как применять 
подкласс HttpURLConnection для получения дополнительной информации о подключении.
