package ji;

import id.AbstractC3557B;

/* renamed from: ji.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4114C implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4137l f36662Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4135j f36663Z;

    /* renamed from: h0  reason: collision with root package name */
    public C4117F f36664h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f36665i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f36666j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f36667k0;

    public C4114C(AbstractC4137l abstractC4137l) {
        int i10;
        AbstractC3557B.c0("upstream", abstractC4137l);
        this.f36662Y = abstractC4137l;
        C4135j d10 = abstractC4137l.d();
        this.f36663Z = d10;
        C4117F c4117f = d10.f36720Y;
        this.f36664h0 = c4117f;
        if (c4117f != null) {
            i10 = c4117f.f36675b;
        } else {
            i10 = -1;
        }
        this.f36665i0 = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36666j0 = true;
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f36662Y.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r3 == r5.f36675b) goto L14;
     */
    @Override // ji.AbstractC4122K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g0(C4135j c4135j, long j6) {
        C4117F c4117f;
        AbstractC3557B.c0("sink", c4135j);
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (!this.f36666j0) {
                C4117F c4117f2 = this.f36664h0;
                C4135j c4135j2 = this.f36663Z;
                if (c4117f2 != null) {
                    C4117F c4117f3 = c4135j2.f36720Y;
                    if (c4117f2 == c4117f3) {
                        int i11 = this.f36665i0;
                        AbstractC3557B.Z(c4117f3);
                    }
                    throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
                }
                if (i10 == 0) {
                    return 0L;
                }
                if (!this.f36662Y.o0(this.f36667k0 + 1)) {
                    return -1L;
                }
                if (this.f36664h0 == null && (c4117f = c4135j2.f36720Y) != null) {
                    this.f36664h0 = c4117f;
                    this.f36665i0 = c4117f.f36675b;
                }
                long min = Math.min(j6, c4135j2.f36721Z - this.f36667k0);
                this.f36663Z.j(this.f36667k0, min, c4135j);
                this.f36667k0 += min;
                return min;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }
}
