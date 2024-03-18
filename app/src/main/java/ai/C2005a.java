package ai;

import Wh.D;
import Wh.t;
import Wh.w;
import id.AbstractC3557B;
import java.io.IOException;

/* renamed from: ai.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2005a implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final C2005a f24217a = new Object();

    @Override // Wh.t
    public final D a(bi.f fVar) {
        j jVar = fVar.f26024a;
        jVar.getClass();
        synchronized (jVar) {
            try {
                if (jVar.f24269t0) {
                    if (!jVar.f24268s0) {
                        if (!(!jVar.f24267r0)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("released".toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f fVar2 = jVar.f24263n0;
        AbstractC3557B.Z(fVar2);
        w wVar = jVar.f24255Y;
        AbstractC3557B.c0("client", wVar);
        try {
            e eVar = new e(jVar, jVar.f24259j0, fVar2, fVar2.a(fVar.f26029f, fVar.f26030g, fVar.f26031h, wVar.f21299F0, wVar.f21307k0, !AbstractC3557B.K(fVar.f26028e.f21337b, "GET")).k(wVar, fVar));
            jVar.f24266q0 = eVar;
            jVar.f24271v0 = eVar;
            synchronized (jVar) {
                jVar.f24267r0 = true;
                jVar.f24268s0 = true;
            }
            if (!jVar.f24270u0) {
                return bi.f.a(fVar, 0, eVar, null, 61).b(fVar.f26028e);
            }
            throw new IOException("Canceled");
        } catch (o e10) {
            fVar2.c(e10.f24300Z);
            throw e10;
        } catch (IOException e11) {
            fVar2.c(e11);
            throw new o(e11);
        }
    }
}
