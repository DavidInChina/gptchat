package M1;

import nf.AbstractC4825e;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public wf.n f11447Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11448Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ U3.n f11449h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(U3.n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11449h0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new m(this.f11449h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:18:0x0054). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r6.f11448Z
            r2 = 2
            r3 = 1
            U3.n r4 = r6.f11449h0
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            com.google.android.gms.internal.play_billing.N.B0(r7)
            goto L54
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            wf.n r1 = r6.f11447Y
            com.google.android.gms.internal.play_billing.N.B0(r7)
            goto L48
        L20:
            com.google.android.gms.internal.play_billing.N.B0(r7)
            java.lang.Object r7 = r4.f17429i0
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L61
        L2d:
            java.lang.Object r7 = r4.f17426Y
            Ng.F r7 = (Ng.F) r7
            Ad.l.h0(r7)
            java.lang.Object r7 = r4.f17427Z
            r1 = r7
            wf.n r1 = (wf.n) r1
            java.lang.Object r7 = r4.f17428h0
            Pg.o r7 = (Pg.o) r7
            r6.f11447Y = r1
            r6.f11448Z = r3
            java.lang.Object r7 = r7.g(r6)
            if (r7 != r0) goto L48
            return r0
        L48:
            r5 = 0
            r6.f11447Y = r5
            r6.f11448Z = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            java.lang.Object r7 = r4.f17429i0
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            jf.y r7 = jf.y.f36177a
            return r7
        L61:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
