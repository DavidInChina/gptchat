package fh;

import id.AbstractC3557B;

/* renamed from: fh.O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3072O {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f30845a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f30846b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + b(i10 >> 12) + b(i10 >> 8) + b(i10 >> 4) + b(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f30845a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f30846b = bArr;
    }

    public static final void a(String str, StringBuilder sb2) {
        AbstractC3557B.c0("value", str);
        sb2.append('\"');
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            String[] strArr = f30845a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) str, i10, i11);
                sb2.append(strArr[charAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) str, i10, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final char b(int i10) {
        int i11;
        int i12 = i10 & 15;
        if (i12 < 10) {
            i11 = i12 + 48;
        } else {
            i11 = i12 + 87;
        }
        return (char) i11;
    }
}
