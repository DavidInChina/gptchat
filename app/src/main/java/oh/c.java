package Oh;

import androidx.lifecycle.D;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class c extends io.sentry.vendor.b {

    /* renamed from: d  reason: collision with root package name */
    public final D f13764d;

    public c(int i10, io.sentry.vendor.b bVar, D d10) {
        super(i10, bVar, (AbstractC2469q0) null);
        this.f13764d = d10;
    }

    @Override // io.sentry.vendor.b
    public final void i(String str, int i10, String... strArr) {
        String[] strArr2;
        D d10 = this.f13764d;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str2 = strArr[i11];
                d10.getClass();
                strArr2[i11] = str2;
            }
        } else {
            strArr2 = null;
        }
        d10.getClass();
        super.i(str, i10, strArr2);
    }

    @Override // io.sentry.vendor.b
    public final void l(String str) {
        super.l(this.f13764d.j(str));
    }

    @Override // io.sentry.vendor.b
    public final void q(String str, int i10, String... strArr) {
        String[] strArr2;
        D d10 = this.f13764d;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str2 = strArr[i11];
                d10.getClass();
                strArr2[i11] = str2;
            }
        } else {
            strArr2 = null;
        }
        d10.getClass();
        super.q(str, i10, strArr2);
    }

    @Override // io.sentry.vendor.b
    public final void s(String str) {
        this.f13764d.getClass();
        super.s(str);
    }

    @Override // io.sentry.vendor.b
    public final void u(String str, String... strArr) {
        String[] strArr2 = new String[strArr.length];
        int i10 = 0;
        while (true) {
            int length = strArr.length;
            D d10 = this.f13764d;
            if (i10 < length) {
                strArr2[i10] = d10.j(strArr[i10]);
                i10++;
            } else {
                super.u(d10.j(str), strArr2);
                return;
            }
        }
    }

    @Override // io.sentry.vendor.b
    public final void w(int i10, String str, String str2) {
        this.f13764d.getClass();
        super.w(i10, str, str2);
    }

    @Override // io.sentry.vendor.b
    public final void z(String str) {
        super.z(this.f13764d.j(str));
    }
}
