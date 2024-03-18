package T0;

import N0.C1046e;
import id.AbstractC3557B;
import java.util.List;
import r0.C5335B;

/* renamed from: T0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409d extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1409d f16761Z = new C1409d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1409d f16762h0 = new C1409d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C1409d f16763i0 = new C1409d(3);

    /* renamed from: j0  reason: collision with root package name */
    public static final C1409d f16764j0 = new C1409d(4);

    /* renamed from: k0  reason: collision with root package name */
    public static final C1409d f16765k0 = new C1409d(5);

    /* renamed from: l0  reason: collision with root package name */
    public static final C1409d f16766l0 = new C1409d(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16767Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1409d(int i10) {
        super(1);
        this.f16767Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C1046e c1046e;
        N0.D d10;
        jf.y yVar = jf.y.f36177a;
        switch (this.f16767Y) {
            case 0:
                float[] fArr = ((C5335B) obj).f44167a;
                return yVar;
            case 1:
                float[] fArr2 = ((C5335B) obj).f44167a;
                return yVar;
            case 2:
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list = (List) obj;
                Object obj2 = list.get(0);
                i0.r rVar = N0.x.f12609a;
                Boolean bool = Boolean.FALSE;
                if (AbstractC3557B.K(obj2, bool) || obj2 == null) {
                    c1046e = null;
                } else {
                    c1046e = (C1046e) rVar.f32435b.invoke(obj2);
                }
                AbstractC3557B.Z(c1046e);
                Object obj3 = list.get(1);
                int i10 = N0.D.f12484c;
                i0.r rVar2 = N0.x.f12621m;
                if (AbstractC3557B.K(obj3, bool) || obj3 == null) {
                    d10 = null;
                } else {
                    d10 = (N0.D) rVar2.f32435b.invoke(obj3);
                }
                AbstractC3557B.Z(d10);
                return new z(c1046e, d10.f12485a, (N0.D) null);
            case 3:
                List list2 = (List) obj;
                return yVar;
            case 4:
                int i11 = ((n) obj).f16801a;
                return yVar;
            case 5:
                List list3 = (List) obj;
                return yVar;
            default:
                int i12 = ((n) obj).f16801a;
                return yVar;
        }
    }
}
