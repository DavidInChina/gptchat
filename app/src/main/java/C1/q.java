package c1;

import H0.AbstractC0666a;
import Z.AbstractC1738u;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;

/* loaded from: classes2.dex */
public final class q extends l {

    /* renamed from: E0  reason: collision with root package name */
    public final View f26110E0;

    /* renamed from: F0  reason: collision with root package name */
    public final A0.d f26111F0;

    /* renamed from: G0  reason: collision with root package name */
    public i0.l f26112G0;

    /* renamed from: H0  reason: collision with root package name */
    public wf.k f26113H0;

    /* renamed from: I0  reason: collision with root package name */
    public wf.k f26114I0;

    /* renamed from: J0  reason: collision with root package name */
    public wf.k f26115J0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Context context, wf.k kVar, AbstractC1738u abstractC1738u, i0.m mVar, int i10, Owner owner) {
        super(context, abstractC1738u, i10, r7, r10, owner);
        Object obj;
        View view = (View) kVar.invoke(context);
        A0.d dVar = new A0.d();
        this.f26110E0 = view;
        this.f26111F0 = dVar;
        setClipChildren(false);
        String valueOf = String.valueOf(i10);
        SparseArray<Parcelable> sparseArray = null;
        if (mVar != null) {
            obj = mVar.c(valueOf);
        } else {
            obj = null;
        }
        sparseArray = obj instanceof SparseArray ? (SparseArray) obj : sparseArray;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (mVar != null) {
            setSavableRegistryEntry(mVar.d(valueOf, new p(this, 0)));
        }
        e eVar = e.f26047j0;
        this.f26113H0 = eVar;
        this.f26114I0 = eVar;
        this.f26115J0 = eVar;
    }

    public static final void l(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(i0.l lVar) {
        i0.l lVar2 = this.f26112G0;
        if (lVar2 != null) {
            ((i0.n) lVar2).a();
        }
        this.f26112G0 = lVar;
    }

    public final A0.d getDispatcher() {
        return this.f26111F0;
    }

    public final wf.k getReleaseBlock() {
        return this.f26115J0;
    }

    public final wf.k getResetBlock() {
        return this.f26114I0;
    }

    public /* bridge */ /* synthetic */ AbstractC0666a getSubCompositionView() {
        return null;
    }

    public final wf.k getUpdateBlock() {
        return this.f26113H0;
    }

    public final void setReleaseBlock(wf.k kVar) {
        this.f26115J0 = kVar;
        setRelease(new p(this, 1));
    }

    public final void setResetBlock(wf.k kVar) {
        this.f26114I0 = kVar;
        setReset(new p(this, 2));
    }

    public final void setUpdateBlock(wf.k kVar) {
        this.f26113H0 = kVar;
        setUpdate(new p(this, 3));
    }

    public View getViewRoot() {
        return this;
    }
}
