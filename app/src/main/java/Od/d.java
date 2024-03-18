package Od;

import B0.C0197n;
import K4.J;
import Ng.F;
import Qd.A;
import com.google.android.gms.internal.play_billing.N;
import eh.C2917q;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.UUID;
import jf.y;
import kf.AbstractC4268D;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public B f13690Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f13691Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ e f13692h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f13693i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f13692h0 = eVar;
        this.f13693i0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new d(this.f13692h0, this.f13693i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        B b10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f13691Z;
        e eVar = this.f13692h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            B b11 = this.f13690Y;
            N.B0(obj);
            b10 = b11;
        } else {
            N.B0(obj);
            String uuid = UUID.randomUUID().toString();
            AbstractC3557B.b0("randomUUID().toString()", uuid);
            ?? obj2 = new Object();
            obj2.f37622Y = uuid;
            b bVar = new b(obj2, Ad.l.L(Ad.l.g(Bi.c.z()), null, new c(eVar, this.f13693i0, uuid, null), 3), null);
            this.f13690Y = obj2;
            this.f13691Z = 1;
            b10 = obj2;
            if (J.k0(2000L, bVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        kotlinx.serialization.json.c cVar = eVar.f13699k0;
        if (cVar != null) {
            C0197n c0197n = new C0197n(4, b10);
            C2917q c2917q = Vd.h.f18603a;
            LinkedHashMap m12 = AbstractC4268D.m1(cVar);
            c0197n.invoke(m12);
            eVar.f13699k0 = new kotlinx.serialization.json.c(m12);
            A a5 = eVar.f13696h0;
            if (a5 != null) {
                this.f13690Y = null;
                this.f13691Z = 2;
                if (a5.e(9, (String) b10.f37622Y, this) == enumC5000a) {
                    return enumC5000a;
                }
                return y.f36177a;
            }
            AbstractC3557B.C2("storage");
            throw null;
        }
        AbstractC3557B.C2("device");
        throw null;
    }
}
