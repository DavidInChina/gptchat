package ge;

import K4.C0813a;
import Q3.h;
import e9.C2813f;
import id.AbstractC3557B;
import je.g;
import jf.y;
import kotlin.jvm.internal.o;
import me.AbstractC4642o;
import te.C5763g;
import ve.C6038g;
import wf.k;

/* renamed from: ge.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3257a extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3257a f31581Z = new C3257a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3257a f31582h0 = new C3257a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3257a f31583i0 = new C3257a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31584Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3257a(int i10) {
        super(1);
        this.f31584Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f31584Y) {
            case 0:
                d dVar = (d) obj;
                AbstractC3557B.c0("$this$install", dVar);
                Ei.a aVar = AbstractC4642o.f39224a;
                dVar.f31598k0.f(C5763g.f46143j, new h(11, null));
                C0813a c0813a = C6038g.f47500h;
                C2813f c2813f = new C2813f(null);
                C6038g c6038g = dVar.f31599l0;
                c6038g.f(c0813a, c2813f);
                c6038g.f(c0813a, new h(12, null));
                return yVar;
            case 1:
                AbstractC3557B.c0("$this$null", (g) obj);
                return yVar;
            default:
                AbstractC3557B.c0("$this$null", obj);
                return yVar;
        }
    }
}
