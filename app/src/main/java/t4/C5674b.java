package t4;

import android.graphics.drawable.Drawable;
import g4.C3189q;
import j4.C3909a;
import q4.k;
import q4.q;
import r4.g;

/* renamed from: t4.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5674b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final C3189q f45742a;

    /* renamed from: b  reason: collision with root package name */
    public final k f45743b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45744c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f45745d;

    public C5674b(C3189q c3189q, k kVar, int i10, boolean z10) {
        this.f45742a = c3189q;
        this.f45743b = kVar;
        this.f45744c = i10;
        this.f45745d = z10;
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    @Override // t4.f
    public final void a() {
        boolean z10;
        this.f45742a.getClass();
        k kVar = this.f45743b;
        Drawable a5 = kVar.a();
        g gVar = kVar.b().f43831C;
        boolean z11 = kVar instanceof q;
        if (z11 && ((q) kVar).f43892g) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z12 = z10;
        new C3909a(a5, gVar, this.f45744c, z12, this.f45745d);
        if (!z11) {
            boolean z13 = kVar instanceof q4.e;
        }
    }
}
