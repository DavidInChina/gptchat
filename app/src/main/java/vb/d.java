package Vb;

import A.AbstractC0044t0;
import Ga.z;
import Vc.m;
import com.google.android.gms.internal.play_billing.N;
import eh.C2917q;
import j$.util.Map;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import wf.n;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f18508Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18509Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i f18510h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18510h0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        d dVar = new d(this.f18510h0, abstractC4825e);
        dVar.f18509Z = obj;
        return dVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f18508Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d B10 = E9.f.B("https://android.chat.openai.com/public-api/mobile/server_status/v1");
            C2917q c2917q = md.b.f39132a;
            c2917q.getClass();
            Map.EL.forEach((kotlinx.serialization.json.c) c2917q.c(i.Companion.serializer(), this.f18510h0), new Ga.y(new z(B10, 1), 1));
            Fe.a aVar = m.f18553a;
            y yVar = y.f36177a;
            Fe.l lVar = B10.f46130f;
            lVar.e(aVar, yVar);
            lVar.e(m.f18555c, yVar);
            lVar.e(m.f18554b, yVar);
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49811b, B10, (ge.d) this.f18509Z);
            this.f18508Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
