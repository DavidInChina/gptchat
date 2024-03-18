package H2;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import x8.j0;

/* loaded from: classes2.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f7290a;

    public k(p pVar) {
        this.f7290a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f7290a;
        j0 j0Var = p.f7318i;
        pVar.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f7290a;
        j0 j0Var = p.f7318i;
        pVar.g();
    }
}
