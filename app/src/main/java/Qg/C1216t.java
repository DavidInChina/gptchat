package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Qg.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1216t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f14920Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14921Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f14922h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1216t(long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14922h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1216t c1216t = new C1216t(this.f14922h0, abstractC4825e);
        c1216t.f14921Z = obj;
        return c1216t;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((C1216t) create((Pg.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:14:0x003d). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r7.f14920Y
            long r2 = r7.f14922h0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f14921Z
            Pg.A r1 = (Pg.A) r1
            com.google.android.gms.internal.play_billing.N.B0(r8)
            goto L52
        L22:
            java.lang.Object r1 = r7.f14921Z
            Pg.A r1 = (Pg.A) r1
            com.google.android.gms.internal.play_billing.N.B0(r8)
            goto L3d
        L2a:
            com.google.android.gms.internal.play_billing.N.B0(r8)
            java.lang.Object r8 = r7.f14921Z
            r1 = r8
            Pg.A r1 = (Pg.A) r1
            r7.f14921Z = r1
            r7.f14920Y = r6
            java.lang.Object r8 = R4.b.p0(r2, r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            r8 = r1
            Pg.z r8 = (Pg.z) r8
            r8.getClass()
            jf.y r6 = jf.y.f36177a
            r7.f14921Z = r1
            r7.f14920Y = r5
            Pg.o r8 = r8.f14244i0
            java.lang.Object r8 = r8.n(r6, r7)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7.f14921Z = r1
            r7.f14920Y = r4
            java.lang.Object r8 = R4.b.p0(r2, r7)
            if (r8 != r0) goto L3d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Qg.C1216t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
