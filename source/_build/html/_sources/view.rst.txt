=============
画面設計
=============

画面一覧
=============

* リクエスト画面
* リソース画面
* 設定画面
* エラー画面

画面遷移
==========

正常系
*******

1. /homeにブラウザよりアクセスすると、リクエスト画面が表示される

.. image:: _static/index.png

2. 「Get OAuth Token」を押下すると、認可サーバより同意画面が表示される

.. image:: _static/terms_agreement.png

| 3. 「Approve」を押下すると、クライアントにリダイレクトされ、アクセストークンが表示される
| この際に事前に、認可サーバとClientでトークンリクエストを行っていることに注意
| (リダイレクト時に直接トークンを返しているわけではない)

.. image:: _static/access_token.png

4. 「Get Protected Resource」を押下すると、保護リソースが表示される

.. image:: _static/resource.png

異常系
*******

Case1 アクセストークンを取得せずに保護リソースにアクセスした
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. 「Acces token value」が「Null」の状態で、「Get Protected Resource」を押下する

.. image:: _static/index.png

2. エラー画面が表示される

.. image:: _static/error.png

Case2 同意画面で「Deny」を選択した
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. /homeにブラウザよりアクセスすると、リクエスト画面が表示される

.. image:: _static/index.png

2. 「Get OAuth Token」を押下すると、認可サーバより同意画面が表示される

.. image:: _static/terms_agreement.png

3. 「Deny」を押下すると、エラー画面が表示される

.. image:: _static/error.png
