package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static String f33981a;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f33982b = Charset.forName("UTF-8");

    public static synchronized String a(Context context) {
        synchronized (J.class) {
            try {
                if (f33981a == null) {
                    File file = new File(context.getFilesDir(), "INSTALLATION");
                    if (!file.exists()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String uuid = UUID.randomUUID().toString();
                            fileOutputStream.write(uuid.getBytes(f33982b));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f33981a = uuid;
                            return uuid;
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, f33982b);
                        randomAccessFile.close();
                        f33981a = str;
                    } catch (Throwable th4) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                return f33981a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }
}
