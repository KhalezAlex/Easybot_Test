<h1>
Тестовое задание (компания Easybot)
</h1>
</br>
<h2>
  Задача:
</h2>
<span>Подготовить api магазина, торгующего следующими товарами:</span>
<ol>
  <li>
    Настольные компьютеры (уникальное свойство- форм-фактор: десктопы, неттопы, моноблоки)
  </li>
  <li>
    Ноутбуки (уникальное свойство- размер: 13, 14, 15, 17)
  </li>
  <li>
    Мониторы (уникальное свойство- диагональ)
  </li>
  <li>
    Жесткие диски (уникальное свойство- объем)
  </li>
</ol>
<div>
  <span>Каждый товар имеет следующие свойства:</span>
  <ul>
    <li>
      номер серии
    </li>
    <li>
      производитель
    </li>
    <li>
      цена
    </li>
    <li>
      количество единиц продукции на складе
    </li>
  </ul>
</div>
<span>В качестве базы данных использовать in memory database, например H2</span>

</br>
<h2>Описание API</h2>
<h3>Сущность PC (path: "/pc")</h3>
<table>
  <thead>
    <td>Operation</td>
    <td>Endpoint</td>
    <td>Method</td>
    <td>Parameters</td>
    <td>Response Object</td>
  </thead>
  <tr>
    <td>save</td>
    <td>"/save"</td>
    <td>Post</td>
    <td>int serial, String brand, double price, int amount, String form</td>
    <td>PC (default PC)</td>
  </tr>
  <tr>
    <td>findAll</td>
    <td>"/all"</td>
    <td>Get</td>
    <td></td>
    <td>List(PC)</td>
  </tr>
  <tr>
    <td>findById</td>
    <td>"/findById"</td>
    <td>Get</td>
    <td>int id</td>
    <td>PC (default PC)</td>
  </tr>
  <tr>
    <td>update</td>
    <td>"/update"</td>
    <td>Post</td>
    <td>int id, int serial (not required), String brand (not required), double price (not required), int amount (not required), String form (not required)</td>
    <td>PC (default PC)</td>
  </tr>
</table>

<h3>Сущность Laptop (path: "/laptop")</h3>
<table>
  <thead>
    <td>Operation</td>
    <td>Endpoint</td>
    <td>Method</td>
    <td>Parameters</td>
    <td>Response Object</td>
  </thead>
  <tr>
    <td>save</td>
    <td>"/save"</td>
    <td>Post</td>
    <td>int serial, String brand, double price, int amount, int size</td>
    <td>Laptop (default Laptop)</td>
  </tr>
  <tr>
    <td>findAll</td>
    <td>"/all"</td>
    <td>Get</td>
    <td></td>
    <td>List(Laptop)</td>
  </tr>
  <tr>
    <td>findById</td>
    <td>"/findById"</td>
    <td>Get</td>
    <td>int id</td>
    <td>Laptop (default Laptop)</td>
  </tr>
  <tr>
    <td>update</td>
    <td>"/update"</td>
    <td>Post</td>
    <td>int id, int serial (not required), String brand (not required), double price (not required), int amount (not required), int size (not required)</td>
    <td>Laptop (default Laptop)</td>
  </tr>
</table>

<h3>Сущность Monitor (path: "/monitor")</h3>
<table>
  <thead>
    <td>Operation</td>
    <td>Endpoint</td>
    <td>Method</td>
    <td>Parameters</td>
    <td>Response Object</td>
  </thead>
  <tr>
    <td>save</td>
    <td>"/save"</td>
    <td>Post</td>
    <td>int serial, String brand, double price, int amount, double diag</td>
    <td>Monitor (default Monitor)</td>
  </tr>
  <tr>
    <td>findAll</td>
    <td>"/all"</td>
    <td>Get</td>
    <td></td>
    <td>List(Monitor)</td>
  </tr>
  <tr>
    <td>findById</td>
    <td>"/findById"</td>
    <td>Get</td>
    <td>int id</td>
    <td>Monitor (default Monitor)</td>
  </tr>
  <tr>
    <td>update</td>
    <td>"/update"</td>
    <td>Post</td>
    <td>int id, int serial (not required), String brand (not required), double price (not required), int amount (not required), double diag (not required)</td>
    <td>Monitor (default Monitor)</td>
  </tr>
</table>

<h3>Сущность HDD (path: "/hdd")</h3>
<table>
  <thead>
    <td>Operation</td>
    <td>Endpoint</td>
    <td>Method</td>
    <td>Parameters</td>
    <td>Response Object</td>
  </thead>
  <tr>
    <td>save</td>
    <td>"/save"</td>
    <td>Post</td>
    <td>int serial, String brand, double price, int amount, double volume</td>
    <td>HDD (default HDD)</td>
  </tr>
  <tr>
    <td>findAll</td>
    <td>"/all"</td>
    <td>Get</td>
    <td></td>
    <td>List(HDD)</td>
  </tr>
  <tr>
    <td>findById</td>
    <td>"/findById"</td>
    <td>Get</td>
    <td>int id</td>
    <td>HDD (default HDD)</td>
  </tr>
  <tr>
    <td>update</td>
    <td>"/update"</td>
    <td>Post</td>
    <td>int id, int serial (not required), String brand (not required), double price (not required), int amount (not required), double volume (not required)</td>
    <td>HDD (default HDD)</td>
  </tr>
</table>
