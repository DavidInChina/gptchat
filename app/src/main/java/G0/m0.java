package G0;

import b0.C2104h;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2104h f5812a = new C2104h(new androidx.compose.ui.node.a[16]);

    /* renamed from: b  reason: collision with root package name */
    public androidx.compose.ui.node.a[] f5813b;

    public static void a(androidx.compose.ui.node.a aVar) {
        aVar.h();
        int i10 = 0;
        aVar.f24838I0 = false;
        C2104h J10 = aVar.J();
        int i11 = J10.f25569h0;
        if (i11 > 0) {
            Object[] objArr = J10.f25567Y;
            do {
                a((androidx.compose.ui.node.a) objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }
}
