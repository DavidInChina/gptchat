package S8;

import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: S8.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374s extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16367Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f16368Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f16369h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E0.P f16370i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float f16371j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f16372k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374s(int i10, List list, List list2, E0.P p10, float f6, E0.d0 d0Var) {
        super(1);
        this.f16367Y = i10;
        this.f16368Z = list;
        this.f16369h0 = list2;
        this.f16370i0 = p10;
        this.f16371j0 = f6;
        this.f16372k0 = d0Var;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC3557B.c0("$this$layout", (E0.c0) obj);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16367Y; i11++) {
            E0.d0 d0Var = (E0.d0) this.f16368Z.get(i11);
            E0.d0 d0Var2 = (E0.d0) this.f16369h0.get(i11);
            int max = Math.max(d0Var.f4054Z, d0Var2.f4054Z);
            float f6 = this.f16371j0;
            E0.P p10 = this.f16370i0;
            int a02 = p10.a0(f6) + max;
            E0.d0 d0Var3 = this.f16372k0;
            long c10 = Ng.H.c(d0Var3.f4053Y - d0Var.f4053Y, a02 - d0Var.f4054Z);
            int i12 = (int) (c10 >> 32);
            float f10 = (i12 - i12) / 2.0f;
            int i13 = (int) (c10 & 4294967295L);
            float f11 = (i13 - i13) / 2.0f;
            float f12 = 1.0f;
            if (p10.getLayoutDirection() != Z0.l.f22805Y) {
                f12 = 1.0f * (-1);
            }
            float f13 = 1;
            long c11 = kotlin.jvm.internal.m.c(AbstractC4344b.Y0((f12 + f13) * f10), AbstractC4344b.Y0((f13 - 1.0f) * f11));
            int i14 = Z0.i.f22798c;
            E0.c0.c(d0Var, (int) (c11 >> 32), ((int) (c11 & 4294967295L)) + i10, 0.0f);
            E0.c0.c(d0Var2, d0Var3.f4053Y, i10, 0.0f);
            i10 += a02;
        }
        return jf.y.f36177a;
    }
}
