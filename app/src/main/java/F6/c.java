package F6;

import M3.H;
import java.util.ArrayList;
import p5.AbstractC5091c;
import r5.AbstractC5368c;
import r5.d;

/* loaded from: classes.dex */
public final class c implements U6.a {

    /* renamed from: Y  reason: collision with root package name */
    public final d f5058Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G6.a f5059Z;

    /* renamed from: h0  reason: collision with root package name */
    public final U5.a f5060h0;

    /* renamed from: i0  reason: collision with root package name */
    public final J6.a f5061i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC5091c f5062j0;

    public c(d dVar, G6.a aVar, G6.b bVar, G6.c cVar, AbstractC5091c abstractC5091c) {
        this.f5058Y = dVar;
        this.f5059Z = aVar;
        this.f5060h0 = bVar;
        this.f5061i0 = cVar;
        this.f5062j0 = abstractC5091c;
    }

    @Override // U6.a
    public final void L0(ArrayList arrayList) {
        AbstractC5368c h10 = this.f5058Y.h("tracing");
        if (h10 != null) {
            H.B0(h10, new androidx.compose.foundation.layout.c(arrayList, 12, this));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
