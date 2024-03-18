package y2;

import E2.C0484p;
import E2.C0488u;
import E2.C0492y;
import android.util.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class X implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50495Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U3.c f50496Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Pair f50497h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0484p f50498i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C0488u f50499j0;

    public /* synthetic */ X(U3.c cVar, Pair pair, C0484p c0484p, C0488u c0488u, int i10) {
        this.f50495Y = i10;
        this.f50496Z = cVar;
        this.f50497h0 = pair;
        this.f50498i0 = c0484p;
        this.f50499j0 = c0488u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f50495Y;
        C0488u c0488u = this.f50499j0;
        C0484p c0484p = this.f50498i0;
        Pair pair = this.f50497h0;
        U3.c cVar = this.f50496Z;
        switch (i10) {
            case 0:
                ((z2.w) ((c0) cVar.f17397h0).f50530h).o(((Integer) pair.first).intValue(), (C0492y) pair.second, c0484p, c0488u);
                return;
            case 1:
                ((z2.w) ((c0) cVar.f17397h0).f50530h).F(((Integer) pair.first).intValue(), (C0492y) pair.second, c0484p, c0488u);
                return;
            default:
                ((z2.w) ((c0) cVar.f17397h0).f50530h).D(((Integer) pair.first).intValue(), (C0492y) pair.second, c0484p, c0488u);
                return;
        }
    }
}
