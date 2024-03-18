package h1;

import java.util.Arrays;

/* renamed from: h1.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3302i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f31729a;

    /* renamed from: e  reason: collision with root package name */
    public float f31733e;

    /* renamed from: l  reason: collision with root package name */
    public int f31740l;

    /* renamed from: b  reason: collision with root package name */
    public int f31730b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f31731c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f31732d = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31734f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f31735g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f31736h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public C3296c[] f31737i = new C3296c[16];

    /* renamed from: j  reason: collision with root package name */
    public int f31738j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f31739k = 0;

    public C3302i(int i10) {
        this.f31740l = i10;
    }

    public final void a(C3296c c3296c) {
        int i10 = 0;
        while (true) {
            int i11 = this.f31738j;
            if (i10 < i11) {
                if (this.f31737i[i10] == c3296c) {
                    return;
                }
                i10++;
            } else {
                C3296c[] c3296cArr = this.f31737i;
                if (i11 >= c3296cArr.length) {
                    this.f31737i = (C3296c[]) Arrays.copyOf(c3296cArr, c3296cArr.length * 2);
                }
                C3296c[] c3296cArr2 = this.f31737i;
                int i12 = this.f31738j;
                c3296cArr2[i12] = c3296c;
                this.f31738j = i12 + 1;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r5 = r4.f31737i;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.f31738j--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C3296c c3296c) {
        int i10 = this.f31738j;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f31737i[i11] == c3296c) {
                break;
            }
            i11++;
        }
    }

    public final void c() {
        this.f31740l = 5;
        this.f31732d = 0;
        this.f31730b = -1;
        this.f31731c = -1;
        this.f31733e = 0.0f;
        this.f31734f = false;
        int i10 = this.f31738j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f31737i[i11] = null;
        }
        this.f31738j = 0;
        this.f31739k = 0;
        this.f31729a = false;
        Arrays.fill(this.f31736h, 0.0f);
    }

    public final void d(C3296c c3296c) {
        int i10 = this.f31738j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f31737i[i11].h(c3296c, false);
        }
        this.f31738j = 0;
    }

    public final String toString() {
        return "" + this.f31730b;
    }
}
