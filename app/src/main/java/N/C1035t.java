package N;

import id.AbstractC3557B;

/* renamed from: N.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1035t implements AbstractC1038w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12412a;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r6.f12404b == r5.f12404b) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        if (r0.f37645Y == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
        r0 = r13.b().f12400f.f12477a.f12467a.f12512Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r13.l() > 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
        if (r13.c() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if (r0.length() != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r0 = r13.b();
        r4 = r0.f12400f.f12477a.f12467a.f12512Y;
        r7 = r4.length();
        r10 = r0.f12397c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (r10 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
        r4 = A7.b.E0(0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
        if (r13.a() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e2, code lost:
        r13 = N.C1034s.a(r3, R4.b.R(r6, r0, r4), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
        r13 = N.C1034s.a(r3, null, R4.b.R(r5, r0, r4), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
        if (r10 != r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
        r4 = A7.b.F0(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
        if (r13.a() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
        r13 = N.C1034s.a(r3, R4.b.R(r6, r0, r4), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
        r13 = N.C1034s.a(r3, null, R4.b.R(r5, r0, r4), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
        r7 = r13.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011a, code lost:
        if (r7.f12410c != true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
        if ((r13.a() ^ r2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
        r4 = A7.b.F0(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0129, code lost:
        r4 = A7.b.E0(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0131, code lost:
        if (r13.a() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
        r13 = N.C1034s.a(r3, R4.b.R(r6, r0, r4), null, r2, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:
        r13 = N.C1034s.a(r3, null, R4.b.R(r5, r0, r4), r2, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
        r0 = r13;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1034s a(Q q10) {
        r rVar;
        r rVar2;
        r rVar3;
        boolean z10;
        r rVar4;
        r rVar5;
        boolean z11 = true;
        boolean z12 = false;
        switch (this.f12412a) {
            case 0:
                r a5 = q10.j().a(q10.j().f12397c);
                r a10 = q10.g().a(q10.g().f12398d);
                if (q10.h() != 1) {
                    z11 = false;
                }
                return new C1034s(a5, a10, z11);
            case 1:
            default:
                C1034s c10 = q10.c();
                if (c10 == null) {
                    return C1037v.f12439b.a(q10);
                }
                boolean a11 = q10.a();
                r rVar6 = c10.f12409b;
                r rVar7 = c10.f12408a;
                if (a11) {
                    rVar3 = R4.b.C(q10, q10.j(), rVar7);
                    rVar = rVar3;
                    rVar2 = rVar6;
                    rVar6 = rVar7;
                } else {
                    rVar3 = R4.b.C(q10, q10.g(), rVar6);
                    rVar = rVar7;
                    rVar2 = rVar3;
                }
                if (!AbstractC3557B.K(rVar3, rVar6)) {
                    if (q10.h() != 1 && (q10.h() != 3 || rVar.f12404b <= rVar2.f12404b)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    C1034s c1034s = new C1034s(rVar, rVar2, z10);
                    if (rVar.f12405c == rVar2.f12405c) {
                        break;
                    } else {
                        if (z10) {
                            rVar4 = rVar;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (rVar4.f12404b == 0) {
                            if (z10) {
                                rVar5 = rVar2;
                            } else {
                                rVar5 = rVar;
                            }
                            if (q10.d().f12400f.f12477a.f12467a.f12512Y.length() == rVar5.f12404b) {
                                ?? obj = new Object();
                                obj.f37645Y = true;
                                q10.m(new T(obj, 0));
                                break;
                            }
                        }
                        c10 = c1034s;
                    }
                }
                return c10;
            case 2:
                return R4.b.z(q10, C1036u.f12434c);
            case 3:
                return R4.b.z(q10, C1036u.f12433b);
        }
    }
}
