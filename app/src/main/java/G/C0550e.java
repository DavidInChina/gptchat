package G;

/* renamed from: G.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0550e {

    /* renamed from: a  reason: collision with root package name */
    public final int f5496a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5497b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5498c;

    public C0550e(int i10, Object obj, int i11) {
        this.f5496a = i10;
        this.f5497b = i11;
        this.f5498c = obj;
        if (i10 >= 0) {
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("size should be >0, but was ", i11).toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("startIndex should be >= 0, but was ", i10).toString());
    }
}
