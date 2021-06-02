# 赤と青の信号機

## 1. コードの不足分を補い，コンパイルして実行せよ
- ボタンによって信号機の色が変わることを確認せよ
- 信号が赤の時，青の時のウィンドウをレポートに添付せよ
<div style="text-align: center;">
<img src="./image/signalred.png" width="300">
<br>
<img src="./image/signalblue.png" width="300">
</div>

## 2. 信号管理システムを以下のように変更したい
- ボタンを「変更する」の1個にする
- ボタンを押すと，赤なら青へ，青なら赤へ，信号が変わる
- この時，以下の図をレポートに添付せよ
  - ユースケース図
  - ユースケース記述
  - 初期シーケンス図
  - 初期クラス図

<div style="text-align: center;">
  <img src="./image/usecase.png" width="300">
</div>
<div style="text-align: center;">
  ユースケース図
</div>
  <br><br>

<div style="text-align: center;">

  |||
  |:----|---|
  |**名称**        |信号の色を変更する|
  |**能動アクター**|信号管理者|
  |**受動アクター**|無し|
  |**メインフロー**：<br>1. 信号管理者は「変更するボタンを押す」<br>2.「変更する」が押されたことが信号設定者に通知される<br>3. 信号設定者は信号機に対して色を変えるよう指示<br>4. システム上に表示された信号機の色が変わる|
  |**例外フロー**：例外は発生しない|
</div>
<div style="text-align: center;">
ユースケース記述
</div>

<div style="text-align: center;">
  <img src="./image/firstsequence.png" width="400">
</div>

<div style="text-align: center;">
  初期シーケンス図
  <br><br>
</div>

<div style="text-align: center;">
  <img src="./image/class.png" width="200">
</div>
<div style="text-align: center;">
  クラス図
</div>
