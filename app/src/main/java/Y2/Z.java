package y2;

import E2.C0492y;
import android.util.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50507Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U3.c f50508Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Pair f50509h0;

    public /* synthetic */ Z(U3.c cVar, Pair pair, int i10) {
        this.f50507Y = i10;
        this.f50508Z = cVar;
        this.f50509h0 = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f50507Y;
        Pair pair = this.f50509h0;
        U3.c cVar = this.f50508Z;
        switch (i10) {
            case 0:
                ((z2.w) ((c0) cVar.f17397h0).f50530h).E(((Integer) pair.first).intValue(), (C0492y) pair.second);
                return;
            case 1:
                ((z2.w) ((c0) cVar.f17397h0).f50530h).e(((Integer) pair.first).intValue(), (C0492y) pair.second);
                return;
            case 2:
                ((z2.w) ((c0) cVar.f17397h0).f50530h).g(((Integer) pair.first).intValue(), (C0492y) pair.second);
                return;
            default:
                ((z2.w) ((c0) cVar.f17397h0).f50530h).s(((Integer) pair.first).intValue(), (C0492y) pair.second);
                return;
        }
    }
}
