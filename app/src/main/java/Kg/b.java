package Kg;

import id.AbstractC3557B;
import java.util.Iterator;
import kf.z;

/* loaded from: classes2.dex */
public final class b implements k, c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9812a;

    /* renamed from: b  reason: collision with root package name */
    public final k f9813b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9814c;

    public b(k kVar, int i10, int i11) {
        this.f9812a = i11;
        if (i11 != 1) {
            AbstractC3557B.c0("sequence", kVar);
            this.f9813b = kVar;
            this.f9814c = i10;
            if (i10 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
        AbstractC3557B.c0("sequence", kVar);
        this.f9813b = kVar;
        this.f9814c = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // Kg.c
    public final k a(int i10) {
        int i11 = this.f9812a;
        k kVar = this.f9813b;
        int i12 = this.f9814c;
        switch (i11) {
            case 0:
                int i13 = i12 + i10;
                if (i13 < 0) {
                    return new b(this, i10, 1);
                }
                return new r(kVar, i12, i13);
            default:
                if (i10 >= i12) {
                    return this;
                }
                return new b(kVar, i10, 1);
        }
    }

    @Override // Kg.c
    public final k b(int i10) {
        int i11 = this.f9812a;
        k kVar = this.f9813b;
        int i12 = this.f9814c;
        switch (i11) {
            case 0:
                int i13 = i12 + i10;
                if (i13 < 0) {
                    return new b(this, i10, 0);
                }
                return new b(kVar, i13, 0);
            default:
                if (i10 >= i12) {
                    return d.f9815a;
                }
                return new r(kVar, i10, i12);
        }
    }

    @Override // Kg.k
    public final Iterator iterator() {
        switch (this.f9812a) {
            case 0:
                return new z(this);
            default:
                return new z(this, 0);
        }
    }
}
