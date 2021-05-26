# javaの勉強

### AWT(Abstract Windowing Tools)
```java
import java.awt.*;
```
- javaでGUIアプリケーションを作成するためのクラスライブラリ．現在ではswingもよく利用されるが，swingよりも軽いGUIアプリケーションを作成することが可能．

### java.awt.eventパッケージ
```java
import java.awt.event.*;
```
- イベントを表すクラス群(MouseEventなど)，イベントを受け取って処理を実行するメソッドを定義したListenerのインターフェース群（MouseListenerなど），それらを実装したアダプタのクラス群(MouseAdapterなど)から構成されている．
- イベントを表すクラスは，すべてjava.awtパッケージのAWTEventクラスの，AWTEventクラスは，java.utilパッケージのEventObjectクラスのサブクラスである．


# スーパークラスとサブクラスについての最低限のまとめ
## スーパークラスとサブクラス
- 下記のコードを例に見ていく
```java
class NameRectangle extends Rectangle {
    ...
}
```
- Rectangleはスーパークラス
- NameedRectangleはサブクラス
- サブクラスは1つのスーパークラスしか持てない
- すべてのサブクラスはObjectクラスのサブクラスである
    - Objectクラスとは
        - 「全てのJavaクラスを形作るためのクラス」
        - 全てのクラスが継承しなけらばいけないクラス
- finalクラスはサブクラスを作れない
## 継承
```java
// inheritance.java

class Rectangle{
    int width;
    int height;
    ...

    void setSinze(int width, int height){
        ...
    }
}

class NamedRectangle extends Rectangle{
    ...
}
```
- サブクラスではスーパークラスのフィールドとメソッドを受け継ぐ
- NamedRectangleではwidthとheightが宣言されていないが，どちらも保持している．
- NamedRectangleでもsetSize()を呼び出すことができる

### コンストラスタは継承されない
- スーパークラスのコンストラクタが呼び出せてしまうと，サブクラスで新たに宣言されたフィールドが初期化されない可能性が出てしまうため，禁止されている．
- super()を使えばスーパークラスのコンストラクタを明示的に呼び出せる
- this()を使えばサブクラスのコンストラクタを明示的に呼び出せる

<br>

## コンストラスタ
インスタンス生成時に実行されるメソッド
- インスタンス
    - 設計図を元にして作った実物のようなもの
    - 「new クラス名」とすることで生成することができる

コンストラスタは，主にクラス内で使われる変数を初期化するために使われる．
普通のメソッドと同じように，コンストラスタも引数を指定して実行することが可能

つまり，コンストラスタに対して何か情報を与え，その情報を元にクラス内で使われる変数を初期化できるということ．

### コンストラスタを使ってできること
- 基本的に変数を初期化するために使うことが多い．
- インスタンス生成時に実効的に実行されるので，最初に変数を定義しておくことができる．
- コンストラストを使えば，初期化のために別のメソッドを呼ぶ必要がなくなるので，その分コードが簡単になる．
### コンストラスタの基本的な使いかた
```java
public class Main{
    public static void main(String[] args){
        ConstructorTest ct = new ConstructorTest();
    }
}

class ConstructorTest{
    String data = "Hello World!";

    // コンストラクタはクラスと同じ名前にする
    public ConstructorTest(){
        System.out.println(data);
    }
}
```
実行結果
```
Documents $ 1java test.java
Hello world!
Documents $ 1
```
このコードでは，MainクラスからConstructorTestにアクセスしている．

main部分ではインスタンスを生成しているだけ．にもかかわらず，「Hello World!」と表示されている．
インスタンス生成時にコンストラクタであるConstructor Testメソッド内の処理が自動的に実行され，「Hello World!」が表示されている．
- コンストラクタには戻り値がない
    - 戻り値がないことは，普通のメソッドとは異なる点である．


<br>

## finalクラス
- クラスにfinalをつけて宣言することができる．そうするとクラスを継承することができなくなる
``` java
final class FinalClass{}
```
extendsに続く部分にfinalクラスが書いてあると，コンパイルエラーになる．
```java
class SbclassOfFinalClass extends FinalClass{}
```
```
コンパイル結果：final FinalClassからは継承できません
```

<br>

# クラス，メソッド，フィールドとは
クラスの中には特定の処理を実行するプログラムをまとめたメソッドや，クラスの中で情報を保存するためのフィールドがある．

<br>

## クラスとは
- 特定の目的を達成するのに必要なものを集めたもの．
```java
class クラス名{
    // ...
}
```
class のあとにクラスの名前を記述し，そのあとの{から}までのブロックの間に，特定の処理を行うためのプログラムを集めたメソッドや，クラスの中で使用されるデータを保管するためのフィールドを定義していく．クラスというのは逆に，特定の目的のために必要なメソッドをフィールドにまとめたもの

