package S8;

import E0.o0;
import H0.B0;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f16265Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f16266Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o0 f16267h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f16268i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f16269j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ List f16270k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ float f16271l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ wf.k f16272m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(float f6, ArrayList arrayList, o0 o0Var, int i10, int i11, ArrayList arrayList2, float f10, wf.k kVar) {
        super(1);
        this.f16265Y = f6;
        this.f16266Z = arrayList;
        this.f16267h0 = o0Var;
        this.f16268i0 = i10;
        this.f16269j0 = i11;
        this.f16270k0 = arrayList2;
        this.f16271l0 = f10;
        this.f16272m0 = kVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        E0.c0 c0Var = (E0.c0) obj;
        AbstractC3557B.c0("$this$layout", c0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f6 = this.f16265Y;
        float f10 = f6;
        int i10 = 0;
        for (Object obj2 : this.f16266Z) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                float f11 = f6 / 2.0f;
                arrayList.add(Float.valueOf(f10 - f11));
                float f12 = f6;
                for (E0.d0 d0Var : (List) obj2) {
                    if (i10 == 0) {
                        arrayList2.add(Float.valueOf(f12 - f11));
                    }
                    E0.c0.c(d0Var, AbstractC4344b.Y0(f12), AbstractC4344b.Y0(f10), 0.0f);
                    f12 += this.f16271l0 + f6;
                }
                if (i10 == 0) {
                    arrayList2.add(Float.valueOf(f12 - f11));
                }
                f10 += ((Number) this.f16270k0.get(i10)).floatValue() + f6;
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        arrayList.add(Float.valueOf(f10 - (f6 / 2.0f)));
        a0 a0Var = new a0(arrayList, arrayList2);
        E0.c0.g(c0Var, ((E0.M) kf.t.B2(this.f16267h0.z(Boolean.TRUE, new C3288a(new androidx.compose.foundation.layout.c(this.f16272m0, 14, a0Var), true, -1387549559)))).o(B0.d(this.f16268i0, this.f16269j0)), 0, 0);
        return jf.y.f36177a;
    }
}
