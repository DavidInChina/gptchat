package Ga;

import A.AbstractC0044t0;
import A.C0039q0;
import Df.H;
import Qg.AbstractC1207j;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import eh.AbstractC2911k;
import eh.C2917q;
import eh.C2918r;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import kf.AbstractC4268D;
import kotlinx.serialization.internal.InlineClassDescriptor;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import wf.AbstractC6216a;
import xe.AbstractC6414c;
import xe.AbstractC6416e;
import xe.AbstractC6435x;
import xe.C6396A;
import xe.C6417f;
import xe.C6433v;
import ze.AbstractC6848g;

/* loaded from: classes.dex */
public final class C extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6185Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6186Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E f6187h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ L9.B f6188i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f6189j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6190k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e10, L9.B b10, String str, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6187h0 = e10;
        this.f6188i0 = b10;
        this.f6189j0 = str;
        this.f6190k0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C c10 = new C(this.f6187h0, this.f6188i0, this.f6189j0, this.f6190k0, abstractC4825e);
        c10.f6186Z = obj;
        return c10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6185Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC1207j abstractC1207j = (AbstractC1207j) this.f6186Z;
            E e10 = this.f6187h0;
            ge.d dVar = e10.f6195a;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "conversation", null, 23);
            Boolean bool = Boolean.TRUE;
            InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
            C2918r c2918r = new C2918r(bool, false, null);
            C2917q c2917q = md.b.f39132a;
            c2917q.getClass();
            LinkedHashMap m12 = AbstractC4268D.m1(AbstractC2911k.g(c2917q.c(L9.B.Companion.serializer(), this.f6188i0)));
            m12.put("stream", c2918r);
            kotlinx.serialization.json.c cVar = new kotlinx.serialization.json.c(m12);
            if (cVar instanceof AbstractC6848g) {
                c5760d.f46128d = cVar;
                c5760d.b(null);
            } else {
                c5760d.f46128d = cVar;
                Df.w a5 = kotlin.jvm.internal.C.a(kotlinx.serialization.json.b.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, kotlinx.serialization.json.b.class, H.O(a5), a5, c5760d);
            }
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            C6417f c6417f = AbstractC6416e.f49884b;
            AbstractC3557B.c0("contentType", c6417f);
            C6433v a10 = c5760d.a();
            List list = AbstractC6435x.f49956a;
            a10.f(SIPHeaderNames.ACCEPT, c6417f.toString());
            P4.a.d0(c5760d, new C0039q0(this.f6189j0, 16));
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            B b10 = new B(e10, abstractC1207j, this.f6190k0, null);
            this.f6185Y = 1;
            if (A10.c(b10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
