package ub;

import id.AbstractC3557B;
import java.util.Map;
import y.AbstractC6482u;
import y.C6478p;
import y.O;
import y.d0;
import y.p0;
import z.AbstractC6670J0;
import z.AbstractC6696f;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final r f46587Z = new r(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final r f46588h0 = new r(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final r f46589i0 = new r(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final r f46590j0 = new r(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final r f46591k0 = new r(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final r f46592l0 = new r(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final r f46593m0 = new r(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final r f46594n0 = new r(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final r f46595o0 = new r(8);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46596Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10) {
        super(1);
        this.f46596Y = i10;
    }

    public final O a(AbstractC6482u abstractC6482u) {
        switch (this.f46596Y) {
            case 5:
                AbstractC3557B.c0("$this$null", abstractC6482u);
                d0 b10 = androidx.compose.animation.b.c(AbstractC6696f.v(600, 0, null, 6), 2).b(androidx.compose.animation.b.e(null, 0.0f, 7));
                r rVar = f46590j0;
                int i10 = Z0.i.f22798c;
                Map map = AbstractC6670J0.f51158a;
                return new O(b10.b(androidx.compose.animation.b.i(AbstractC6696f.u(0.0f, 400.0f, new Z0.i(kotlin.jvm.internal.m.c(1, 1)), 1), rVar)), androidx.compose.animation.b.d(AbstractC6696f.v(600, 0, null, 6), 2).b(androidx.compose.animation.b.f(null, 7)).b(androidx.compose.animation.b.k(AbstractC6696f.u(0.0f, 400.0f, new Z0.i(kotlin.jvm.internal.m.c(1, 1)), 1), f46591k0)), 0.0f, null, 12);
            default:
                AbstractC3557B.c0("$this$null", abstractC6482u);
                return new O(androidx.compose.animation.b.i(AbstractC6696f.v(350, 0, null, 6), f46593m0).b(androidx.compose.animation.b.c(AbstractC6696f.v(250, 0, null, 6), 2)), androidx.compose.animation.b.k(AbstractC6696f.v(350, 0, null, 6), f46594n0).b(androidx.compose.animation.b.d(AbstractC6696f.v(250, 0, null, 6), 2)), 0.0f, new p0(false, C6478p.f50268Z), 4);
        }
    }

    public final long c(long j6) {
        switch (this.f46596Y) {
            case 1:
                return kotlin.jvm.internal.m.c((-((int) (j6 >> 32))) / 20, 0);
            case 2:
            case 5:
            default:
                return kotlin.jvm.internal.m.c(0, (-((int) (j6 & 4294967295L))) / 2);
            case 3:
                return kotlin.jvm.internal.m.c((-((int) (j6 >> 32))) / 3, 0);
            case 4:
                return kotlin.jvm.internal.m.c((-((int) (j6 >> 32))) / 3, 0);
            case 6:
                return kotlin.jvm.internal.m.c(0, ((int) (j6 & 4294967295L)) / 2);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f46596Y) {
            case 0:
                String str = (String) obj;
                AbstractC3557B.c0("line", str);
                int k22 = Lg.n.k2(str, '#', 0, false, 6);
                if (k22 == -1) {
                    return null;
                }
                String obj2 = Lg.n.U2(Lg.o.W2(k22 + 1, str)).toString();
                if (!(!Lg.n.n2(obj2))) {
                    return null;
                }
                return obj2;
            case 1:
                return new Z0.i(c(((Z0.k) obj).f22804a));
            case 2:
                ((Number) obj).intValue();
                return 0;
            case 3:
                return new Z0.i(c(((Z0.k) obj).f22804a));
            case 4:
                return new Z0.i(c(((Z0.k) obj).f22804a));
            case 5:
                return a((AbstractC6482u) obj);
            case 6:
                return new Z0.i(c(((Z0.k) obj).f22804a));
            case 7:
                return new Z0.i(c(((Z0.k) obj).f22804a));
            default:
                return a((AbstractC6482u) obj);
        }
    }
}
