package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2452i extends AbstractC2440c implements Set, j$.util.Set {

    /* renamed from: Z  reason: collision with root package name */
    public transient AbstractC2446f f26928Z;

    public AbstractC2446f T() {
        Object[] array = toArray(AbstractC2440c.f26911Y);
        C2442d c2442d = AbstractC2446f.f26919Z;
        int length = array.length;
        if (length == 0) {
            return C2454j.f26930j0;
        }
        return new C2454j(length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10;
        int i11 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public AbstractC2446f y() {
        AbstractC2446f abstractC2446f = this.f26928Z;
        if (abstractC2446f == null) {
            AbstractC2446f T = T();
            this.f26928Z = T;
            return T;
        }
        return abstractC2446f;
    }
}
