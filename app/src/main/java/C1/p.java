package c1;

import android.os.Parcelable;
import android.util.SparseArray;
import jf.y;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26108Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f26109Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(0);
        this.f26108Y = i10;
        this.f26109Z = qVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        switch (this.f26108Y) {
            case 0:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f26109Z.f26110E0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                mo122invoke();
                return yVar;
            default:
                mo122invoke();
                return yVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f26108Y;
        q qVar = this.f26109Z;
        switch (i10) {
            case 1:
                qVar.getReleaseBlock().invoke(qVar.f26110E0);
                q.l(qVar);
                return;
            case 2:
                qVar.getResetBlock().invoke(qVar.f26110E0);
                return;
            default:
                qVar.getUpdateBlock().invoke(qVar.f26110E0);
                return;
        }
    }
}
