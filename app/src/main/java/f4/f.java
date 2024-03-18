package f4;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import fi.C3100a;
import i4.C3468a;
import id.AbstractC3557B;
import java.io.File;
import ji.C4113B;
import o4.C4915a;
import o4.C4916b;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import uf.AbstractC5917j;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29599Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ h f29600Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i10) {
        super(0);
        this.f29599Y = i10;
        this.f29600Z = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        o4.k kVar;
        o4.l lVar;
        int i10;
        int i11;
        i4.n nVar;
        switch (this.f29599Y) {
            case 0:
                Context context = this.f29600Z.f29602a;
                C4916b c4916b = new C4916b(context);
                if (c4916b.f40579c) {
                    kVar = new o4.k();
                } else {
                    kVar = new Object();
                }
                if (c4916b.f40578b) {
                    double d10 = c4916b.f40577a;
                    if (d10 > 0.0d) {
                        Bitmap.Config[] configArr = u4.e.f46388a;
                        try {
                            Object obj = AbstractC5042g.f41723a;
                            Object b10 = AbstractC5039d.b(context, ActivityManager.class);
                            AbstractC3557B.Z(b10);
                            ActivityManager activityManager = (ActivityManager) b10;
                            if ((context.getApplicationInfo().flags & 1048576) != 0) {
                                i11 = activityManager.getLargeMemoryClass();
                            } else {
                                i11 = activityManager.getMemoryClass();
                            }
                        } catch (Exception unused) {
                            i11 = 256;
                        }
                        double d11 = d10 * i11;
                        double d12 = 1024;
                        i10 = (int) (d11 * d12 * d12);
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        lVar = new o4.i(i10, kVar);
                    } else {
                        lVar = new C4915a(kVar);
                    }
                } else {
                    lVar = new C4915a(kVar);
                }
                return new o4.f(lVar, kVar);
            default:
                u4.j jVar = u4.j.f46403Y;
                Context context2 = this.f29600Z.f29602a;
                synchronized (jVar) {
                    nVar = u4.j.f46404Z;
                    if (nVar == null) {
                        C3468a c3468a = new C3468a();
                        File a02 = AbstractC5917j.a0(u4.e.c(context2), "image_cache");
                        String str = C4113B.f36660Z;
                        c3468a.f32659a = C3100a.g(a02);
                        nVar = c3468a.a();
                        u4.j.f46404Z = nVar;
                    }
                }
                return nVar;
        }
    }
}
