package q;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes2.dex */
public final /* synthetic */ class t1 implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43555Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Toolbar f43556Z;

    public /* synthetic */ t1(Toolbar toolbar, int i10) {
        this.f43555Y = i10;
        this.f43556Z = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.q qVar;
        int i10 = this.f43555Y;
        Toolbar toolbar = this.f43556Z;
        switch (i10) {
            case 0:
                v1 v1Var = toolbar.f24592S0;
                if (v1Var == null) {
                    qVar = null;
                } else {
                    qVar = v1Var.f43571Z;
                }
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.o();
                return;
        }
    }
}
