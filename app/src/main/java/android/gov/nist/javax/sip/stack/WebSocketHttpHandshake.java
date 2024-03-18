package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class WebSocketHttpHandshake {
    private static StackLogger logger = CommonLogger.getLogger(WebSocketHttpHandshake.class);
    private HashMap<String, String> headers = new HashMap<>();

    public static String computeRev13Response(String str) {
        String g10 = a.g(str, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.reset();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
        }
        byte[] digest = messageDigest.digest(g10.getBytes());
        new ByteArrayOutputStream();
        return Base64.encodeBytes(digest);
    }

    private String readLine(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            if (read == 13) {
                z10 = true;
            } else if (read == 10 && z10) {
                return sb2.toString();
            } else {
                if (read == 10) {
                    return null;
                }
                sb2.append((char) read);
            }
        }
    }

    public byte[] createHttpResponse(String str) {
        if (logger.isLoggingEnabled(32)) {
            a.w("Request=", str, logger);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        String readLine = readLine(byteArrayInputStream);
        if (readLine == null) {
            return null;
        }
        String[] split = readLine.split(Separators.SP);
        if (split.length >= 3) {
            this.headers.put("ctx", split[1]);
        }
        boolean z10 = false;
        while (!readLine.isEmpty()) {
            readLine = readLine(byteArrayInputStream);
            if (readLine != null && !readLine.isEmpty()) {
                String[] split2 = readLine.split(":", 2);
                if (split2.length == 2) {
                    if (split2[0].toLowerCase().startsWith("sec-websocket-key")) {
                        z10 = true;
                    }
                    this.headers.put(split2[0].trim(), split2[1].trim());
                }
            }
        }
        if (z10) {
            byteArrayInputStream.read(new byte[8]);
        }
        StringBuilder sb2 = new StringBuilder("HTTP/1.1 101 Web Socket Protocol Handshake\r\nUpgrade: WebSocket\r\nConnection: Upgrade\r\n");
        if (z10) {
            sb2.append("Sec-");
        }
        sb2.append("WebSocket-Origin: ");
        sb2.append(this.headers.get("Origin"));
        sb2.append(Separators.NEWLINE);
        if (z10) {
            sb2.append("Sec-");
        }
        sb2.append("WebSocket-Location: ws://");
        sb2.append(this.headers.get("Host"));
        sb2.append(this.headers.get("ctx"));
        sb2.append("\r\nSec-WebSocket-Accept: ");
        sb2.append(computeRev13Response(this.headers.get("Sec-WebSocket-Key")));
        sb2.append(Separators.NEWLINE);
        if (this.headers.get("Protocol") != null) {
            if (z10) {
                sb2.append("Sec-");
            }
            sb2.append("Protocol: ");
            sb2.append(this.headers.get("Protocol"));
            sb2.append(Separators.NEWLINE);
        }
        if (this.headers.get("Sec-WebSocket-Protocol") != null) {
            sb2.append("Sec-WebSocket-Protocol: ");
            sb2.append(this.headers.get("Sec-WebSocket-Protocol"));
            sb2.append(Separators.NEWLINE);
        }
        sb2.append(Separators.NEWLINE);
        String sb3 = sb2.toString();
        if (logger.isLoggingEnabled(32)) {
            a.w("Response=", sb3, logger);
        }
        return sb2.toString().getBytes();
    }
}
