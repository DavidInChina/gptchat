package Lg;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jf.C3959i;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class b implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public int f11135Y = -1;

    /* renamed from: Z  reason: collision with root package name */
    public int f11136Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f11137h0;

    /* renamed from: i0  reason: collision with root package name */
    public Cf.g f11138i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11139j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ c f11140k0;

    public b(c cVar) {
        this.f11140k0 = cVar;
        int p10 = N.p(cVar.f11142b, 0, cVar.f11141a.length());
        this.f11136Z = p10;
        this.f11137h0 = p10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r6 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [Cf.g, Cf.e] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Cf.g, Cf.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i10 = this.f11137h0;
        int i11 = 0;
        if (i10 < 0) {
            this.f11135Y = 0;
            this.f11138i0 = null;
            return;
        }
        c cVar = this.f11140k0;
        int i12 = cVar.f11143c;
        if (i12 > 0) {
            int i13 = this.f11139j0 + 1;
            this.f11139j0 = i13;
        }
        if (i10 <= cVar.f11141a.length()) {
            C3959i c3959i = (C3959i) cVar.f11144d.invoke(cVar.f11141a, Integer.valueOf(this.f11137h0));
            if (c3959i == null) {
                this.f11138i0 = new Cf.e(this.f11136Z, n.g2(cVar.f11141a), 1);
                this.f11137h0 = -1;
            } else {
                int intValue = ((Number) c3959i.f36155Y).intValue();
                int intValue2 = ((Number) c3959i.f36156Z).intValue();
                this.f11138i0 = N.D0(this.f11136Z, intValue);
                int i14 = intValue + intValue2;
                this.f11136Z = i14;
                if (intValue2 == 0) {
                    i11 = 1;
                }
                this.f11137h0 = i14 + i11;
            }
            this.f11135Y = 1;
        }
        this.f11138i0 = new Cf.e(this.f11136Z, n.g2(cVar.f11141a), 1);
        this.f11137h0 = -1;
        this.f11135Y = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11135Y == -1) {
            a();
        }
        if (this.f11135Y == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11135Y == -1) {
            a();
        }
        if (this.f11135Y != 0) {
            Cf.g gVar = this.f11138i0;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.ranges.IntRange", gVar);
            this.f11138i0 = null;
            this.f11135Y = -1;
            return gVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
