package H0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Y implements ComponentCallbacks2 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Configuration f6885Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K0.d f6886Z;

    public Y(Configuration configuration, K0.d dVar) {
        this.f6885Y = configuration;
        this.f6886Z = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f6885Y;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f6886Z.f9323a.entrySet().iterator();
        while (it.hasNext()) {
            K0.b bVar = (K0.b) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (bVar == null || Configuration.needNewResources(updateFrom, bVar.f9320b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6886Z.f9323a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f6886Z.f9323a.clear();
    }
}
