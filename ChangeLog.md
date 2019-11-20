# ChangeLog

## 0.3.4 -- 2019-11-20

* Fixed `Resource.release` so that resources released early don't get released again at the end of `runResourceT` (#10). Affected functions include:
  * `bracketP`

## 0.3.3 -- 2019-11-20

### Bug fixes

* Fixed `ByteString.pack` to correctly pack `[Byte]` into `ByteString` (#9). Affected functions include:
  * `ByteString.pack`
  * `ByteString.singleton`
* Fixed out-of-bounds error in `ByteString.unpack` (#9). Affected functions include:
  * `BSSeq.filter`
  * `linesUnboundedAscii`
