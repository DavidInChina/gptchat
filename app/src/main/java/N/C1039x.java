package N;

import jf.AbstractC3957g;
import wf.AbstractC6216a;

/* renamed from: N.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039x extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1033q f12446Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f12447Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f12448h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Q f12449i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3957g f12450j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039x(C1033q c1033q, int i10, int i11, Q q10, AbstractC3957g abstractC3957g) {
        super(0);
        this.f12446Y = c1033q;
        this.f12447Z = i10;
        this.f12448h0 = i11;
        this.f12449i0 = q10;
        this.f12450j0 = abstractC3957g;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        boolean z10;
        int intValue = ((Number) this.f12450j0.getValue()).intValue();
        Q q10 = this.f12449i0;
        boolean a5 = q10.a();
        if (q10.h() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1033q c1033q = this.f12446Y;
        N0.C c10 = c1033q.f12400f;
        int i10 = this.f12447Z;
        long p10 = c10.p(i10);
        int i11 = N0.D.f12484c;
        int i12 = (int) (p10 >> 32);
        N0.C c11 = c1033q.f12400f;
        int g10 = c11.g(i12);
        N0.i iVar = c11.f12478b;
        if (g10 != intValue) {
            int i13 = iVar.f12529f;
            if (intValue >= i13) {
                i12 = c11.k(i13 - 1);
            } else {
                i12 = c11.k(intValue);
            }
        }
        int i14 = (int) (p10 & 4294967295L);
        if (c11.g(i14) != intValue) {
            int i15 = iVar.f12529f;
            if (intValue >= i15) {
                i14 = c11.f(i15 - 1, false);
            } else {
                i14 = c11.f(intValue, false);
            }
        }
        int i16 = this.f12448h0;
        if (i12 == i16) {
            return c1033q.a(i14);
        }
        if (i14 == i16) {
            return c1033q.a(i12);
        }
        if (!(a5 ^ z10) ? i10 >= i12 : i10 > i14) {
            i12 = i14;
        }
        return c1033q.a(i12);
    }
}
