package S1;

import android.widget.EditText;
import e3.C2792b;
import p2.C5065s;
import s2.AbstractC5530A;
import s2.p;
import s2.u;

/* loaded from: classes2.dex */
public final class b implements e3.d {

    /* renamed from: a  reason: collision with root package name */
    public final int f16064a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16065b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16066c;

    public b(byte[] bArr) {
        int length = bArr.length;
        if (length >= 0) {
            if (length <= bArr.length) {
                this.f16066c = bArr;
                this.f16064a = 0;
                this.f16065b = length;
                return;
            }
            throw new IllegalArgumentException("end > bytes.length");
        }
        throw new IllegalArgumentException("end < start");
    }

    @Override // e3.d
    public final int a() {
        return this.f16064a;
    }

    @Override // e3.d
    public final int b() {
        return this.f16065b;
    }

    @Override // e3.d
    public final int c() {
        int i10 = this.f16064a;
        if (i10 == -1) {
            return ((u) this.f16066c).x();
        }
        return i10;
    }

    public b(EditText editText) {
        this.f16064a = Integer.MAX_VALUE;
        this.f16065b = 0;
        R4.b.U(editText, "editText cannot be null");
        this.f16066c = new a(editText);
    }

    public b() {
        this.f16066c = new b[256];
        this.f16064a = 0;
        this.f16065b = 0;
    }

    public b(int i10, int i11) {
        this.f16066c = null;
        this.f16064a = i10;
        int i12 = i11 & 7;
        this.f16065b = i12 == 0 ? 8 : i12;
    }

    public b(C2792b c2792b, C5065s c5065s) {
        u uVar = c2792b.f28801h0;
        this.f16066c = uVar;
        uVar.F(12);
        int x10 = uVar.x();
        if ("audio/raw".equals(c5065s.f42319q0)) {
            int u10 = AbstractC5530A.u(c5065s.f42299F0, c5065s.f42297D0);
            if (x10 == 0 || x10 % u10 != 0) {
                p.g("AtomParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + x10);
                x10 = u10;
            }
        }
        this.f16064a = x10 == 0 ? -1 : x10;
        this.f16065b = uVar.x();
    }
}
