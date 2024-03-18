package z4;

import Ng.AbstractC1073l0;
import Ng.F;
import jf.y;
import nf.AbstractC4825e;
import pf.AbstractC5163j;

/* renamed from: z4.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6765d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f51597Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f51598Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1073l0 f51599h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f51600i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f51601j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C6770i f51602k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6765d(n nVar, AbstractC1073l0 abstractC1073l0, int i10, int i11, C6770i c6770i, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51598Z = nVar;
        this.f51599h0 = abstractC1073l0;
        this.f51600i0 = i10;
        this.f51601j0 = i11;
        this.f51602k0 = c6770i;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6765d(this.f51598Z, this.f51599h0, this.f51600i0, this.f51601j0, this.f51602k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6765d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:20:0x005c). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r5.f51597Y
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            com.google.android.gms.internal.play_billing.N.B0(r6)
            goto L5c
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            com.google.android.gms.internal.play_billing.N.B0(r6)
        L18:
            int[] r6 = z4.AbstractC6764c.f51596a
            z4.n r1 = r5.f51598Z
            int r1 = r1.ordinal()
            r6 = r6[r1]
            int r1 = r5.f51600i0
            if (r6 != r2) goto L31
            Ng.l0 r6 = r5.f51599h0
            boolean r6 = r6.a()
            if (r6 == 0) goto L2f
            goto L31
        L2f:
            int r1 = r5.f51601j0
        L31:
            r5.f51597Y = r2
            z4.i r6 = r5.f51602k0
            r6.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L48
            z4.f r3 = new z4.f
            r4 = 0
            r3.<init>(r6, r1, r4)
            java.lang.Object r6 = z.AbstractC6696f.z(r3, r5)
            goto L59
        L48:
            z4.f r3 = new z4.f
            r3.<init>(r6, r1, r2)
            nf.k r6 = r5.getContext()
            Z.a0 r6 = kotlin.jvm.internal.m.v(r6)
            java.lang.Object r6 = r6.S(r3, r5)
        L59:
            if (r6 != r0) goto L5c
            return r0
        L5c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L18
            jf.y r6 = jf.y.f36177a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C6765d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
