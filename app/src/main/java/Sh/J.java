package Sh;

import java.util.Random;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f16705c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f16706d;

    /* renamed from: a  reason: collision with root package name */
    public final Random f16707a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16708b;

    static {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            sb2.append(c10);
        }
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            sb2.append(c11);
        }
        for (char c12 = 'A'; c12 <= 'Z'; c12 = (char) (c12 + 1)) {
            sb2.append(c12);
        }
        char[] charArray = sb2.toString().toCharArray();
        f16705c = charArray;
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(charArray.length);
        if (Integer.bitCount(charArray.length) == numberOfLeadingZeros) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        f16706d = numberOfLeadingZeros - i10;
    }

    public J(int i10) {
        this(new Random());
    }

    public final String a() {
        int i10 = this.f16708b;
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            Random random = this.f16707a;
            char[] cArr2 = f16705c;
            cArr[i11] = cArr2[random.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }

    public J(Random random) {
        this.f16708b = 8;
        this.f16707a = random;
    }
}
