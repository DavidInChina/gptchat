package E2;

import android.os.Bundle;
import c1.AbstractC2279d;
import p2.AbstractC5057j;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class i0 implements AbstractC5057j {

    /* renamed from: i0  reason: collision with root package name */
    public static final i0 f4359i0 = new i0(new p2.h0[0]);

    /* renamed from: j0  reason: collision with root package name */
    public static final String f4360j0 = Integer.toString(0, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f4361Y;

    /* renamed from: Z  reason: collision with root package name */
    public final x8.k0 f4362Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f4363h0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public i0(p2.h0... h0VarArr) {
        this.f4362Z = x8.N.i0(h0VarArr);
        this.f4361Y = h0VarArr.length;
        int i10 = 0;
        while (true) {
            x8.k0 k0Var = this.f4362Z;
            if (i10 < k0Var.size()) {
                int i11 = i10 + 1;
                for (int i12 = i11; i12 < k0Var.size(); i12++) {
                    if (((p2.h0) k0Var.get(i10)).equals(k0Var.get(i12))) {
                        s2.p.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f4360j0, AbstractC2279d.z(this.f4362Z));
        return bundle;
    }

    public final p2.h0 b(int i10) {
        return (p2.h0) this.f4362Z.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f4361Y == i0Var.f4361Y && this.f4362Z.equals(i0Var.f4362Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4363h0 == 0) {
            this.f4363h0 = this.f4362Z.hashCode();
        }
        return this.f4363h0;
    }
}
