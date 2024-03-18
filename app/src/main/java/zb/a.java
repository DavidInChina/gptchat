package Zb;

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
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23642Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f23643Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f f23644h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23644h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        a aVar = new a(this.f23644h0, abstractC4825e);
        aVar.f23643Z = obj;
        return aVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23642Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d B10 = E9.f.B("https://android.chat.openai.com/public-api/mobile/app_support_status/v1");
            C2917q c2917q = md.b.f39132a;
            c2917q.getClass();
            Map.EL.forEach((kotlinx.serialization.json.c) c2917q.c(f.Companion.serializer(), this.f23644h0), new Ga.y(new z(B10, 2), 2));
            B10.f46130f.e(m.f18555c, y.f36177a);
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49811b, B10, (ge.d) this.f23643Z);
            this.f23642Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
