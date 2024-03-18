package f3;

import L2.r;
import android.text.TextUtils;
import java.io.EOFException;
import s2.u;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f29548a;

    /* renamed from: b  reason: collision with root package name */
    public int f29549b;

    /* renamed from: c  reason: collision with root package name */
    public int f29550c;

    /* renamed from: d  reason: collision with root package name */
    public Object f29551d;

    /* renamed from: e  reason: collision with root package name */
    public Object f29552e;

    /* JADX WARN: Type inference failed for: r0v4, types: [j.j, java.lang.Object] */
    public final j.j a() {
        boolean z10;
        if (!TextUtils.isEmpty((String) this.f29551d) || !TextUtils.isEmpty(null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isEmpty = true ^ TextUtils.isEmpty((String) this.f29552e);
        if (z10 && isEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!this.f29548a && !z10 && !isEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        ?? obj = new Object();
        obj.f35819h0 = (String) this.f29551d;
        obj.f35817Y = this.f29549b;
        obj.f35818Z = this.f29550c;
        obj.f35820i0 = (String) this.f29552e;
        return obj;
    }

    public final int b(int i10) {
        int i11;
        int i12 = 0;
        this.f29550c = 0;
        do {
            int i13 = this.f29550c;
            int i14 = i10 + i13;
            Object obj = this.f29551d;
            if (i14 >= ((g) obj).f29555c) {
                break;
            }
            int[] iArr = ((g) obj).f29558f;
            this.f29550c = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean c(r rVar) {
        boolean z10;
        boolean z11;
        int i10;
        if (rVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        if (this.f29548a) {
            this.f29548a = false;
            ((u) this.f29552e).C(0);
        }
        while (!this.f29548a) {
            if (this.f29549b < 0) {
                if (((g) this.f29551d).b(rVar, -1L) && ((g) this.f29551d).a(rVar, true)) {
                    g gVar = (g) this.f29551d;
                    int i11 = gVar.f29556d;
                    if ((gVar.f29553a & 1) == 1 && ((u) this.f29552e).f45195c == 0) {
                        i11 += b(0);
                        i10 = this.f29550c;
                    } else {
                        i10 = 0;
                    }
                    try {
                        rVar.l(i11);
                        this.f29549b = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int b10 = b(this.f29549b);
            int i12 = this.f29549b + this.f29550c;
            if (b10 > 0) {
                u uVar = (u) this.f29552e;
                uVar.b(uVar.f45195c + b10);
                u uVar2 = (u) this.f29552e;
                try {
                    rVar.readFully(uVar2.f45193a, uVar2.f45195c, b10);
                    u uVar3 = (u) this.f29552e;
                    uVar3.E(uVar3.f45195c + b10);
                    if (((g) this.f29551d).f29558f[i12 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f29548a = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == ((g) this.f29551d).f29555c) {
                i12 = -1;
            }
            this.f29549b = i12;
        }
        return true;
    }
}
