# CryptoSuiteAPI

CryptoSuiteAPI, Mempool.space REST API üzerinde Java ve REST Assured kullanarak kapsamlı API testleri gerçekleştiren bir projedir. Bu proje, Bitcoin ağındaki mempool verilerini, blok bilgilerini ve işlem detaylarını doğrulamak için tasarlanmıştır.

## Özellikler
- REST Assured ile GET endpoint testleri
- JSON veri doğrulama ve schema kontrolü
- Response süreleri ve HTTP durum kodu doğrulaması
- Parametreli istekler ile dinamik test senaryoları
- Test raporlama ve loglama

## Test Senaryoları

### Mempool Bilgisi Testi
- **Endpoint:** `/api/mempool`
- **Beklenen:** HTTP 200, `count` alanı pozitif, `vsize` ve `total_fee` değerleri doğru tipte

### Blok Bilgisi Testi
- **Endpoint:** `/api/block/{hash}`
- **Beklenen:** HTTP 200, blok hash ve height doğru tipte, transactions listesi dolu

### Son Bloklar Listesi Testi
- **Endpoint:** `/api/blocks`
- **Beklenen:** HTTP 200, son 10 blok listelenir, her blokte `height`, `hash`, `time` alanları mevcut

### Transaction Detay Testi
- **Endpoint:** `/api/tx/{txid}`
- **Beklenen:** HTTP 200, `vin`, `vout`, `fee` alanları doğru tipte ve boş değil

## Örnek JSON Response

**Mempool Endpoint `/api/mempool`:**
```json
{
  "count": 12,
  "vsize": 5760,
  "total_fee": 0.00012345
}

{
  "id": "0000000000000000000763e4...",
  "height": 800000,
  "time": 1693500000,
  "tx": [
    "f1e2d3c4...",
    "a1b2c3d4..."
  ]
}


Amaç

Bu proje, gerçek bir blockchain API üzerinde otomasyon testleri yapmayı ve profesyonel bir QA portföyü oluşturmayı hedeflemektedir.

Teknolojiler

Java 17+

REST Assured

JUnit 5

Maven
