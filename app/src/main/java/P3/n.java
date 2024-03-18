package p3;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final L2.G f42549a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42550b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42551c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42552d;

    /* renamed from: e  reason: collision with root package name */
    public int f42553e;

    /* renamed from: f  reason: collision with root package name */
    public int f42554f;

    /* renamed from: g  reason: collision with root package name */
    public long f42555g;

    /* renamed from: h  reason: collision with root package name */
    public long f42556h;

    public n(L2.G g10) {
        this.f42549a = g10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (this.f42551c) {
            int i12 = this.f42554f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42552d = z10;
                this.f42551c = false;
                return;
            }
            this.f42554f = (i11 - i10) + i12;
        }
    }

    public final void b(int i10, long j6, boolean z10) {
        if (this.f42553e == 182 && z10 && this.f42550b) {
            long j10 = this.f42556h;
            if (j10 != -9223372036854775807L) {
                this.f42549a.e(j10, this.f42552d ? 1 : 0, (int) (j6 - this.f42555g), i10, null);
            }
        }
        if (this.f42553e != 179) {
            this.f42555g = j6;
        }
    }
}
