package androidx.lifecycle;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import id.AbstractC3557B;
import java.io.Closeable;
import nf.AbstractC4831k;

/* renamed from: androidx.lifecycle.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2071f implements Closeable, Ng.F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25363Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4831k f25364Z;

    public C2071f(AbstractC4831k abstractC4831k, int i10) {
        this.f25363Y = i10;
        if (i10 != 1) {
            this.f25364Z = abstractC4831k;
            return;
        }
        AbstractC3557B.c0("context", abstractC4831k);
        this.f25364Z = abstractC4831k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1071k0 c1071k0 = C1071k0.f12951Y;
        int i10 = this.f25363Y;
        AbstractC4831k abstractC4831k = this.f25364Z;
        switch (i10) {
            case 0:
                AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) abstractC4831k.get(c1071k0);
                if (abstractC1073l0 != null) {
                    abstractC1073l0.k(null);
                    return;
                }
                return;
            default:
                AbstractC1073l0 abstractC1073l02 = (AbstractC1073l0) abstractC4831k.get(c1071k0);
                if (abstractC1073l02 != null) {
                    abstractC1073l02.k(null);
                    return;
                }
                return;
        }
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f25364Z;
    }
}
