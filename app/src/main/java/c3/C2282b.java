package c3;

import L2.r;
import java.util.ArrayDeque;

/* renamed from: c3.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2282b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f26121a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f26122b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final C2285e f26123c = new C2285e();

    /* renamed from: d  reason: collision with root package name */
    public J0.a f26124d;

    /* renamed from: e  reason: collision with root package name */
    public int f26125e;

    /* renamed from: f  reason: collision with root package name */
    public int f26126f;

    /* renamed from: g  reason: collision with root package name */
    public long f26127g;

    public static String b(r rVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        rVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public final long a(r rVar, int i10) {
        byte[] bArr = this.f26121a;
        rVar.readFully(bArr, 0, i10);
        long j6 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j6 = (j6 << 8) | (bArr[i11] & 255);
        }
        return j6;
    }
}
