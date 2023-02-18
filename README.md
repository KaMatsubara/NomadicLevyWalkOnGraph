# NomadicLevyWalkOnGraph
ユニットディスクグラフ上での複数のエンティティの相互探索のシミュレータ[LevywalkEntitiesOnGraph](https://github.com/nischis/LevyWalkEntitiesOnGraph)をもとに, Nomadic Levy Walk, Homesick Levy Walkのシミュレーションを行えるようにしたもの.
一度にまとめて複数回のシミュレートが可能.

## バージョン  
Java version: 19.0.1  
maven version: 3.8.6  

## 実行方法
`% java -jar levywalk.jar data.txt`または`% mvn exec:java -Dexec.args='data.txt'` で実行  
`data.txt`にオプションを指定する

## オプション
| オプション | 説明 | 型 |
|:---|:---|:---|
|trial|試行回数|Integer|
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
|file|出力ファイル名|String|
|permissibleError|許容誤差|Double|
|lambda|Levy Walkのパラメータ|Double|
|alpha|Homesick Levy Walkの拠点変更率|Double|
|gamma|Nomadic Levy Walkの拠点移動率|Double|
|interval|カバー率を調査するstep数の間隔|Integer|
