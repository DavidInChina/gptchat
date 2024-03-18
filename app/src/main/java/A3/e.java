package A3;

import android.os.Bundle;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.S;
import id.AbstractC3557B;
import java.util.Map;
import s3.C5564n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f644a;

    /* renamed from: b  reason: collision with root package name */
    public final d f645b = new d();

    /* renamed from: c  reason: collision with root package name */
    public boolean f646c;

    public e(f fVar) {
        this.f644a = fVar;
    }

    public final void a() {
        f fVar = this.f644a;
        S h10 = fVar.h();
        if (h10.f() == EnumC2082q.f25376Z) {
            h10.a(new a(fVar));
            d dVar = this.f645b;
            dVar.getClass();
            if (!dVar.f639b) {
                h10.a(new C5564n(1, dVar));
                dVar.f639b = true;
                this.f646c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f646c) {
            a();
        }
        S h10 = this.f644a.h();
        if (!h10.f().a(EnumC2082q.f25378i0)) {
            d dVar = this.f645b;
            if (dVar.f639b) {
                if (!dVar.f641d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    dVar.f640c = bundle2;
                    dVar.f641d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + h10.f()).toString());
    }

    public final void c(Bundle bundle) {
        AbstractC3557B.c0("outBundle", bundle);
        d dVar = this.f645b;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = dVar.f640c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        s.g gVar = dVar.f638a;
        gVar.getClass();
        s.d dVar2 = new s.d(gVar);
        gVar.f45014h0.put(dVar2, Boolean.FALSE);
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
