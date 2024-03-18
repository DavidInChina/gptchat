package v7;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
public final class v extends u7.j {

    /* renamed from: b  reason: collision with root package name */
    public final u7.g f47349b;

    public v(u7.g gVar) {
        this.f47349b = gVar;
    }

    public final s7.h b(s7.g gVar) {
        u7.g gVar2 = this.f47349b;
        gVar2.getClass();
        boolean z10 = true;
        if (!gVar.f26820n && !((Boolean) BasePendingResult.f26811o.get()).booleanValue()) {
            z10 = false;
        }
        gVar.f26820n = z10;
        C5987e c5987e = gVar2.f46465j;
        c5987e.getClass();
        C5980A c5980a = new C5980A(new D(gVar), c5987e.f47309n0.get(), gVar2);
        H7.d dVar = c5987e.f47313r0;
        dVar.sendMessage(dVar.obtainMessage(4, c5980a));
        return gVar;
    }
}
