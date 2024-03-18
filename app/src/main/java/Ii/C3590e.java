package ii;

import id.AbstractC3557B;
import java.io.IOException;

/* renamed from: ii.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3590e extends Zh.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f33265e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C3591f f33266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3590e(C3591f c3591f) {
        super(R.a.t(new StringBuilder(), c3591f.f33280m, " writer"), true);
        this.f33266f = c3591f;
    }

    @Override // Zh.a
    public final long a() {
        int i10 = this.f33265e;
        C3591f c3591f = this.f33266f;
        switch (i10) {
            case 0:
                try {
                    if (!c3591f.j()) {
                        return -1L;
                    }
                    return 0L;
                } catch (IOException e10) {
                    c3591f.c(e10, null);
                    return -1L;
                }
            default:
                ai.j jVar = c3591f.f33275h;
                AbstractC3557B.Z(jVar);
                jVar.d();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3590e(String str, C3591f c3591f) {
        super(str, true);
        this.f33266f = c3591f;
    }
}
