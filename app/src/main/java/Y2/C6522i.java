package y2;

/* renamed from: y2.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6522i {

    /* renamed from: a  reason: collision with root package name */
    public final long f50618a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50619b;

    /* renamed from: c  reason: collision with root package name */
    public final float f50620c;

    /* renamed from: d  reason: collision with root package name */
    public long f50621d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public long f50622e = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f50624g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f50625h = -9223372036854775807L;

    /* renamed from: k  reason: collision with root package name */
    public float f50628k = 0.97f;

    /* renamed from: j  reason: collision with root package name */
    public float f50627j = 1.03f;

    /* renamed from: l  reason: collision with root package name */
    public float f50629l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public long f50630m = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f50623f = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    public long f50626i = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public long f50631n = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public long f50632o = -9223372036854775807L;

    public C6522i(long j6, long j10, float f6) {
        this.f50618a = j6;
        this.f50619b = j10;
        this.f50620c = f6;
    }

    public final void a() {
        long j6;
        long j10 = this.f50621d;
        if (j10 != -9223372036854775807L) {
            j6 = this.f50622e;
            if (j6 == -9223372036854775807L) {
                long j11 = this.f50624g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j6 = this.f50625h;
                if (j6 == -9223372036854775807L || j10 <= j6) {
                    j6 = j10;
                }
            }
        } else {
            j6 = -9223372036854775807L;
        }
        if (this.f50623f == j6) {
            return;
        }
        this.f50623f = j6;
        this.f50626i = j6;
        this.f50631n = -9223372036854775807L;
        this.f50632o = -9223372036854775807L;
        this.f50630m = -9223372036854775807L;
    }
}
