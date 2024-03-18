package androidx.compose.foundation.gestures;

import A.L0;
import B.AbstractC0168u1;
import B.B0;
import B.C0142l1;
import B.C0144m0;
import B.C0145m1;
import B.C0148n1;
import B.M;
import B.N;
import B.W0;
import D.m;
import F0.c;
import F0.i;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final B0 f24692a = new B0(2, null);

    /* renamed from: b  reason: collision with root package name */
    public static final C0145m1 f24693b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final i f24694c = new c(C0144m0.f1417j0);

    /* renamed from: d  reason: collision with root package name */
    public static final C0142l1 f24695d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final C0148n1 f24696e = new Object();

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pf.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:17:0x0041). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(B0.N r5, nf.AbstractC4825e r6) {
        /*
            boolean r0 = r6 instanceof B.C0151o1
            if (r0 == 0) goto L13
            r0 = r6
            B.o1 r0 = (B.C0151o1) r0
            int r1 = r0.f1443h0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1443h0 = r1
            goto L18
        L13:
            B.o1 r0 = new B.o1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1442Z
            of.a r1 = of.EnumC5000a.f41328Y
            int r2 = r0.f1443h0
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            B0.N r5 = r0.f1441Y
            com.google.android.gms.internal.play_billing.N.B0(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.google.android.gms.internal.play_billing.N.B0(r6)
        L34:
            r0.f1441Y = r5
            r0.f1443h0 = r3
            B0.l r6 = B0.EnumC0195l.f1657Z
            java.lang.Object r6 = r5.c(r6, r0)
            if (r6 != r1) goto L41
            goto L4d
        L41:
            B0.k r6 = (B0.C0194k) r6
            int r2 = r6.f1655d
            r4 = 6
            boolean r2 = B0.s.a(r2, r4)
            if (r2 == 0) goto L34
            r1 = r6
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(B0.N, nf.e):java.lang.Object");
    }

    public static final AbstractC4326r b(AbstractC4326r abstractC4326r, AbstractC0168u1 abstractC0168u1, W0 w02, L0 l02, boolean z10, boolean z11, B.L0 l03, m mVar, N n10) {
        return abstractC4326r.g(new ScrollableElement(abstractC0168u1, w02, l02, z10, z11, l03, mVar, n10));
    }

    public static AbstractC4326r c(AbstractC4326r abstractC4326r, AbstractC0168u1 abstractC0168u1, W0 w02, L0 l02, boolean z10, boolean z11, B.L0 l03, m mVar) {
        N.f1135a.getClass();
        return b(abstractC4326r, abstractC0168u1, w02, l02, z10, z11, l03, mVar, M.f1127c);
    }
}
