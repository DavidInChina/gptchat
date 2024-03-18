package C9;

import Ng.F;
import b9.p;
import com.google.android.gms.internal.play_billing.N;
import ff.AbstractC3029a;
import gf.AbstractC3268i;
import id.AbstractC3557B;
import io.opentracing.util.GlobalTracer;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import vd.AbstractC6027b;
import vd.AbstractC6030e;
import x8.W;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC3029a f2775Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2776Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6027b f2777h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ p f2778i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AbstractC6027b abstractC6027b, p pVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2777h0 = abstractC6027b;
        this.f2778i0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new h(this.f2777h0, this.f2778i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, java.util.Map] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AbstractC3029a abstractC3029a;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2776Z;
        Throwable th2 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC3029a = this.f2775Y;
                try {
                    N.B0(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } finally {
                        Ad.l.S(abstractC3029a, th2);
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC6027b abstractC6027b = this.f2777h0;
            AbstractC3557B.c0("<this>", abstractC6027b);
            ((k9.d) AbstractC6030e.a()).getClass();
            if (abstractC6027b instanceof k9.c) {
                if (GlobalTracer.f33707Y instanceof AbstractC3268i) {
                    W.W(Pc.e.a(), "Attempting to trace before Tracing is initialized!", th2, th2, 6);
                }
                ff.c cVar = ((k9.c) abstractC6027b).f37206b;
                if (cVar != null) {
                    AbstractC3029a J10 = GlobalTracer.f33708Z.J(cVar);
                    AbstractC3557B.b0("activateSpan(...)", J10);
                    p pVar = this.f2778i0;
                    try {
                        this.f2775Y = J10;
                        this.f2776Z = 1;
                        Object m02 = L4.a.m0(pVar.f44961e, this);
                        if (m02 == enumC5000a) {
                            return enumC5000a;
                        }
                        abstractC3029a = J10;
                        obj = m02;
                    } catch (Throwable th4) {
                        abstractC3029a = J10;
                        th2 = th4;
                        throw th2;
                    }
                } else {
                    AbstractC3557B.C2("datadogSpan");
                    throw th2;
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        return (nd.h) obj;
    }
}
