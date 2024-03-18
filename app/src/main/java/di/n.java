package di;

import java.io.IOException;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class n implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final w f28602Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ t f28603Z;

    public n(t tVar, w wVar) {
        this.f28603Z = tVar;
        this.f28602Y = wVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Throwable th2;
        EnumC2728b enumC2728b;
        t tVar = this.f28603Z;
        w wVar = this.f28602Y;
        EnumC2728b enumC2728b2 = EnumC2728b.INTERNAL_ERROR;
        IOException e10 = null;
        try {
            try {
                wVar.h(this);
                do {
                } while (wVar.a(false, this));
                enumC2728b = EnumC2728b.NO_ERROR;
                try {
                    enumC2728b2 = EnumC2728b.CANCEL;
                    tVar.a(enumC2728b, enumC2728b2, null);
                } catch (IOException e11) {
                    e10 = e11;
                    enumC2728b2 = EnumC2728b.PROTOCOL_ERROR;
                    tVar.a(enumC2728b2, enumC2728b2, e10);
                    Xh.b.c(wVar);
                    return jf.y.f36177a;
                }
            } catch (Throwable th3) {
                th2 = th3;
                tVar.a(enumC2728b, enumC2728b2, e10);
                Xh.b.c(wVar);
                throw th2;
            }
        } catch (IOException e12) {
            e10 = e12;
            enumC2728b = enumC2728b2;
        } catch (Throwable th4) {
            th2 = th4;
            enumC2728b = enumC2728b2;
            tVar.a(enumC2728b, enumC2728b2, e10);
            Xh.b.c(wVar);
            throw th2;
        }
        Xh.b.c(wVar);
        return jf.y.f36177a;
    }
}
