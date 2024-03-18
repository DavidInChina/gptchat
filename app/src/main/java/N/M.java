package N;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes.dex */
public final class M extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f12227Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f12228h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f12229i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12229i0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        M m10 = new M(this.f12229i0, abstractC4825e);
        m10.f12228h0 = obj;
        return m10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((M) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r4.f12227Z
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f12228h0
            B0.N r1 = (B0.N) r1
            com.google.android.gms.internal.play_billing.N.B0(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            com.google.android.gms.internal.play_billing.N.B0(r5)
            java.lang.Object r5 = r4.f12228h0
            B0.N r5 = (B0.N) r5
            r1 = r5
        L21:
            B0.l r5 = B0.EnumC0195l.f1656Y
            r4.f12228h0 = r1
            r4.f12227Z = r2
            java.lang.Object r5 = r1.c(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            B0.k r5 = (B0.C0194k) r5
            boolean r5 = r9.y.F0(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            wf.k r3 = r4.f12229i0
            r3.invoke(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: N.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
