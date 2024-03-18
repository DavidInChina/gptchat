package t4;

import android.graphics.drawable.Drawable;
import g4.C3189q;
import q4.k;
import q4.q;

/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final C3189q f45746a;

    /* renamed from: b  reason: collision with root package name */
    public final k f45747b;

    public d(C3189q c3189q, k kVar) {
        this.f45746a = c3189q;
        this.f45747b = kVar;
    }

    @Override // t4.f
    public final void a() {
        k kVar = this.f45747b;
        boolean z10 = kVar instanceof q;
        C3189q c3189q = this.f45746a;
        if (z10) {
            Drawable drawable = ((q) kVar).f43886a;
            c3189q.getClass();
        } else if (kVar instanceof q4.e) {
            kVar.getClass();
            c3189q.getClass();
        }
    }
}
