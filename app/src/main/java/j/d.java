package J;

import F.B;
import F.C0535i;
import L.G;
import L.P0;
import N0.C1046e;
import T0.C1406a;
import T0.F;
import T0.z;
import U3.f;
import bb.AbstractC2171k;
import bb.C2170j;
import bb.V;
import bb.W;
import cb.C2350T;
import d9.i;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import na.C4751f0;
import wf.k;
import y.C6461B;
import y.C6471i;

/* loaded from: classes2.dex */
public final class d extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8721Y = 2;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f8722Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f8723h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f8724i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f8725j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C2350T c2350t, boolean z10, k kVar, boolean z11) {
        super(1);
        this.f8724i0 = c2350t;
        this.f8722Z = z10;
        this.f8725j0 = kVar;
        this.f8723h0 = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f8721Y;
        boolean z10 = this.f8722Z;
        boolean z11 = this.f8723h0;
        Object obj2 = this.f8724i0;
        switch (i10) {
            case 1:
                C1046e c1046e = (C1046e) obj;
                if (!z10 && z11) {
                    P0 p02 = (P0) obj2;
                    F f6 = p02.f10033e;
                    G g10 = p02.f10048t;
                    if (f6 != null) {
                        z a5 = p02.f10032d.a(AbstractC4344b.G0(new Object(), new C1406a(c1046e, 1)));
                        f6.a(null, a5);
                        g10.invoke(a5);
                    } else {
                        yVar = null;
                    }
                    if (yVar == null) {
                        String str = c1046e.f12512Y;
                        int length = str.length();
                        g10.invoke(new z(str, f.e(length, length), 4));
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                B b10 = (B) obj;
                AbstractC3557B.c0("$this$LazyColumn", b10);
                C2350T c2350t = (C2350T) obj2;
                E9.f.t(b10, null, new C3288a(new C6471i(15, c2350t), true, -961983080), 3);
                boolean z12 = c2350t.f26486a.f26496d;
                List list = c2350t.f26487b;
                Object obj3 = this.f8725j0;
                if (z12) {
                    ((C0535i) b10).l0(list.size(), null, new C4751f0(C2170j.f25842l0, list, 10), new C3288a(new i(list, c2350t, (k) obj3, 2), true, -632812321));
                } else {
                    ((C0535i) b10).l0(list.size(), null, new C6461B(8, list), new C3288a(new W(list, c2350t, (k) obj3, z11), true, -1091073711));
                }
                if (z10) {
                    for (int i11 = 0; i11 < 3; i11++) {
                        E9.f.t(b10, null, AbstractC2171k.f25859b, 3);
                    }
                }
                E9.f.t(b10, null, new C3288a(new V(0, c2350t, (k) obj3), true, 2101333327), 3);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z10, boolean z11, P0 p02, Object obj) {
        super(1);
        this.f8722Z = z10;
        this.f8723h0 = z11;
        this.f8724i0 = p02;
        this.f8725j0 = obj;
    }
}
