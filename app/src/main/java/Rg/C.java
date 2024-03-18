package Rg;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5156c;
import pf.AbstractC5157d;

/* loaded from: classes2.dex */
public final class C extends AbstractC5156c implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1207j f15511Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4831k f15512Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f15513h0;

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC4831k f15514i0;

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC4825e f15515j0;

    public C(AbstractC1207j abstractC1207j, AbstractC4831k abstractC4831k) {
        super(z.f15594Y, C4832l.f40334Y);
        this.f15511Y = abstractC1207j;
        this.f15512Z = abstractC4831k;
        this.f15513h0 = ((Number) abstractC4831k.fold(0, B.f15510Y)).intValue();
    }

    @Override // Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        try {
            Object p10 = p(abstractC4825e, obj);
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            if (p10 == enumC5000a) {
                N.k0(abstractC4825e);
            }
            if (p10 == enumC5000a) {
                return p10;
            }
            return jf.y.f36177a;
        } catch (Throwable th2) {
            this.f15514i0 = new v(abstractC4825e.getContext(), th2);
            throw th2;
        }
    }

    @Override // pf.AbstractC5154a, pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        AbstractC4825e abstractC4825e = this.f15515j0;
        if (abstractC4825e instanceof AbstractC5157d) {
            return (AbstractC5157d) abstractC4825e;
        }
        return null;
    }

    @Override // pf.AbstractC5156c, nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        AbstractC4831k abstractC4831k = this.f15514i0;
        if (abstractC4831k == null) {
            return C4832l.f40334Y;
        }
        return abstractC4831k;
    }

    @Override // pf.AbstractC5154a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Throwable a5 = C3961k.a(obj);
        if (a5 != null) {
            this.f15514i0 = new v(getContext(), a5);
        }
        AbstractC4825e abstractC4825e = this.f15515j0;
        if (abstractC4825e != null) {
            abstractC4825e.resumeWith(obj);
        }
        return EnumC5000a.f41328Y;
    }

    public final Object p(AbstractC4825e abstractC4825e, Object obj) {
        AbstractC4831k context = abstractC4825e.getContext();
        Ad.l.i0(context);
        AbstractC4831k abstractC4831k = this.f15514i0;
        if (abstractC4831k != context) {
            if (!(abstractC4831k instanceof v)) {
                if (((Number) context.fold(0, new Jb.c(21, this))).intValue() == this.f15513h0) {
                    this.f15514i0 = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f15512Z + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(Bi.c.M1("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((v) abstractC4831k).f15588Y + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f15515j0 = abstractC4825e;
        wf.o oVar = E.f15517a;
        AbstractC1207j abstractC1207j = this.f15511Y;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>", abstractC1207j);
        Object invoke = oVar.invoke(abstractC1207j, obj, this);
        if (!AbstractC3557B.K(invoke, EnumC5000a.f41328Y)) {
            this.f15515j0 = null;
        }
        return invoke;
    }

    @Override // pf.AbstractC5156c, pf.AbstractC5154a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