- 例：電卓のような機能を提供するクラスを定義してみる
```java
class Dentaku{
    public static void main(String[] args){
        Dentaku dentaku = new Dectaku();
        dentaku.plus(10,5);
        dentaku.minus(9,2);
    }

    void plus(int val1, int val2){
        System.out.println(val1 + val2);
    }

    void minus(int val1, int val2){
        System.out.println(val1 - val2);
    }
}

```
足し算を行うplusメソッド，引き算を行うminusメソッド，最初に呼び出されるmainメソッド，の3つのメソッドがクラスの中で定義されている．
さらに，掛け算や割り算などの機能を行うメソッドを追加していったり，計算結果を一時的に保管するフィールドを追加していくことで，より便利なプログラムになる．

プログラムが複雑になるとあ1つのアプリケーションで使用するクラスの数も複数になり，クラスの中で定義されているメソッドやフィールドも増える．

<br>

## メソッドとは
クラスの中で特定の処理を行うために必要なプログラムをまとめたもの．
```java
class クラス名{
    void メソッド名(){
        // ...
    }
}
```
メソッドは先頭に戻り値のデータ型を記述した後でメソッドの名前を記述する．()の中には，仮引数を記述．

## フィールドとは
クラスの中でデータを保管するために使用するもの
```java
class クラス名{
    データ型　フィールド名;
}
```
```java
class Robot{
    int currentPosition = 0;

    public static void main(String[] args){
        Robot robot = new Robot();
        robot.report();
        robot.moveForward();
        robot.report();
    }

    void report(){
        System.out.println("Current Position = " + currentPosition)
    }

    void moveForward(){
        currentPosition = currentPosition + 1;
    }
}
```

<br>

# publicとprivate
```java
class ctest{
    public static void main(String srgs[]){
        Television tv1 = new Television();

        tv1.setChanne(5);
    }
}

class Television{
    int channelNo;

    void setChannel(int newChannelNo){
        if((newChannelNo == 1) || (newChannel == 3)){
            channelNo = newChannelNo;
        }
    }

    void dispChannel(){
        System.out.println("現在のチャンネルは" + channelNo + "です");
    }
}
```
メンバ変数に直接値を格納するのを禁止，必ずメゾット経由でしかメンバ変数の値を格納したり参照したりできないようにする．そういった場合は，メンバ変数の定義をするときに先頭に「private」をつけるようにする．
```java
class ctset{
    public static void main(String args[]){
        Television tv1 = new Television();

        tv1.setChannel(5);
    }
}

class Television{
    private int channelNo;

    void setChannel(int newChannelNo){
        if((newChannelNo == 1) || (newChannel == 3)){
            channelNo == newChannelNo;
        }
    }

  void dispChannel(){
        System.out.println("現在のチャンネルは" + channelNo + "です");
  }
}
```

「private」を頭に付けたメンバ変数は，メンバ変数が定義されているクラスの中でしか値を格納したり取り出したりということができなくなる．
そのため，他のクラスの中でオブジェクトを作成し，「オブジェクト名．メンバ変数 = 値」のように直接メンバ変数に値を格納することを防止できる．

「private」をつけた場合でも，同じクラス内のメソッドからは値を格納したり取り出したりを行えるため，他のクラスの中でオブジェクトを作成した場合でも，オブジェクトからはメソッドを呼び出し，メンバ変数の値の変更はそのメソッド内で行うように記述すれば，メソッドを呼び出すことで間接的にメンバ変数の格納や変更を行える．

つまり，メンバ変数の直接の変更は禁止し，メソッド経由でのみメンバ変数の変更を許可できるというわけである．

```
定義時にprivateを頭につけたメンバ変数は，メンバ変数を定義したクラス内でしかメンバ変数の値を変更したり参照したりすることはできない．

private 変数の型 メンバ変数名;
```
```
定義時にpublicを頭につけたメンバ変数は，メンバ変数を定義したクラス外からでもメンバ変数の値を変更したり参照したりすることができる．

public 変数の型　メンバ変数名;

ねお，publicは省略することができるので，単に下記のように記述もできる．

変数の型　メンバ変数名;
```
publicは書いても書かなくてもいいのだが，後でプログラムを見て分かりやすいように，そして「private」を書き忘れたわけではなく，「public」にしたかったのだと明示的にわかるようにpublicは書いていた方がいい．

<br>

# superとは
子クラスから親クラスの変数やメソッドを参照することができる．
サブクラスでオーバライド（親クラスのメソッドを子クラスで継承）された変数やインスタンスを参照する場合に使用される．
つまり，子クラスのインスタンス（new[クラス名()]で作られたクラスの実体のこと）から，親クラスのインスタンスのメンバにアクセスして，値を参照する必要があるときにsuperが使用される．

