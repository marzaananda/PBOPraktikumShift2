| Fitur | `java.util.Scanner` | `java.io.BufferedReader` |
| :--- | :--- | :--- |
| **Kecepatan / Kinerja** | Lebih lambat karena menggunakan *parsing* reguler (parsing tipe data langsung seperti `nextInt()`, `nextDouble()`). | Sangat cepat karena membaca input dalam bentuk buffer karakter (*buffered*). |
| **Ukuran Buffer** | Default buffer kecil ($1024 \text{ byte}$). | Default buffer lebih besar ($8192 \text{ byte}$). |
| **Tipe Data Input** | Dapat langsung membaca format tipe data tertentu (`nextInt()`, `nextByte()`, dll). | Selalu membaca input sebagai `String` / teks baris (`readLine()`), harus di-parse secara manual jika butuh `int` / `double`. |
| **Handling Exception** | Menyembunyikan `IOException`. | Wajib menangani `IOException` (*Checked Exception*). |
| **Thread Safety** | Non-synchronized (tidak *thread-safe*). | Synchronized (*thread-safe*). |
