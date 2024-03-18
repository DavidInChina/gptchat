package p3;

import android.view.View;
import java.util.Arrays;
import w3.AbstractC6117y;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f42679a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f42680b;

    /* renamed from: c  reason: collision with root package name */
    public int f42681c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42682d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42683e;

    /* renamed from: f  reason: collision with root package name */
    public Object f42684f;

    public w(int i10) {
        this.f42680b = i10;
        byte[] bArr = new byte[131];
        this.f42684f = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f42682d) {
            return;
        }
        int i12 = i11 - i10;
        Object obj = this.f42684f;
        int length = ((byte[]) obj).length;
        int i13 = this.f42681c;
        if (length < i13 + i12) {
            this.f42684f = Arrays.copyOf((byte[]) obj, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, (byte[]) this.f42684f, this.f42681c, i12);
        this.f42681c += i12;
    }

    public final void b() {
        int i10;
        if (this.f42682d) {
            i10 = ((AbstractC6117y) this.f42684f).e();
        } else {
            i10 = ((AbstractC6117y) this.f42684f).f();
        }
        this.f42681c = i10;
    }

    public final void c(View view, int i10) {
        if (this.f42682d) {
            this.f42681c = ((AbstractC6117y) this.f42684f).h() + ((AbstractC6117y) this.f42684f).b(view);
        } else {
            this.f42681c = ((AbstractC6117y) this.f42684f).d(view);
        }
        this.f42680b = i10;
    }

    public final void d(View view, int i10) {
        int h10 = ((AbstractC6117y) this.f42684f).h();
        if (h10 >= 0) {
            c(view, i10);
            return;
        }
        this.f42680b = i10;
        if (this.f42682d) {
            int e10 = (((AbstractC6117y) this.f42684f).e() - h10) - ((AbstractC6117y) this.f42684f).b(view);
            this.f42681c = ((AbstractC6117y) this.f42684f).e() - e10;
            if (e10 > 0) {
                int c10 = this.f42681c - ((AbstractC6117y) this.f42684f).c(view);
                int f6 = ((AbstractC6117y) this.f42684f).f();
                int min = c10 - (Math.min(((AbstractC6117y) this.f42684f).d(view) - f6, 0) + f6);
                if (min < 0) {
                    this.f42681c = Math.min(e10, -min) + this.f42681c;
                    return;
                }
                return;
            }
            return;
        }
        int d10 = ((AbstractC6117y) this.f42684f).d(view);
        int f10 = d10 - ((AbstractC6117y) this.f42684f).f();
        this.f42681c = d10;
        if (f10 > 0) {
            int e11 = (((AbstractC6117y) this.f42684f).e() - Math.min(0, (((AbstractC6117y) this.f42684f).e() - h10) - ((AbstractC6117y) this.f42684f).b(view))) - (((AbstractC6117y) this.f42684f).c(view) + d10);
            if (e11 < 0) {
                this.f42681c -= Math.min(f10, -e11);
            }
        }
    }

    public final boolean e(int i10) {
        if (!this.f42682d) {
            return false;
        }
        this.f42681c -= i10;
        this.f42682d = false;
        this.f42683e = true;
        return true;
    }

    public final void f() {
        switch (this.f42679a) {
            case 0:
                this.f42682d = false;
                this.f42683e = false;
                return;
            default:
                this.f42680b = -1;
                this.f42681c = Integer.MIN_VALUE;
                this.f42682d = false;
                this.f42683e = false;
                return;
        }
    }

    public final void g(int i10) {
        boolean z10 = true;
        Gi.e.n(!this.f42682d);
        if (i10 != this.f42680b) {
            z10 = false;
        }
        this.f42682d = z10;
        if (z10) {
            this.f42681c = 3;
            this.f42683e = false;
        }
    }

    public final String toString() {
        switch (this.f42679a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
                sb2.append(this.f42680b);
                sb2.append(", mCoordinate=");
                sb2.append(this.f42681c);
                sb2.append(", mLayoutFromEnd=");
                sb2.append(this.f42682d);
                sb2.append(", mValid=");
                return AbstractC6463a.l(sb2, this.f42683e, '}');
            default:
                return super.toString();
        }
    }

    public w() {
        f();
    }
}
