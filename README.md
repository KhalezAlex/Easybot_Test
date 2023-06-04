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
    Настольные компьютеры (уникальный параметр- форм-фактор: десктопы, неттопы, моноблоки)
  </li>
  <li>
    Ноутбуки (уникальный параметр- размер: 13, 14, 15, 17)
  </li>
  <li>
    Мониторы (уникальный параметр- диагональ)
  </li>
  <li>
    Жесткие диски (уникальный параметр- объем)
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
<h3>Сущность User</h3>
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
    <td>String name, String password, String email (not required)</td>
    <td>User</td>
  </tr>
</table>
