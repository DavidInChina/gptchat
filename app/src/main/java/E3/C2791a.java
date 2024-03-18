package e3;

import java.util.ArrayList;
import java.util.Arrays;
import x2.AbstractC6266a;

/* renamed from: e3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2791a extends AbstractC6266a {

    /* renamed from: h0  reason: collision with root package name */
    public final long f28798h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f28799i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f28800j0 = new ArrayList();

    public C2791a(int i10, long j6) {
        super(i10, 1);
        this.f28798h0 = j6;
    }

    public final C2791a i(int i10) {
        ArrayList arrayList = this.f28800j0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2791a c2791a = (C2791a) arrayList.get(i11);
            if (c2791a.f48626Z == i10) {
                return c2791a;
            }
        }
        return null;
    }

    public final C2792b j(int i10) {
        ArrayList arrayList = this.f28799i0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2792b c2792b = (C2792b) arrayList.get(i11);
            if (c2792b.f48626Z == i10) {
                return c2792b;
            }
        }
        return null;
    }

    @Override // x2.AbstractC6266a
    public final String toString() {
        return AbstractC6266a.f(this.f48626Z) + " leaves: " + Arrays.toString(this.f28799i0.toArray()) + " containers: " + Arrays.toString(this.f28800j0.toArray());
    }
}
