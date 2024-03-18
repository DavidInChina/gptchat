package io.sentry;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: io.sentry.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3672p implements E {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f34460b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Q f34461a;

    public C3672p(C3659k0 c3659k0) {
        this.f34461a = c3659k0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
        throw new java.lang.IllegalArgumentException("Item header at index '" + r4.size() + "' is null or empty.");
     */
    @Override // io.sentry.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T0 m(BufferedInputStream bufferedInputStream) {
        Q q10 = this.f34461a;
        Charset charset = f34460b;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i11 == -1 && i12 < read) {
                        if (bArr[i12] == 10) {
                            i11 = i10 + i12;
                            break;
                        }
                        i12++;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i10 += read;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length != 0) {
            if (i11 != -1) {
                StringReader stringReader = new StringReader(new String(byteArray, 0, i11, charset));
                U0 u02 = (U0) q10.e(stringReader, U0.class);
                stringReader.close();
                if (u02 != null) {
                    int i13 = i11 + 1;
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        int i14 = i13;
                        while (true) {
                            if (i14 < byteArray.length) {
                                if (byteArray[i14] == 10) {
                                    break;
                                }
                                i14++;
                            } else {
                                i14 = -1;
                                break;
                            }
                        }
                        if (i14 != -1) {
                            StringReader stringReader2 = new StringReader(new String(byteArray, i13, i14 - i13, charset));
                            Y0 y02 = (Y0) q10.e(stringReader2, Y0.class);
                            stringReader2.close();
                            if (y02 == null || y02.a() <= 0) {
                                break;
                            }
                            int a5 = y02.a() + i14;
                            int i15 = a5 + 1;
                            if (i15 <= byteArray.length) {
                                arrayList.add(new X0(y02, Arrays.copyOfRange(byteArray, i14 + 1, i15)));
                                if (i15 == byteArray.length) {
                                    break;
                                }
                                i13 = a5 + 2;
                                if (i13 == byteArray.length) {
                                    if (byteArray[i15] != 10) {
                                        throw new IllegalArgumentException("Envelope has invalid data following an item.");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i15 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                        }
                    }
                    T0 t02 = new T0(u02, arrayList);
                    byteArrayOutputStream.close();
                    return t02;
                }
                throw new IllegalArgumentException("Envelope header is null.");
            }
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        throw new IllegalArgumentException("Empty stream.");
    }
}
