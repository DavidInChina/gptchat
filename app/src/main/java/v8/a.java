package V8;

import B0.N;
import B0.u;
import jf.y;
import nf.AbstractC4825e;
import pf.AbstractC5161h;
import wf.n;

/* loaded from: classes2.dex */
public final class a extends AbstractC5161h implements n {

    /* renamed from: Z  reason: collision with root package name */
    public long f18438Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f18439h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f18440i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ u f18441j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u uVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18441j0 = uVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        a aVar = new a(this.f18441j0, abstractC4825e);
        aVar.f18440i0 = obj;
        return aVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((N) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r7.f18439h0
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f18438Z
            java.lang.Object r1 = r7.f18440i0
            B0.N r1 = (B0.N) r1
            com.google.android.gms.internal.play_billing.N.B0(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            com.google.android.gms.internal.play_billing.N.B0(r8)
            java.lang.Object r8 = r7.f18440i0
            B0.N r8 = (B0.N) r8
            B0.u r1 = r7.f18441j0
            long r3 = r1.f1671b
            H0.Y0 r1 = r8.e()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f18440i0 = r1
            r7.f18438Z = r3
            r7.f18439h0 = r2
            r8 = 3
            java.lang.Object r8 = B.Z1.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            B0.u r8 = (B0.u) r8
            long r5 = r8.f1671b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V8.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
