package Qd;

import Df.AbstractC0405d;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qd.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1187f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14599Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f14600Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f14601h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlinx.serialization.json.c f14602i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187f(i iVar, String str, kotlinx.serialization.json.c cVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14600Z = iVar;
        this.f14601h0 = str;
        this.f14602i0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1187f(this.f14600Z, this.f14601h0, this.f14602i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1187f) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Li.a, java.lang.Object, Qd.G] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14599Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Li.q e10 = this.f14600Z.f14611Z.e();
            String str = this.f14601h0;
            AbstractC3557B.c0("userId", str);
            kotlinx.serialization.json.c cVar = this.f14602i0;
            AbstractC3557B.c0("traits", cVar);
            ?? obj2 = new Object();
            obj2.f14580a = str;
            obj2.f14581b = cVar;
            AbstractC0405d b10 = kotlin.jvm.internal.C.f37623a.b(H.class);
            this.f14599Y = 1;
            if (e10.b(obj2, b10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
