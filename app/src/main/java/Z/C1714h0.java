package Z;

/* renamed from: Z.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1714h0 implements AbstractC1707e {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1707e f22637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22638b;

    /* renamed from: c  reason: collision with root package name */
    public int f22639c;

    public C1714h0(AbstractC1707e abstractC1707e, int i10) {
        this.f22637a = abstractC1707e;
        this.f22638b = i10;
    }

    @Override // Z.AbstractC1707e
    public final Object a() {
        return this.f22637a.a();
    }

    @Override // Z.AbstractC1707e
    public final void b(int i10, Object obj) {
        int i11;
        if (this.f22639c == 0) {
            i11 = this.f22638b;
        } else {
            i11 = 0;
        }
        this.f22637a.b(i10 + i11, obj);
    }

    @Override // Z.AbstractC1707e
    public final void c(Object obj) {
        this.f22639c++;
        this.f22637a.c(obj);
    }

    @Override // Z.AbstractC1707e
    public final void clear() {
        AbstractC1734s.j("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // Z.AbstractC1707e
    public final void d(int i10, int i11, int i12) {
        int i13;
        if (this.f22639c == 0) {
            i13 = this.f22638b;
        } else {
            i13 = 0;
        }
        this.f22637a.d(i10 + i13, i11 + i13, i12);
    }

    @Override // Z.AbstractC1707e
    public final void e(int i10, int i11) {
        int i12;
        if (this.f22639c == 0) {
            i12 = this.f22638b;
        } else {
            i12 = 0;
        }
        this.f22637a.e(i10 + i12, i11);
    }

    @Override // Z.AbstractC1707e
    public final void f() {
        int i10 = this.f22639c;
        if (i10 > 0) {
            this.f22639c = i10 - 1;
            this.f22637a.f();
            return;
        }
        AbstractC1734s.j("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }

    @Override // Z.AbstractC1707e
    public final void g(int i10, Object obj) {
        int i11;
        if (this.f22639c == 0) {
            i11 = this.f22638b;
        } else {
            i11 = 0;
        }
        this.f22637a.g(i10 + i11, obj);
    }

    @Override // Z.AbstractC1707e
    public final /* synthetic */ void h() {
    }
}
