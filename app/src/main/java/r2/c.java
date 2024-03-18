package r2;

import android.os.Bundle;
import c1.AbstractC2279d;
import java.util.Arrays;
import java.util.List;
import l8.AbstractC4344b;
import p2.AbstractC5057j;
import r.f;
import s2.AbstractC5530A;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes.dex */
public final class c implements AbstractC5057j {

    /* renamed from: h0  reason: collision with root package name */
    public static final String f44372h0 = Integer.toString(0, 36);

    /* renamed from: i0  reason: collision with root package name */
    public static final String f44373i0 = Integer.toString(1, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final N f44374Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f44375Z;

    static {
        L l10 = N.f49523Z;
        new c(0L, k0.f49573j0);
        int i10 = AbstractC5530A.f45131a;
    }

    public c(long j6, List list) {
        this.f44374Y = N.V(list);
        this.f44375Z = j6;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        L l10 = N.f49523Z;
        AbstractC4344b.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            N n10 = this.f44374Y;
            if (i10 < n10.size()) {
                if (((b) n10.get(i10)).f44358i0 == null) {
                    b bVar = (b) n10.get(i10);
                    bVar.getClass();
                    int i12 = i11 + 1;
                    if (objArr.length < i12) {
                        objArr = Arrays.copyOf(objArr, f.x(objArr.length, i12));
                    } else {
                        if (z10) {
                            objArr = (Object[]) objArr.clone();
                        }
                        objArr[i11] = bVar;
                        i11++;
                    }
                    z10 = false;
                    objArr[i11] = bVar;
                    i11++;
                }
                i10++;
            } else {
                bundle.putParcelableArrayList(f44372h0, AbstractC2279d.z(N.T(i11, objArr)));
                bundle.putLong(f44373i0, this.f44375Z);
                return bundle;
            }
        }
    }
}
