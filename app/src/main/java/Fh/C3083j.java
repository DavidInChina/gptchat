package fh;

/* renamed from: fh.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3083j {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f30876a = new char[117];

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f30877b = new byte[126];

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            a('u', i11);
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f30877b;
            if (i10 < 33) {
                bArr[i10] = Byte.MAX_VALUE;
                i10++;
            } else {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
        }
    }

    public static void a(char c10, int i10) {
        if (c10 != 'u') {
            f30876a[c10] = (char) i10;
        }
    }
}
