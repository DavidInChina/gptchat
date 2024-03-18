package G;

import B.W0;
import E0.AbstractC0447f;
import E0.AbstractC0449h;
import E0.k0;
import k6.AbstractC4194d;
import l0.AbstractC4326r;

/* renamed from: G.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570z implements F0.g, AbstractC0447f {

    /* renamed from: g  reason: collision with root package name */
    public static final C0568x f5576g = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final A f5577b;

    /* renamed from: c  reason: collision with root package name */
    public final C0567w f5578c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5579d;

    /* renamed from: e  reason: collision with root package name */
    public final Z0.l f5580e;

    /* renamed from: f  reason: collision with root package name */
    public final W0 f5581f;

    public C0570z(A a5, C0567w c0567w, boolean z10, Z0.l lVar, W0 w02) {
        this.f5577b = a5;
        this.f5578c = c0567w;
        this.f5579d = z10;
        this.f5580e = lVar;
        this.f5581f = w02;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    @Override // F0.g
    public final F0.i getKey() {
        return AbstractC0449h.f4065a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 == B.W0.f1213Y) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3 == B.W0.f1214Z) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(C0566v c0566v, int i10) {
        boolean c10 = k0.c(i10, 5);
        W0 w02 = this.f5581f;
        if (!c10 && !k0.c(i10, 6)) {
            if (!k0.c(i10, 3) && !k0.c(i10, 4)) {
                if (!k0.c(i10, 1) && !k0.c(i10, 2)) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                }
            }
            if (m(i10)) {
                if (c0566v.f5571b >= this.f5577b.a() - 1) {
                    return false;
                }
            } else if (c0566v.f5570a <= 0) {
                return false;
            }
            return true;
        }
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public final boolean m(int i10) {
        if (!k0.c(i10, 1)) {
            if (k0.c(i10, 2)) {
                return true;
            }
            boolean c10 = k0.c(i10, 5);
            boolean z10 = this.f5579d;
            if (!c10) {
                if (k0.c(i10, 6)) {
                    if (!z10) {
                        return true;
                    }
                } else {
                    boolean c11 = k0.c(i10, 3);
                    Z0.l lVar = this.f5580e;
                    if (c11) {
                        int ordinal = lVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                if (!z10) {
                                    return true;
                                }
                            } else {
                                throw new RuntimeException();
                            }
                        }
                    } else if (k0.c(i10, 4)) {
                        int ordinal2 = lVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new RuntimeException();
                            }
                        } else if (!z10) {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                    }
                }
            }
            return z10;
        }
        return false;
    }

    @Override // F0.g
    public final Object getValue() {
        return this;
    }
}
