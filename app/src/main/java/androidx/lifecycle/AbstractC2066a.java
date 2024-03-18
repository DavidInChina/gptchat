package androidx.lifecycle;

import android.os.Bundle;
import id.AbstractC3557B;
import l2.C4333d;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2066a extends c0 implements b0 {

    /* renamed from: Y  reason: collision with root package name */
    public A3.d f25350Y;

    /* renamed from: Z  reason: collision with root package name */
    public S f25351Z;

    /* renamed from: h0  reason: collision with root package name */
    public Bundle f25352h0;

    @Override // androidx.lifecycle.c0
    public final void a(Y y10) {
        A3.d dVar = this.f25350Y;
        if (dVar != null) {
            S s10 = this.f25351Z;
            AbstractC3557B.Z(s10);
            S.b(y10, dVar, s10);
        }
    }

    @Override // androidx.lifecycle.b0
    public final Y b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f25351Z != null) {
                A3.d dVar = this.f25350Y;
                AbstractC3557B.Z(dVar);
                S s10 = this.f25351Z;
                AbstractC3557B.Z(s10);
                Q c10 = S.c(dVar, s10, canonicalName, this.f25352h0);
                Y c11 = c(canonicalName, cls, c10.f25323Z);
                c11.d("androidx.lifecycle.savedstate.vm.tag", c10);
                return c11;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public abstract Y c(String str, Class cls, P p10);

    @Override // androidx.lifecycle.b0
    public final Y d(Class cls, C4333d c4333d) {
        String str = (String) c4333d.f37739a.get(Z.f25348Z);
        if (str != null) {
            A3.d dVar = this.f25350Y;
            if (dVar != null) {
                AbstractC3557B.Z(dVar);
                S s10 = this.f25351Z;
                AbstractC3557B.Z(s10);
                Q c10 = S.c(dVar, s10, str, this.f25352h0);
                Y c11 = c(str, cls, c10.f25323Z);
                c11.d("androidx.lifecycle.savedstate.vm.tag", c10);
                return c11;
            }
            return c(str, cls, S.d(c4333d));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
}
