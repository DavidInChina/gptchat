package mh;

import A.B0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class Q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39429Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4686p f39430Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(C4686p c4686p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39430Z = c4686p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new Q(this.f39430Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r7 == r0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39429Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f39429Y = 1;
            C4686p c4686p = this.f39430Z;
            if (c4686p.k()) {
                obj2 = c4686p.f39497q.a(B0.f16h0, new AbstractC5163j(2, null), this);
            }
            obj2 = yVar;
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
