package di;

import id.AbstractC3557B;
import java.io.IOException;
import java.util.ArrayList;
import ji.C4116E;
import ji.C4138m;

/* renamed from: di.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2730d {

    /* renamed from: d  reason: collision with root package name */
    public final C4116E f28563d;

    /* renamed from: g  reason: collision with root package name */
    public int f28566g;

    /* renamed from: h  reason: collision with root package name */
    public int f28567h;

    /* renamed from: a  reason: collision with root package name */
    public final int f28560a = 4096;

    /* renamed from: b  reason: collision with root package name */
    public int f28561b = 4096;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f28562c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public C2729c[] f28564e = new C2729c[8];

    /* renamed from: f  reason: collision with root package name */
    public int f28565f = 7;

    public C2730d(v vVar) {
        this.f28563d = R4.b.J(vVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f28564e.length;
            while (true) {
                length--;
                i11 = this.f28565f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                C2729c c2729c = this.f28564e[length];
                AbstractC3557B.Z(c2729c);
                int i13 = c2729c.f28559c;
                i10 -= i13;
                this.f28567h -= i13;
                this.f28566g--;
                i12++;
            }
            C2729c[] c2729cArr = this.f28564e;
            System.arraycopy(c2729cArr, i11 + 1, c2729cArr, i11 + 1 + i12, this.f28566g);
            this.f28565f += i12;
        }
        return i12;
    }

    public final C4138m b(int i10) {
        if (i10 >= 0) {
            C2729c[] c2729cArr = AbstractC2732f.f28577a;
            if (i10 <= c2729cArr.length - 1) {
                return c2729cArr[i10].f28557a;
            }
        }
        int length = this.f28565f + 1 + (i10 - AbstractC2732f.f28577a.length);
        if (length >= 0) {
            C2729c[] c2729cArr2 = this.f28564e;
            if (length < c2729cArr2.length) {
                C2729c c2729c = c2729cArr2[length];
                AbstractC3557B.Z(c2729c);
                return c2729c.f28557a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(C2729c c2729c) {
        this.f28562c.add(c2729c);
        int i10 = this.f28561b;
        int i11 = c2729c.f28559c;
        if (i11 > i10) {
            kf.q.d3(0, r7.length, null, this.f28564e);
            this.f28565f = this.f28564e.length - 1;
            this.f28566g = 0;
            this.f28567h = 0;
            return;
        }
        a((this.f28567h + i11) - i10);
        int i12 = this.f28566g + 1;
        C2729c[] c2729cArr = this.f28564e;
        if (i12 > c2729cArr.length) {
            C2729c[] c2729cArr2 = new C2729c[c2729cArr.length * 2];
            System.arraycopy(c2729cArr, 0, c2729cArr2, c2729cArr.length, c2729cArr.length);
            this.f28565f = this.f28564e.length - 1;
            this.f28564e = c2729cArr2;
        }
        int i13 = this.f28565f;
        this.f28565f = i13 - 1;
        this.f28564e[i13] = c2729c;
        this.f28566g++;
        this.f28567h += i11;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ji.j] */
    public final C4138m d() {
        boolean z10;
        int i10;
        C4116E c4116e = this.f28563d;
        byte readByte = c4116e.readByte();
        byte[] bArr = Xh.b.f21996a;
        int i11 = readByte & 255;
        int i12 = 0;
        if ((readByte & 128) == 128) {
            z10 = true;
        } else {
            z10 = false;
        }
        long e10 = e(i11, 127);
        if (z10) {
            ?? obj = new Object();
            int[] iArr = AbstractC2726C.f28536a;
            AbstractC3557B.c0("source", c4116e);
            S1.b bVar = AbstractC2726C.f28538c;
            S1.b bVar2 = bVar;
            int i13 = 0;
            for (long j6 = 0; j6 < e10; j6++) {
                byte readByte2 = c4116e.readByte();
                byte[] bArr2 = Xh.b.f21996a;
                i12 = (i12 << 8) | (readByte2 & 255);
                i13 += 8;
                while (i13 >= 8) {
                    S1.b[] bVarArr = (S1.b[]) bVar2.f16066c;
                    AbstractC3557B.Z(bVarArr);
                    bVar2 = bVarArr[(i12 >>> (i13 - 8)) & 255];
                    AbstractC3557B.Z(bVar2);
                    if (((S1.b[]) bVar2.f16066c) == null) {
                        obj.w0(bVar2.f16064a);
                        i13 -= bVar2.f16065b;
                        bVar2 = bVar;
                    } else {
                        i13 -= 8;
                    }
                }
            }
            while (i13 > 0) {
                S1.b[] bVarArr2 = (S1.b[]) bVar2.f16066c;
                AbstractC3557B.Z(bVarArr2);
                S1.b bVar3 = bVarArr2[(i12 << (8 - i13)) & 255];
                AbstractC3557B.Z(bVar3);
                if (((S1.b[]) bVar3.f16066c) != null || (i10 = bVar3.f16065b) > i13) {
                    break;
                }
                obj.w0(bVar3.f16064a);
                i13 -= i10;
                bVar2 = bVar;
            }
            return obj.q(obj.f36721Z);
        }
        return c4116e.q(e10);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte readByte = this.f28563d.readByte();
            byte[] bArr = Xh.b.f21996a;
            int i14 = readByte & 255;
            if ((readByte & 128) != 0) {
                i11 += (readByte & Byte.MAX_VALUE) << i13;
                i13 += 7;
            } else {
                return i11 + (i14 << i13);
            }
        }
    }
}
