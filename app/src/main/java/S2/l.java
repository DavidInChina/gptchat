package s2;

import E2.C0492y;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import u3.AbstractC5830c;
import u3.C5828a;
import y2.c0;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45165Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f45166Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f45167h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f45168i0;

    public /* synthetic */ l(Object obj, int i10, Object obj2, int i11) {
        this.f45165Y = i11;
        this.f45167h0 = obj;
        this.f45166Z = i10;
        this.f45168i0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f45165Y;
        Object obj = this.f45168i0;
        int i11 = this.f45166Z;
        Object obj2 = this.f45167h0;
        switch (i10) {
            case 0:
                m mVar = (m) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    if (!oVar.f45172d) {
                        if (i11 != -1) {
                            oVar.f45170b.a(i11);
                        }
                        oVar.f45171c = true;
                        mVar.invoke(oVar.f45169a);
                    }
                }
                return;
            case 1:
                Pair pair = (Pair) obj;
                ((z2.w) ((c0) ((U3.c) obj2).f17397h0).f50530h).d(((Integer) pair.first).intValue(), (C0492y) pair.second, i11);
                return;
            case 2:
                B2.n nVar = (B2.n) obj2;
                B2.o oVar2 = (B2.o) obj;
                int i12 = nVar.f1813a;
                oVar2.getClass();
                oVar2.d(i12, nVar.f1814b, i11);
                return;
            case 3:
                ((C5828a) obj2).f46345b.h(i11, obj);
                return;
            default:
                ((AbstractC5830c) obj2).h(i11, obj);
                return;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, int i10, int i11) {
        this.f45165Y = i11;
        this.f45167h0 = obj;
        this.f45168i0 = obj2;
        this.f45166Z = i10;
    }
}
