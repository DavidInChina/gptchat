package mb;

import fa.C2969F;
import id.AbstractC3557B;
import wd.C6182c0;

/* renamed from: mb.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4612y extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4612y f39114Z = new C4612y(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4612y f39115h0 = new C4612y(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4612y f39116i0 = new C4612y(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C4612y f39117j0 = new C4612y(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C4612y f39118k0 = new C4612y(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39119Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4612y(int i10) {
        super(1);
        this.f39119Y = i10;
    }

    public final hb.t a(hb.t tVar) {
        switch (this.f39119Y) {
            case 1:
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, false, false, null, 0L, false, false, null, false, 463);
            case 2:
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, false, false, null, 0L, false, false, null, false, 510);
            case 3:
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, false, false, null, 0L, true, false, null, false, 463);
            default:
                AbstractC3557B.c0("$this$setState", tVar);
                return hb.t.e(tVar, false, false, null, 0L, false, false, null, false, 510);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f39119Y) {
            case 0:
                C2969F c2969f = (C2969F) obj;
                AbstractC3557B.c0("it", c2969f);
                return new C6182c0(c2969f.f30008a);
            case 1:
                return a((hb.t) obj);
            case 2:
                return a((hb.t) obj);
            case 3:
                return a((hb.t) obj);
            default:
                return a((hb.t) obj);
        }
    }
}
