package z;

import Z.AbstractC1710f0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6674N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.y f51171Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f51172Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f51173h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f51174i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C6676P f51175j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6674N(AbstractC1710f0 abstractC1710f0, C6676P c6676p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51174i0 = abstractC1710f0;
        this.f51175j0 = c6676p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6674N c6674n = new C6674N(this.f51174i0, this.f51175j0, abstractC4825e);
        c6674n.f51173h0 = obj;
        return c6674n;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((C6674N) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r5v2, types: [pf.j, wf.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0059 -> B:11:0x003a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:11:0x003a). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r11.f51172Z
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L17
            kotlin.jvm.internal.y r1 = r11.f51171Y
            java.lang.Object r4 = r11.f51173h0
            Ng.F r4 = (Ng.F) r4
            com.google.android.gms.internal.play_billing.N.B0(r12)
            r12 = r4
            goto L3a
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            kotlin.jvm.internal.y r1 = r11.f51171Y
            java.lang.Object r4 = r11.f51173h0
            Ng.F r4 = (Ng.F) r4
            com.google.android.gms.internal.play_billing.N.B0(r12)
            r12 = r4
            goto L54
        L2a:
            com.google.android.gms.internal.play_billing.N.B0(r12)
            java.lang.Object r12 = r11.f51173h0
            Ng.F r12 = (Ng.F) r12
            kotlin.jvm.internal.y r1 = new kotlin.jvm.internal.y
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f37646Y = r4
        L3a:
            z.a r4 = new z.a
            r10 = 1
            Z.f0 r6 = r11.f51174i0
            z.P r7 = r11.f51175j0
            r5 = r4
            r8 = r1
            r9 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f51173h0 = r12
            r11.f51171Y = r1
            r11.f51172Z = r2
            java.lang.Object r4 = z.AbstractC6696f.z(r4, r11)
            if (r4 != r0) goto L54
            return r0
        L54:
            float r4 = r1.f37646Y
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3a
            z.L r4 = new z.L
            r5 = 0
            r4.<init>(r5, r12)
            Qg.l r4 = nf.AbstractC4828h.o0(r4)
            z.M r5 = new z.M
            r6 = 0
            r5.<init>(r3, r6)
            r11.f51173h0 = r12
            r11.f51171Y = r1
            r11.f51172Z = r3
            java.lang.Object r4 = L4.a.n0(r4, r5, r11)
            if (r4 != r0) goto L3a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C6674N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
