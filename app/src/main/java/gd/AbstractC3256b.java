package gd;

import A.C0053y;
import G2.d;
import L0.u;
import S8.C1368l;
import Z.AbstractC1725n;
import Z.AbstractC1748z;
import Z.C1741v0;
import Z.m1;
import Z.r;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.s;
import wf.n;

/* renamed from: gd.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3256b {

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f31580a = new AbstractC1748z(C3255a.f31579Y);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (r2 == Z.C1723m.f22654Y) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Object[] objArr, n nVar, AbstractC1725n abstractC1725n, int i10) {
        ArrayList arrayList;
        AbstractC3557B.c0("components", objArr);
        AbstractC3557B.c0("content", nVar);
        u uVar = io.sentry.compose.b.f34309a;
        r rVar = (r) abstractC1725n;
        rVar.X(-999670056);
        m1 m1Var = f31580a;
        List list = (List) rVar.m(m1Var);
        d dVar = new d(2);
        dVar.f(list);
        dVar.g(objArr);
        ArrayList arrayList2 = dVar.f5857a;
        Object[] array = arrayList2.toArray(new Object[arrayList2.size()]);
        rVar.W(-568225417);
        boolean z10 = false;
        for (Object obj : array) {
            z10 |= rVar.g(obj);
        }
        Object K10 = rVar.K();
        if (!z10) {
            arrayList = K10;
        }
        AbstractC3557B.c0("<this>", list);
        ArrayList arrayList3 = new ArrayList(list.size() + objArr.length);
        arrayList3.addAll(list);
        s.O1(arrayList3, objArr);
        rVar.h0(arrayList3);
        arrayList = arrayList3;
        rVar.t(false);
        A7.b.k(m1Var.b(arrayList), R4.b.X(rVar, -1539128808, new C1368l(nVar, 11)), rVar, 56);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(objArr, nVar, i10, 20);
        }
    }
}
