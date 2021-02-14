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

Case1 Loginボタンから認可リクエストを行う
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. /homeにブラウザよりアクセスすると、ホーム画面が表示される

.. image:: _static/header.png

2. 「Login」を押下すると、認可サーバより同意画面が表示される

.. image:: _static/terms_agreement.png

| 3. 「Approve」を押下すると、クライアントにリダイレクトされ、マイページが表示される
| この際に事前に、認可サーバとClientでトークンリクエストを行っていることに注意
| (リダイレクト時に直接トークンを返しているわけではない)

.. image:: _static/mypage.png

Case2 Manualボタンから認可リクエストを行う
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. /homeにブラウザよりアクセスすると、ホーム画面が表示される

.. image:: _static/header.png

2. 「Manual」を押下すると、手動入力画面が表示される

.. image:: _static/authz_req.png

3. Authorization Requestに項目を入力し「Submit」を押下すると、認可サーバより同意画面が表示される

.. image:: _static/terms_agreement.png

4. 「Approve」を押下すると、クライアントにリダイレクトされ、認可レスポンスが表示される

.. image:: _static/authz_res.png

5. Token Requestに項目を入力し「Submit」を押下すると、トークンレスポンスが表示される

.. image:: _static/token_req.png


異常系
*******

Case1 同意画面で「Deny」を選択した
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. /homeにブラウザよりアクセスすると、ホーム画面が表示される

.. image:: _static/header.png

2. 「Get OAuth Token」を押下すると、認可サーバより同意画面が表示される

.. image:: _static/terms_agreement.png

3. 「Deny」を押下すると、エラー画面が表示される

.. image:: _static/error.png
