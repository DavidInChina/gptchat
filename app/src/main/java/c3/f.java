package C3;

import android.content.Context;
import id.AbstractC3557B;
import jf.C3963m;

/* loaded from: classes2.dex */
public final class f implements B3.f {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f2658Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f2659Z;

    /* renamed from: h0  reason: collision with root package name */
    public final B3.c f2660h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f2661i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f2662j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C3963m f2663k0 = R4.b.D1(new X0.b(10, this));

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2664l0;

    public f(Context context, String str, B3.c cVar, boolean z10, boolean z11) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("callback", cVar);
        this.f2658Y = context;
        this.f2659Z = str;
        this.f2660h0 = cVar;
        this.f2661i0 = z10;
        this.f2662j0 = z11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3963m c3963m = this.f2663k0;
        if (c3963m.isInitialized()) {
            ((e) c3963m.getValue()).close();
        }
    }

    @Override // B3.f
    public final B3.b getWritableDatabase() {
        return ((e) this.f2663k0.getValue()).a(true);
    }

    @Override // B3.f
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        C3963m c3963m = this.f2663k0;
        if (c3963m.isInitialized()) {
            e eVar = (e) c3963m.getValue();
            AbstractC3557B.c0("sQLiteOpenHelper", eVar);
            eVar.setWriteAheadLoggingEnabled(z10);
        }
        this.f2664l0 = z10;
    }
}
