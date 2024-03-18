package q;

import androidx.appcompat.widget.SearchView;

/* renamed from: q.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5199c1 implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43406Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SearchView f43407Z;

    public /* synthetic */ RunnableC5199c1(SearchView searchView, int i10) {
        this.f43406Y = i10;
        this.f43407Z = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43406Y;
        SearchView searchView = this.f43407Z;
        switch (i10) {
            case 0:
                searchView.u();
                return;
            default:
                I1.a aVar = searchView.f24553V0;
                if (aVar instanceof o1) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
