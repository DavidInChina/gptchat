package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes2.dex */
public final class T0 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f1185Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1186h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ V0 f1187i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(V0 v02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1187i0 = v02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        T0 t02 = new T0(this.f1187i0, abstractC4825e);
        t02.f1186h0 = obj;
        return t02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((T0) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049 A[EDGE_INSN: B:25:0x0049->B:17:0x0049 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r12.f1185Z
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r12.f1186h0
            B0.N r1 = (B0.N) r1
            com.google.android.gms.internal.play_billing.N.B0(r13)
            goto L2c
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            com.google.android.gms.internal.play_billing.N.B0(r13)
            java.lang.Object r13 = r12.f1186h0
            B0.N r13 = (B0.N) r13
            r1 = r13
        L21:
            r12.f1186h0 = r1
            r12.f1185Z = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.a.a(r1, r12)
            if (r13 != r0) goto L2c
            return r0
        L2c:
            B0.k r13 = (B0.C0194k) r13
            java.util.List r3 = r13.f1652a
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L36:
            if (r6 >= r4) goto L49
            java.lang.Object r7 = r3.get(r6)
            B0.u r7 = (B0.u) r7
            boolean r7 = r7.b()
            r7 = r7 ^ r2
            if (r7 != 0) goto L46
            goto L21
        L46:
            int r6 = r6 + 1
            goto L36
        L49:
            B.V0 r3 = r12.f1187i0
            B.I r4 = r3.f1203v0
            id.AbstractC3557B.Z(r4)
            B0.P r4 = r1.f1614j0
            long r6 = r4.f1623y0
            long r6 = q0.C5251c.f43619b
            q0.c r4 = new q0.c
            r4.<init>(r6)
            java.util.List r13 = r13.f1652a
            int r6 = r13.size()
            r7 = r5
        L62:
            long r8 = r4.f43623a
            if (r7 >= r6) goto L7a
            java.lang.Object r4 = r13.get(r7)
            B0.u r4 = (B0.u) r4
            long r10 = r4.f1679j
            long r8 = q0.C5251c.h(r8, r10)
            q0.c r4 = new q0.c
            r4.<init>(r8)
            int r7 = r7 + 1
            goto L62
        L7a:
            r4 = 64
            float r4 = (float) r4
            float r4 = r1.R(r4)
            float r4 = -r4
            long r6 = q0.C5251c.i(r4, r8)
            Ng.F r4 = r3.p0()
            B.S0 r8 = new B.S0
            B.A1 r3 = r3.f1202u0
            r9 = 0
            r8.<init>(r3, r6, r9)
            r3 = 3
            Ad.l.O0(r4, r9, r9, r8, r3)
            int r3 = r13.size()
        L9a:
            if (r5 >= r3) goto L21
            java.lang.Object r4 = r13.get(r5)
            B0.u r4 = (B0.u) r4
            r4.a()
            int r5 = r5 + 1
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: B.T0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
