=============
Thymeleaf
=============

Thymeleaf入門
=============

Thymeleafとは
-------------

テンプレートエンジンの一つ。
雛形となるドキュメント(テンプレート)に対し、
可変データを埋め込むことにより動的にドキュメントを生成する。

Thymeleafの特徴として、テンプレートをHTMLやHTML5に準拠した形で記述できることがあげられる。
JSPではブラウザの認識できないタグライブラリがあり、開発中のJSPをブラウザで表示させるのが難しいと言う問題があった。
ThymeleafはHTMLに準拠しているため、テンプレートをブラウザで直接表示でき、デザイナーと開発者の分業を促進する。

Thymeleafのテンプレート
=======================

Thymeleafでは、テンプレートをDOM(Document Object Model)に変換して処理する。
「処理対象のDOMノード」と「DOMノードに対する処理」をth属性で指定する。

プロセッサ
    DOMノード(th属性が指されているノード)に対する操作(追加、削除、変更)を行う

OGNL(Object-Graph Naavigation Language)
    th属性の属性値に指定できる式言語

Dialect
    * DOM操作を行うプロセッサ
    * th属性の属性値に指定された式を解釈するコンポーネント
    * 暗黙オブジェクトを生成するコンポーネント
    
    などの総称。
    デフォルトではSpringStandardDirectクラスが使用される

Thymleafの代表的な機能
======================

1. ThymeleafのテンプレートをSpring MVCのViewとして使うことができる
2. テンプレート内でSpring ELを利用できる
3. テンプレートとフォームチェック及び入力値チェックの結果がバインド可能となる
4. 国際化対応のメッセージを表示することができる

Thymeleafの記法
===============

.. csv-table::
    :header: "分類", "値", "説明"
    :widths: 15, 40 , 40

    "ネームスペース","xmlns:th=\http://www.thymeleaf.org", "Thymeleaf用の属性を宣言する"
    "属性", "th:", "Thymeleafのマークアップ属性"
    "テキスト", "th:text", "テキストをサニタイジングして出力" 
    "", "th:utext", "テキストをサニタイジングせず出力"
    "変数", "${class.module}", "Thymeleafの管理する変数にアクセス"
    "", "*{class}", "th:objectで指定したオブジェクトの属性値にアクセス" 
    "メッセージ", "#{key}", "key-value形式でメッセージを表示"
    "リンク", "@{link}", "リンク先を指定する"
    "出力制御", "th:if, th:unless, th:switch, th:case", "条件に応じて出力を行う"
    "", "th:each", "繰り返し出力に利用"
    "インライン記述", "[[...]]", "インライン記述に利用(th:inlineを追加しておく必要あり)"
    "コメント", "<!--/* */-->", "Thymeleafのコメントアウト"
    "バインディング", "th:object, th:field", "フォームオブジェクトとバインディングする"
    "エラー表示", "th:error, th:errorclass, #fields", "エラー表示に利用" 
    "フラグメント", "th:insert", "他のテンプレートを埋め込む(マッピングは'fragment/ファイル名') ファイルはresources/template/fragment/以下に置く"
    "テンプレート", "layout:fragment", "レイアウトに埋め込む(マッピングは'layout/ファイル名') ファイルはresources/template/layout/以下に置く"