package y2;

import j7.C3914d;
import j7.C3919i;
import l7.AbstractC4341b;
import z2.AbstractC6758c;
import z2.C6757b;

/* renamed from: y2.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6536x implements s2.m, AbstractC4341b {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50706Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f50707Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f50708h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50709i0;

    public /* synthetic */ C6536x(int i10, p2.W w10, p2.W w11) {
        this.f50707Z = i10;
        this.f50708h0 = w10;
        this.f50709i0 = w11;
    }

    @Override // l7.AbstractC4341b
    public final Object c() {
        ((C3914d) ((C3919i) this.f50708h0).f36058d).a((e7.i) this.f50709i0, this.f50707Z + 1, false);
        return null;
    }

    @Override // s2.m
    public final void invoke(Object obj) {
        switch (this.f50706Y) {
            case 0:
                p2.V v10 = (p2.V) obj;
                v10.getClass();
                v10.p(this.f50707Z, (p2.W) this.f50708h0, (p2.W) this.f50709i0);
                return;
            default:
                ((AbstractC6758c) obj).getClass();
                return;
        }
    }

    public /* synthetic */ C6536x(C6757b c6757b, Object obj, int i10) {
        this.f50708h0 = c6757b;
        this.f50709i0 = obj;
        this.f50707Z = i10;
    }
}
