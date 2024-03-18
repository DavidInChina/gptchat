package E0;

import q0.C5254f;

/* renamed from: E0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452k implements AbstractC0454m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4071a;

    @Override // E0.AbstractC0454m
    public final long a(long j6, long j10) {
        switch (this.f4071a) {
            case 0:
                float max = Math.max(C5254f.d(j10) / C5254f.d(j6), C5254f.b(j10) / C5254f.b(j6));
                return androidx.compose.ui.layout.a.a(max, max);
            case 4:
                float min = Math.min(C5254f.d(j10) / C5254f.d(j6), C5254f.b(j10) / C5254f.b(j6));
                return androidx.compose.ui.layout.a.a(min, min);
            default:
                if (C5254f.d(j6) <= C5254f.d(j10) && C5254f.b(j6) <= C5254f.b(j10)) {
                    return androidx.compose.ui.layout.a.a(1.0f, 1.0f);
                }
                float min2 = Math.min(C5254f.d(j10) / C5254f.d(j6), C5254f.b(j10) / C5254f.b(j6));
                return androidx.compose.ui.layout.a.a(min2, min2);
        }
    }
}
