package A;

import nf.AbstractC4825e;
import pf.AbstractC5161h;

/* renamed from: A.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0020h extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f208Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f209h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0026k f210i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020h(C0026k c0026k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f210i0 = c0026k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0020h c0020h = new C0020h(this.f210i0, abstractC4825e);
        c0020h.f209h0 = obj;
        return c0020h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0020h) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0057 -> B:17:0x005a). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            of.a r0 = of.EnumC5000a.f41328Y
            int r1 = r13.f208Z
            r2 = 2
            r3 = 1
            A.k r4 = r13.f210i0
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r13.f209h0
            B0.N r1 = (B0.N) r1
            com.google.android.gms.internal.play_billing.N.B0(r14)
            goto L5a
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            java.lang.Object r1 = r13.f209h0
            B0.N r1 = (B0.N) r1
            com.google.android.gms.internal.play_billing.N.B0(r14)
            goto L39
        L26:
            com.google.android.gms.internal.play_billing.N.B0(r14)
            java.lang.Object r14 = r13.f209h0
            r1 = r14
            B0.N r1 = (B0.N) r1
            r13.f209h0 = r1
            r13.f208Z = r3
            java.lang.Object r14 = B.Z1.c(r1, r13, r2)
            if (r14 != r0) goto L39
            return r0
        L39:
            B0.u r14 = (B0.u) r14
            long r5 = r14.f1670a
            B0.t r7 = new B0.t
            r7.<init>(r5)
            r4.f242q = r7
            q0.c r5 = new q0.c
            long r6 = r14.f1672c
            r5.<init>(r6)
            r4.f227b = r5
        L4d:
            r13.f209h0 = r1
            r13.f208Z = r2
            B0.l r14 = B0.EnumC0195l.f1657Z
            java.lang.Object r14 = r1.c(r14, r13)
            if (r14 != r0) goto L5a
            return r0
        L5a:
            B0.k r14 = (B0.C0194k) r14
            java.util.List r14 = r14.f1652a
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r14.size()
            r5.<init>(r6)
            int r6 = r14.size()
            r7 = 0
            r8 = r7
        L6d:
            if (r8 >= r6) goto L80
            java.lang.Object r9 = r14.get(r8)
            r10 = r9
            B0.u r10 = (B0.u) r10
            boolean r10 = r10.f1673d
            if (r10 == 0) goto L7d
            r5.add(r9)
        L7d:
            int r8 = r8 + 1
            goto L6d
        L80:
            int r14 = r5.size()
        L84:
            r6 = 0
            if (r7 >= r14) goto La0
            java.lang.Object r8 = r5.get(r7)
            r9 = r8
            B0.u r9 = (B0.u) r9
            long r9 = r9.f1670a
            B0.t r11 = r4.f242q
            boolean r12 = r11 instanceof B0.t
            if (r12 != 0) goto L97
            goto L9d
        L97:
            long r11 = r11.f1669a
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto La1
        L9d:
            int r7 = r7 + 1
            goto L84
        La0:
            r8 = r6
        La1:
            B0.u r8 = (B0.u) r8
            if (r8 != 0) goto Lac
            java.lang.Object r14 = kf.t.h2(r5)
            r8 = r14
            B0.u r8 = (B0.u) r8
        Lac:
            if (r8 == 0) goto Lc0
            B0.t r14 = new B0.t
            long r9 = r8.f1670a
            r14.<init>(r9)
            r4.f242q = r14
            q0.c r14 = new q0.c
            long r7 = r8.f1672c
            r14.<init>(r7)
            r4.f227b = r14
        Lc0:
            boolean r14 = r5.isEmpty()
            r14 = r14 ^ r3
            if (r14 != 0) goto L4d
            r4.f242q = r6
            jf.y r14 = jf.y.f36177a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0020h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
