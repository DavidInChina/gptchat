package Qd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class q extends l {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f14648i0 = 0;

    public q(HttpURLConnection httpURLConnection, InputStream inputStream) {
        super(httpURLConnection, inputStream, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        r1 = r1.getResponseMessage();
        id.AbstractC3557B.b0("connection.responseMessage", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
        throw new Qd.r(r3, r1, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002e: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:16:0x002e */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // Qd.l, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        InputStream inputStream;
        IOException e10;
        BufferedReader bufferedReader;
        ?? r52;
        switch (this.f14648i0) {
            case 0:
                super.close();
                InputStream inputStream2 = this.f14637Z;
                if (inputStream2 != null) {
                    inputStream2.close();
                    return;
                }
                return;
            default:
                OutputStream outputStream = this.f14638h0;
                HttpURLConnection httpURLConnection = this.f14636Y;
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 300) {
                        ?? r42 = 0;
                        String str = null;
                        try {
                            try {
                                try {
                                    try {
                                        inputStream = httpURLConnection.getInputStream();
                                    } catch (IOException unused) {
                                        inputStream = httpURLConnection.getErrorStream();
                                    }
                                    if (inputStream != null) {
                                        try {
                                            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Lg.a.f11131a);
                                            if (inputStreamReader instanceof BufferedReader) {
                                                bufferedReader = (BufferedReader) inputStreamReader;
                                            } else {
                                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                                            }
                                            try {
                                                str = P4.a.x0(bufferedReader);
                                                break;
                                            } catch (Throwable th2) {
                                                try {
                                                    throw th2;
                                                } finally {
                                                    Ad.l.S(bufferedReader, th2);
                                                }
                                            }
                                        } catch (IOException e11) {
                                            e10 = e11;
                                            AbstractC4344b.V0(i.Companion, e10);
                                            str = "Could not read response body for rejected message: " + e10;
                                            break;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (r42 != 0) {
                                        r42.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e12) {
                                inputStream = null;
                                e10 = e12;
                                AbstractC4344b.V0(i.Companion, e10);
                                str = "Could not read response body for rejected message: " + e10;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r42 = r52;
                        }
                    } else if (outputStream != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    super.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                }
                break;
        }
    }

    public q(HttpURLConnection httpURLConnection, GZIPOutputStream gZIPOutputStream) {
        super(httpURLConnection, null, gZIPOutputStream);
    }
}
