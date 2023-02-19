# NomadicLevyWalkOnGraph
ユニットディスクグラフ上での複数のエンティティの相互探索のシミュレータ[LevywalkEntitiesOnGraph](https://github.com/nischis/LevyWalkEntitiesOnGraph)をもとに, Nomadic Levy Walk, Homesick Levy Walkのエンティティ同士の遭遇率のシミュレーションを行えるようにしたもの.
一度にまとめて複数回のシミュレートが可能.

## バージョン  
Java version: 19.0.1  
maven version: 3.8.6  

## 実行方法
`% java -jar levywalk.jar data.txt`または`% mvn exec:java -Dexec.args='data.txt'` で実行  
`data.txt`にオプションを指定する  
遭遇率のシミュレーション結果は`result/`に`移動モデル_エンティティ数_スレッショルド.csv`の形で出力される.  
一番左の列がノードID、それ以外の列がノード1, 2……との遭遇回数を示す

## オプション
| オプション | 説明 | 型 |
|:---|:---|:---|
|trial|各条件の試行回数|Integer|
|node|ノード数|Integer|
|threshold|シミュレーションの初期しきい値|Double|
|targetThreshold|シミュレーションを終了するしきい値|Double|
|intarvalsOfThreshold|しきい値のシミュレーションを行う間隔|Double|
|graphSeed|探索用ランダムシード|Long|
|walkSeed|グラフ生成用ランダムシード|Long|
|researchCoverRatio|カバー率の調査(true),到達率の調査(false)|Boolean|
|entityClass|エンティティの移動モデル|String|
|step|シミュレーションの初期ステップ数|Integer|
|entity|エンティティ数|Integer|
|remake|グラフの再構成回数の上限|Integer|
|permissibleError|許容誤差(弧度法)|Double|
|lambda|Levy Walkのパラメータ|Double|
|alpha|Homesick Levy Walkの拠点変更率|Double|
|gamma|Nomadic Levy Walkの拠点移動率|Double|
|interval|カバー率を調査するstep数の間隔|Integer|

`entityClass`はRandomWalk, LevyWalk, HomesickWalk, NomadicWalkから選択  
`step`は指定したステップ数を倍にして,1600を超えるまでシミュレート. 例えば100を指定した時, 100, 200, 400, 800, 1600でシミュレート  
`graphSeed`, `walkSeed`は0を指定するとランダムに生成される.  
## 実験結果
`data`に卒業研究で使用した実験結果を入れている.


