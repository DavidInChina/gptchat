package Z;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class O0 implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final N0 f22530Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f22531Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f22532h0;

    public O0(int i10, int i11, N0 n02) {
        this.f22530Y = n02;
        this.f22531Z = i10;
        this.f22532h0 = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10;
        ArrayList arrayList;
        int o02;
        N0 n02 = this.f22530Y;
        if (n02.f22526l0 == this.f22532h0) {
            HashMap hashMap = n02.f22528n0;
            C1705d c1705d = null;
            int i11 = this.f22531Z;
            if (hashMap != null) {
                if (!n02.f22525k0) {
                    if (i11 >= 0 && i11 < (i10 = n02.f22521Z) && (o02 = M3.H.o0((arrayList = n02.f22527m0), i11, i10)) >= 0) {
                        c1705d = (C1705d) arrayList.get(o02);
                    }
                    if (c1705d != null) {
                        S s10 = (S) hashMap.get(c1705d);
                    }
                } else {
                    AbstractC1734s.j("use active SlotWriter to crate an anchor for location instead".toString());
                    throw null;
                }
            }
            return new Q(i11 + 1, M3.H.m(n02.f22520Y, i11) + i11, n02);
        }
        throw new ConcurrentModificationException();
    }
}
