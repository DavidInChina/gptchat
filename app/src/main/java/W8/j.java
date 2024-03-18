package w8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public abstract class j implements Iterator {

    /* renamed from: Z  reason: collision with root package name */
    public String f48228Z;

    /* renamed from: h0  reason: collision with root package name */
    public final CharSequence f48229h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC6140a f48230i0;

    /* renamed from: l0  reason: collision with root package name */
    public int f48233l0;

    /* renamed from: Y  reason: collision with root package name */
    public int f48227Y = 2;

    /* renamed from: k0  reason: collision with root package name */
    public int f48232k0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f48231j0 = false;

    public j(k kVar, CharSequence charSequence) {
        this.f48230i0 = kVar.f48234a;
        this.f48233l0 = kVar.f48236c;
        this.f48229h0 = charSequence;
    }

    /* renamed from: a */
    public final boolean hasNext() {
        String str;
        int a5;
        CharSequence charSequence;
        AbstractC6140a abstractC6140a;
        int i10 = this.f48227Y;
        if (i10 != 4) {
            int f6 = AbstractC6708l.f(i10);
            if (f6 == 0) {
                return true;
            }
            if (f6 == 2) {
                return false;
            }
            this.f48227Y = 4;
            int i11 = this.f48232k0;
            while (true) {
                int i12 = this.f48232k0;
                if (i12 != -1) {
                    i iVar = (i) this;
                    a5 = ((AbstractC6140a) iVar.f48226m0.f16184Z).a(i12, iVar.f48229h0);
                    charSequence = this.f48229h0;
                    if (a5 == -1) {
                        a5 = charSequence.length();
                        this.f48232k0 = -1;
                    } else {
                        this.f48232k0 = a5 + 1;
                    }
                    int i13 = this.f48232k0;
                    if (i13 == i11) {
                        int i14 = i13 + 1;
                        this.f48232k0 = i14;
                        if (i14 > charSequence.length()) {
                            this.f48232k0 = -1;
                        }
                    } else {
                        while (true) {
                            abstractC6140a = this.f48230i0;
                            if (i11 >= a5 || !abstractC6140a.b(charSequence.charAt(i11))) {
                                break;
                            }
                            i11++;
                        }
                        while (a5 > i11 && abstractC6140a.b(charSequence.charAt(a5 - 1))) {
                            a5--;
                        }
                        if (!this.f48231j0 || i11 != a5) {
                            break;
                        }
                        i11 = this.f48232k0;
                    }
                } else {
                    this.f48227Y = 3;
                    str = null;
                    break;
                }
            }
            int i15 = this.f48233l0;
            if (i15 == 1) {
                a5 = charSequence.length();
                this.f48232k0 = -1;
                while (a5 > i11 && abstractC6140a.b(charSequence.charAt(a5 - 1))) {
                    a5--;
                }
            } else {
                this.f48233l0 = i15 - 1;
            }
            str = charSequence.subSequence(i11, a5).toString();
            this.f48228Z = str;
            if (this.f48227Y == 3) {
                return false;
            }
            this.f48227Y = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final Object next() {
        if (hasNext()) {
            this.f48227Y = 2;
            String str = this.f48228Z;
            this.f48228Z = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
