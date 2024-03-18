package q;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class K0 extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43303a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f43304b;

    public /* synthetic */ K0(int i10, Object obj) {
        this.f43303a = i10;
        this.f43304b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i10 = this.f43303a;
        Object obj = this.f43304b;
        switch (i10) {
            case 0:
                N0 n02 = (N0) obj;
                if (n02.f43320E0.isShowing()) {
                    n02.f();
                    return;
                }
                return;
            default:
                I1.a aVar = (I1.a) obj;
                aVar.f7949Y = true;
                aVar.notifyDataSetChanged();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i10 = this.f43303a;
        Object obj = this.f43304b;
        switch (i10) {
            case 0:
                ((N0) obj).dismiss();
                return;
            default:
                I1.a aVar = (I1.a) obj;
                aVar.f7949Y = false;
                aVar.notifyDataSetInvalidated();
                return;
        }
    }
}
