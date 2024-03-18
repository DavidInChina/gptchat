package Ga;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.N;
import eh.C2917q;
import j$.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes.dex */
public final class A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6177Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6178Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i f6179h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(i iVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6179h0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        A a5 = new A(this.f6179h0, abstractC4825e);
        a5.f6178Z = obj;
        return a5;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6177Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "conversations", null, 23);
            C2917q c2917q = md.b.f39132a;
            c2917q.getClass();
            Map.EL.forEach((kotlinx.serialization.json.c) c2917q.c(i.Companion.serializer(), this.f6179h0), new y(new z(c5760d, 0), 0));
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f6178Z);
            this.f6177Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
