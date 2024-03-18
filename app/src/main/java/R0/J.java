package r0;

import android.graphics.Shader;
import id.AbstractC3557B;
import q0.C5254f;

/* loaded from: classes2.dex */
public abstract class J extends AbstractC5350n {

    /* renamed from: a  reason: collision with root package name */
    public Shader f44200a;

    /* renamed from: b  reason: collision with root package name */
    public long f44201b = C5254f.f43638c;

    @Override // r0.AbstractC5350n
    public final void a(float f6, long j6, C5342f c5342f) {
        Shader shader = this.f44200a;
        if (shader == null || !C5254f.a(this.f44201b, j6)) {
            if (C5254f.f(j6)) {
                shader = null;
                this.f44200a = null;
                this.f44201b = C5254f.f43638c;
            } else {
                shader = b(j6);
                this.f44200a = shader;
                this.f44201b = j6;
            }
        }
        long b10 = androidx.compose.ui.graphics.a.b(c5342f.f44235a.getColor());
        long j10 = r.f44254b;
        if (!r.c(b10, j10)) {
            c5342f.f(j10);
        }
        if (!AbstractC3557B.K(c5342f.f44237c, shader)) {
            c5342f.i(shader);
        }
        if (c5342f.f44235a.getAlpha() / 255.0f != f6) {
            c5342f.d(f6);
        }
    }

    public abstract Shader b(long j6);
}
