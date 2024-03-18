package L;

import N0.C1046e;
import T0.C1406a;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class L extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f9986Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f9987Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ P0 f9988h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ T0.z f9989i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(boolean z10, boolean z11, P0 p02, L0.v vVar, T0.z zVar) {
        super(1);
        this.f9986Y = z10;
        this.f9987Z = z11;
        this.f9988h0 = p02;
        this.f9989i0 = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.k
    public final Object invoke(Object obj) {
        C1046e c1046e = (C1046e) obj;
        if (!this.f9986Y && this.f9987Z) {
            P0 p02 = this.f9988h0;
            T0.F f6 = p02.f10033e;
            G g10 = p02.f10048t;
            jf.y yVar = null;
            if (f6 != null) {
                T0.z a5 = p02.f10032d.a(AbstractC4344b.G0(new Object(), new C1406a(c1046e, 1)));
                f6.a(null, a5);
                g10.invoke(a5);
                yVar = jf.y.f36177a;
            }
            if (yVar == null) {
                T0.z zVar = this.f9989i0;
                String str = zVar.f16830a.f12512Y;
                int i10 = N0.D.f12484c;
                long j6 = zVar.f16831b;
                int i11 = (int) (j6 >> 32);
                String obj2 = Lg.n.C2(str, i11, (int) (j6 & 4294967295L), c1046e).toString();
                int length = c1046e.f12512Y.length() + i11;
                g10.invoke(new T0.z(obj2, U3.f.e(length, length), 4));
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
