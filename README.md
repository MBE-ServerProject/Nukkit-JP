![Nukkit](https://github.com/Nukkit/Nukkit) For Japanese
===================
![nukkit](https://github.com/Nukkit/Nukkit/blob/master/images/banner.png)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU Lesser General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU Lesser General Public License for more details.

	You should have received a copy of the GNU Lesser General Public License
	along with this program.  If not, see <http://www.gnu.org/licenses/>.

---------------------

	このプログラムは誰でも無料で使用できるソフトウェアで、ベースとなるNukkitは
	GNUライセンス(Ver.3以降)のもと再配布したり変更することができます。
	Nukkit-JPは、Nukkit同様に変更しての再配布・使用が認められます。
	ただし、変更を施し再配布する際はNukkit-JPをベースにした旨を明記するようにしてください。
	なお、変更を施すことなく再配布することは本物との区別をつけるため禁止させていただきます。

	このプログラムは使用する皆さんにとって有用であることを願って配布されており、いかなる保証もありません。
	保証がないという記載が他の配布先にないとしても、商品性などを保証するものはありません。
	詳細については、GNU Lesser General Public Licenseを参照してください。

	このプログラムには通常、GNU Lesser General Public Licenseのコピーが含まれています。
	配布先により含まれていない場合は、<http://www.gnu.org/licenses/>を参照してください。

__A Nuclear-Powered Server Software For Minecraft: Pocket Edition__

[![PayPayl donate button](https://img.shields.io/badge/paypal-donate-yellow.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=magicdroidx%40gmail%2ecom&lc=US&item_name=Nukkit&currency_code=USD&bn=PP%2dDonationsBF%3apaypal%2ddonate%2dyellow%2esvg%3aNonHostedGuest)
[![Gitter](https://img.shields.io/gitter/room/Nukkit/Nukkit.js.svg?style=flat)](https://gitter.im/Nukkit/Nukkit)
[![Travis](https://img.shields.io/travis/Nukkit/Nukkit.svg?style=flat)](https://travis-ci.org/Nukkit/Nukkit)

上記リンクは全てNukkitのものです。

Introduction（はじめに）
-------------------

Nukkit-JP is nuclear-powered server software for Minecraft: Bedrock Edition.

It has a few key advantages over other server software:

* Written in Java, Nukkit is faster and more stable.
* Having a friendly structure, it's easy to contribute to Nukkit's development and rewrite plugins from other platforms into Nukkit plugins.

Nukkit and Nukkit-JP is **under improvement** yet, we welcome contributions. 

----------------

Nukkit（Nukkit-JP）は原始的なMinecraft: Bedrock Edition向けのサーバーソフトウェアです。
Nukkit-JPには他のどのサーバーソフトウェアよりも優れた大きな長所があります。

* Java言語で制作されているため、処理が速く安定しています。
* 他のサーバーソフトウェアから簡単にプラグインの移行ができるように設計されていて、とても便利です。

Nukkit（Nukkit-JP）は現在も終わることなく開発中です。少しでもご支援いただければ幸いです。

Example servers running Nukkit（Nukkitを使用しているサーバー）
--------------------
- **play.EaseCation.net**
- **play.GameTeam.cz**
- **MultiLabs.net**

Get Nukkit & Plugins（公式サイトなど）
--------------------

#### Recommended Sites

* __[Official Site](https://nukkit.io)__
* __[Jar Download at Circle CI](https://circleci.com/gh/Nukkit/Nukkit/tree/master/)__ (**login required**)
* __[Discussion](#discussion)__

*Thank you for visiting our official sites. Our official websites are provided free of charge, and we do not like to place ads on the home page affecting your reading. If you like this project, please [donate to us](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=magicdroidx%40gmail%2ecom&lc=US&item_name=Nukkit&currency_code=USD&bn=PP%2dDonationsBF%3apaypal%2ddonate%2dyellow%2esvg%3aNonHostedGuest). All the donations will only be used for Nukkit websites and services.*


#### Unofficial Download Mirrors
*These sites are provided by our users, Nukkit staff are not responsible for the reliability of these sites. Jar files downloaded here are only for reference - to try the latest update or for commercial uses, compile by yourself.*

* __[Jenkins by MengCraft](http://ci.mengcraft.com:8080/job/Nukkit/lastSuccessfulBuild/)__ (**UNOFFICIAL**)
* __[Yivesmirror](https://yivesmirror.com/downloads/nukkit)__ (**UNOFFICIAL**)

Build JAR file（jarファイルの生成方法）
-------------
- `git submodule update --init`
- `mvn clean`
- `mvn package`

-------------

1. このリポジトリをCloneします。
1. Cloneしたフォルダのパスで、以下のコマンドを順に入力していきます。
	1 `git submodule update --init`
	2 `mvn clean`
	3 `mvn package`


Running（実行）
-------------
Simply run `start.sh` or `start.cmd`, or execute `java -jar Nukkit.jar`.

--------------------

* Windowsの場合
	1 jarファイルのあるフォルダに`start.cmd`を作り、そこに`java -jar Nukkit.jar`と記述し保存します。
	2 作成した`start.cmd`を実行します。
* Linuxの場合
	1 jarファイルのあるフォルダに`start.sh`を作り、そこに`java -jar Nukkit.jar`と記述し保存します。
	2 作成した`start.sh`を実行します。
* その他・実行ファイルを使用しない場合
	* jarファイルのあるフォルダのパスで、`java -jar Nukkit.jar`というコマンドを実行します。

Plugin API（プラグインのAPI）
-------------
#### **Example Plugin（プラグインの例）**
Example Plugin which shows the API of Nukkit.
NukkitのAPI使用の一例が掲載されています（Nukkit-JPのものではありません）。

* __[Example Plugin（プラグイン例）](http://github.com/Nukkit/ExamplePlugin)__

Development Tools（開発ツール）
-----------------
There're some tools for Nukkit developers.
Nukkit（Nukkit-JP）使用者向けの開発ツールです。

* __[FDevTools](https://github.com/fengberd/FDevTools)__ (**Load source and pack them easily**)
* __[PocketServer](https://github.com/fengberd/MinecraftPEServer)__ (**Run Nukkit on android devices**)

Contributing（開発協力）
------------
Please read the [CONTRIBUTING](https://github.com/Nukkit/Nukkit/blob/jp/.github/CONTRIBUTING.md) guide before submitting any issue. Issues with insufficient information or in the wrong format will be closed and will not be reviewed.

--------------------

[こちら](https://github.com/Nukkit/Nukkit/blob/jp/.github/CONTRIBUTING.md) を参照してバグなどの報告をお願いいたします。なお、不十分な情報だけの報告は参考にすることができません。ご了承ください。

Discussion（フォーラム）
-------------
* __[Forums](https://forums.nukkit.io)__
* __[百度 Nukkit 吧](http://tieba.baidu.com/f?kw=nukkit)__
