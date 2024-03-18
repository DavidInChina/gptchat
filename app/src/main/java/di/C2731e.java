package di;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import ji.C4135j;
import ji.C4138m;

/* renamed from: di.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2731e {

    /* renamed from: b  reason: collision with root package name */
    public final C4135j f28569b;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28571d;

    /* renamed from: h  reason: collision with root package name */
    public int f28575h;

    /* renamed from: i  reason: collision with root package name */
    public int f28576i;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28568a = true;

    /* renamed from: c  reason: collision with root package name */
    public int f28570c = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f28572e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public C2729c[] f28573f = new C2729c[8];

    /* renamed from: g  reason: collision with root package name */
    public int f28574g = 7;

    public C2731e(C4135j c4135j) {
        this.f28569b = c4135j;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f28573f.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f28574g;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                C2729c c2729c = this.f28573f[length];
                AbstractC3557B.Z(c2729c);
                i10 -= c2729c.f28559c;
                int i13 = this.f28576i;
                C2729c c2729c2 = this.f28573f[length];
                AbstractC3557B.Z(c2729c2);
                this.f28576i = i13 - c2729c2.f28559c;
                this.f28575h--;
                i12++;
                length--;
            }
            C2729c[] c2729cArr = this.f28573f;
            int i14 = i11 + 1;
            System.arraycopy(c2729cArr, i14, c2729cArr, i14 + i12, this.f28575h);
            C2729c[] c2729cArr2 = this.f28573f;
            int i15 = this.f28574g + 1;
            Arrays.fill(c2729cArr2, i15, i15 + i12, (Object) null);
            this.f28574g += i12;
        }
    }

    public final void b(C2729c c2729c) {
        int i10 = this.f28572e;
        int i11 = c2729c.f28559c;
        if (i11 > i10) {
            kf.q.d3(0, r7.length, null, this.f28573f);
            this.f28574g = this.f28573f.length - 1;
            this.f28575h = 0;
            this.f28576i = 0;
            return;
        }
        a((this.f28576i + i11) - i10);
        int i12 = this.f28575h + 1;
        C2729c[] c2729cArr = this.f28573f;
        if (i12 > c2729cArr.length) {
            C2729c[] c2729cArr2 = new C2729c[c2729cArr.length * 2];
            System.arraycopy(c2729cArr, 0, c2729cArr2, c2729cArr.length, c2729cArr.length);
            this.f28574g = this.f28573f.length - 1;
            this.f28573f = c2729cArr2;
        }
        int i13 = this.f28574g;
        this.f28574g = i13 - 1;
        this.f28573f[i13] = c2729c;
        this.f28575h++;
        this.f28576i += i11;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, ji.j] */
    public final void c(C4138m c4138m) {
        AbstractC3557B.c0("data", c4138m);
        boolean z10 = this.f28568a;
        C4135j c4135j = this.f28569b;
        int i10 = 0;
        if (z10) {
            int[] iArr = AbstractC2726C.f28536a;
            int d10 = c4138m.d();
            long j6 = 0;
            for (int i11 = 0; i11 < d10; i11++) {
                byte i12 = c4138m.i(i11);
                byte[] bArr = Xh.b.f21996a;
                j6 += AbstractC2726C.f28537b[i12 & 255];
            }
            if (((int) ((j6 + 7) >> 3)) < c4138m.d()) {
                ?? obj = new Object();
                int[] iArr2 = AbstractC2726C.f28536a;
                int d11 = c4138m.d();
                long j10 = 0;
                byte b10 = 0;
                while (i10 < d11) {
                    byte i13 = c4138m.i(i10);
                    byte[] bArr2 = Xh.b.f21996a;
                    int i14 = i13 & 255;
                    int i15 = AbstractC2726C.f28536a[i14];
                    byte b11 = AbstractC2726C.f28537b[i14];
                    j10 = (j10 << b11) | i15;
                    int i16 = b10 + b11;
                    while (i16 >= 8) {
                        i16 = (i16 == 1 ? 1 : 0) - 8;
                        obj.w0((int) (j10 >> i16));
                    }
                    i10++;
                    b10 = i16;
                }
                if (b10 > 0) {
                    obj.w0((int) ((255 >>> (b10 == 1 ? 1L : 0L)) | (j10 << (8 - b10))));
                }
                C4138m q10 = obj.q(obj.f36721Z);
                e(q10.d(), 127, 128);
                c4135j.f0(q10);
                return;
            }
        }
        e(c4138m.d(), 127, 0);
        c4135j.f0(c4138m);
    }

    public final void d(ArrayList arrayList) {
        int i10;
        int i11;
        if (this.f28571d) {
            int i12 = this.f28570c;
            if (i12 < this.f28572e) {
                e(i12, 31, 32);
            }
            this.f28571d = false;
            this.f28570c = Integer.MAX_VALUE;
            e(this.f28572e, 31, 32);
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C2729c c2729c = (C2729c) arrayList.get(i13);
            C4138m p10 = c2729c.f28557a.p();
            Integer num = (Integer) AbstractC2732f.f28578b.get(p10);
            C4138m c4138m = c2729c.f28558b;
            if (num != null) {
                int intValue = num.intValue();
                i10 = intValue + 1;
                if (2 <= i10 && i10 < 8) {
                    C2729c[] c2729cArr = AbstractC2732f.f28577a;
                    if (AbstractC3557B.K(c2729cArr[intValue].f28558b, c4138m)) {
                        i11 = i10;
                    } else if (AbstractC3557B.K(c2729cArr[i10].f28558b, c4138m)) {
                        i10 = intValue + 2;
                        i11 = i10;
                    }
                }
                i11 = i10;
                i10 = -1;
            } else {
                i11 = -1;
                i10 = -1;
            }
            if (i10 == -1) {
                int i14 = this.f28574g + 1;
                int length = this.f28573f.length;
                while (true) {
                    if (i14 >= length) {
                        break;
                    }
                    C2729c c2729c2 = this.f28573f[i14];
                    AbstractC3557B.Z(c2729c2);
                    if (AbstractC3557B.K(c2729c2.f28557a, p10)) {
                        C2729c c2729c3 = this.f28573f[i14];
                        AbstractC3557B.Z(c2729c3);
                        if (AbstractC3557B.K(c2729c3.f28558b, c4138m)) {
                            i10 = AbstractC2732f.f28577a.length + (i14 - this.f28574g);
                            break;
                        } else if (i11 == -1) {
                            i11 = (i14 - this.f28574g) + AbstractC2732f.f28577a.length;
                        }
                    }
                    i14++;
                }
            }
            if (i10 != -1) {
                e(i10, 127, 128);
            } else if (i11 == -1) {
                this.f28569b.w0(64);
                c(p10);
                c(c4138m);
                b(c2729c);
            } else {
                C4138m c4138m2 = C2729c.f28551d;
                p10.getClass();
                AbstractC3557B.c0("prefix", c4138m2);
                if (p10.m(0, c4138m2, c4138m2.d()) && !AbstractC3557B.K(C2729c.f28556i, p10)) {
                    e(i11, 15, 0);
                    c(c4138m);
                } else {
                    e(i11, 63, 64);
                    c(c4138m);
                    b(c2729c);
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        C4135j c4135j = this.f28569b;
        if (i10 < i11) {
            c4135j.w0(i10 | i12);
            return;
        }
        c4135j.w0(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            c4135j.w0(128 | (i13 & 127));
            i13 >>>= 7;
        }
        c4135j.w0(i13);
    }
}
